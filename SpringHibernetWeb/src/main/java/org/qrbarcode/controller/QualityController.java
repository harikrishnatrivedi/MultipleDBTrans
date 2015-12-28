/**
 * 
 */
package org.qrbarcode.controller;



import org.qrbarcode.model.barcode.POBarcode;
import org.qrbarcode.model.barcode.QualityParameterMaster;
import org.qrbarcode.service.POBarcodeService;
import org.qrbarcode.service.QualitySubTypeMasterService;
import org.qrbarcode.service.QualityTypeMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	QualityTypeMasterService objQualityTYpeMasterService;
	
	@Autowired
	QualitySubTypeMasterService objQualitySubTYpeMasterService;
	
	
	@RequestMapping(value = "/qualitycheck", method = RequestMethod.GET)
	  public String scanBarCodeForLength(ModelMap model) {
		
	      return "qualitycheck";
	  }
	
	@RequestMapping(value = "/qualitycheck", method = RequestMethod.POST)
	  public String scanBarcodeForQualityCheck(ModelMap model, BindingResult result, @RequestParam String strBarCode) {
		
		POBarcode objPOBarcode=objPOBarcodeService.getPOBarcodeByBarcode(strBarCode);
		int totQty=-1;
		if(objPOBarcode==null){
			FieldError noBarcodeFoundError=new FieldError("barcode","barCode","Barcode not found.");
	        result.addError(noBarcodeFoundError);
			return "qualitycheck";
		}else{
			if(objPOBarcode.getMrnNo().isEmpty()){
				FieldError noMRNGenerated=new FieldError("barcode","barCode","MRN not generated.");
		        result.addError(noMRNGenerated);
		        return "qualitycheck";
			}else{
				totQty=objPOBarcodeService.getTotQtyBarcodeByMRNNo(objPOBarcode.getMrnNo());
				objQualityTYpeMasterService.findAllQualityTypeMaster();
				
				
			}
		}
	      return "qualitycheck";
	  }
	
}
