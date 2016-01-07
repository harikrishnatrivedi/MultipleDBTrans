/**
 * 
 */
package org.qrbarcode.controller;



import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.qrbarcode.model.barcode.POBarcode;
import org.qrbarcode.model.barcode.QualityParameterDetails;
import org.qrbarcode.model.barcode.QualityParameterMaster;
import org.qrbarcode.model.barcode.QualitySubTypeMaster;
import org.qrbarcode.model.barcode.QualityTest;
import org.qrbarcode.model.barcode.QualityTypeMaster;
import org.qrbarcode.service.ControlHeatUpdateService;
import org.qrbarcode.service.POBarcodeService;
import org.qrbarcode.service.QualityParameterMasterService;
import org.qrbarcode.service.QualitySubTypeMasterService;
import org.qrbarcode.service.QualityTestService;
import org.qrbarcode.service.QualityTypeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author Administrator
 *
 */

@Controller
public class QualityController {

	
	@Autowired
	  MessageSource messageSource;
	
	@Autowired
	POBarcodeService objPOBarcodeService;

	@Autowired
	QualityTypeMasterService objQualityTypeMasterService;
	
	@Autowired
	QualitySubTypeMasterService objQualitySubTYpeMasterService;
	
	@Autowired
	QualityParameterMasterService objQualityParameterMasterService;
	
	@Autowired
	ControlHeatUpdateService objControlHeatUpdateService;
	
	@Autowired
	QualityTestService objQualityTestService;
	
	@RequestMapping(value = "/qualitycheck", method = RequestMethod.GET)
	  public String scanBarCodeForLength(ModelMap model) {
		System.out.println("TESTJTJSKLFJDKLJFKDF");
		QualityTest objQualityTest = new QualityTest();
		objQualityTest.setObjQtyTypeMaster(new QualityTypeMaster());
		model.addAttribute("qualityTest", objQualityTest);
	      return "qualitytest";
	  }
	
	@RequestMapping(value = "/qualitycheck", method = RequestMethod.POST)
	  public String scanBarcodeForQualityCheck(QualityTest qualityTest, BindingResult result, ModelMap model) {
		
		
		POBarcode objPOBarcode=objPOBarcodeService.getPOBarcodeByBarcode(qualityTest.getBarCode());
		
		if(objPOBarcode==null){
			//FieldError noBarcodeFoundError=new FieldError("barCode","barCode","Barcode not found.");
	        result.addError(new FieldError("barCode","barCode","Barcode "+qualityTest.getBarCode()+" not found."));
	        return "qualitytest";
		}else{
			if(objPOBarcode.getMrnNo()==null || objPOBarcode.getMrnNo().isEmpty()){
				System.out.println("MRN Not generated");
		        result.addError(new FieldError("barCode","barCode","MRN not generated for "+qualityTest.getBarCode()+"."));
		        return "qualitytest";
			}else{
				System.out.println("barcode ************** +++++++ "+objPOBarcode.getBarCode());
				QualityTest qty=objQualityTestService.findQutalityTestByqltyBarcode(objPOBarcode.getBarCode());
				System.out.println("Check for quality check is done or not..."+qty);
				if(qty!=null ){
					result.addError(new FieldError("barCode","barCode","Quality test is already done for "+qualityTest.getBarCode()+"."));
					return "qualitytest";
				}
				
				System.out.println("MRN generated. + "+qualityTest.toString());
				
				qualityTest.setItemCode(objPOBarcode.getItem());
				qualityTest.setMrnNumber(objPOBarcode.getMrnNo());
				model.addAttribute("totalQty","Qty need to check "+(new BigDecimal(objPOBarcodeService.getTotQtyBarcodeByMRNNo(objPOBarcode.getMrnNo())/10)).setScale(0, RoundingMode.CEILING)+" out of total "+objPOBarcodeService.getTotQtyBarcodeByMRNNo(objPOBarcode.getMrnNo()));
				
//				System.out.println("Type list : "+objQualityTypeMasterService.findAllQualityTypeMaster().toString());
				
				Map<String, String> mapObjQualityType=new HashMap<String, String>();
				for(QualityTypeMaster objQualityType : objQualityTypeMasterService.findAllQualityTypeMaster() ){
					mapObjQualityType.put(objQualityType.getQtyTypeCode(), objQualityType.getQtyTypeName());
				}
				System.out.println("Size : "+mapObjQualityType.size());
				System.out.println("Data Type Map : "+mapObjQualityType.toString());
				model.addAttribute("lstAllQualityTypeMaster", mapObjQualityType);
				
				System.out.println("qualityTest.getQtyTypeCode() + is empty : "+qualityTest.getQtyTypeCode()+qualityTest.getQtyTypeCode().isEmpty());
				if(!qualityTest.getQtyTypeCode().isEmpty()){
					Map<String, String> mapObjQualitySubType=new HashMap<String, String>();
					for(QualitySubTypeMaster objQualitySubType : objQualitySubTYpeMasterService.findAllQualitySubTypeMasterByTypeCode(qualityTest.getQtyTypeCode()) ){
						mapObjQualitySubType.put(objQualitySubType.getQtySubTypeCode(), objQualitySubType.getQtySubTypeName());
					}
					System.out.println("Data Sub Type Map : "+mapObjQualitySubType.toString());
					model.addAttribute("lstAllQualitySubTypeMaster",mapObjQualitySubType);
					
				}
				if(!qualityTest.getQtySubTypeCode().isEmpty()){
					if(qualityTest.getLstObjQualityTestQualityParamDetails()==null || qualityTest.getLstObjQualityTestQualityParamDetails().isEmpty()){
						System.out.println("Parameter List");
						List<QualityParameterMaster> lst=objQualityParameterMasterService.findAllQualityParameterMasterByQualityTypeAndSubTypeCode(qualityTest.getQtyTypeCode(), qualityTest.getQtySubTypeCode());
						System.out.println("lst Parameters : "+lst);
						model.addAttribute("lstAllQualityParameter",lst);
					}else{
						System.out.println("qualityTest*********BEROFE*******"+qualityTest);
						qualityTest.setObjQtyTypeMaster(objQualityTypeMasterService.findByQualityTypeMasterCode(qualityTest.getQtyTypeCode()));
						qualityTest.setObjQtySubTypeMaster(objQualitySubTYpeMasterService.findByQualitySubTypeMasterCode(qualityTest.getQtySubTypeCode()));
						List<QualityParameterDetails> lstQPD=new ArrayList<QualityParameterDetails>();
						for(QualityParameterDetails objQualityParameterDetails : qualityTest.getLstObjQualityTestQualityParamDetails() ){
							objQualityParameterDetails.setObjQualityParameterMst(objQualityParameterMasterService.findQualityParameterMasterByQualityParamCode(objQualityParameterDetails.getQtyParamCode()));
							objQualityParameterDetails.setObjQyalityTest(qualityTest);
							System.out.println("objQualityParameterDetails ************ "+objQualityParameterDetails);
							lstQPD.add(objQualityParameterDetails);
						}
						System.out.println("lstQPD ********** ++ "+lstQPD);
						qualityTest.setLstObjQualityTestQualityParamDetails(lstQPD);
						System.out.println("qualityTest*******AFTER*********"+qualityTest);
						try {
							System.out.println("************Before controller Save******************");
							qualityTest.setQtyStatus("O");
							qualityTest.setQtyRegFlag("T");
							objControlHeatUpdateService.addQualityTestUpdatePOBarcode(qualityTest);
							System.out.println("************ater Save******************");
							return "success";
						}catch(Exception ex) {
							result.addError(new FieldError("commonError","commonError","Error occured while saving. Please contact Administrator."));
							ex.printStackTrace();
						}
					}
				}
			}
		}
	      return "qualitytest";
	  }
	
	@RequestMapping(value = "/getType", method = RequestMethod.POST)
	  public String saveQualityCheck(QualityTest qualityTest, BindingResult result, ModelMap model) {
			
		return "success";
	}
	
}
