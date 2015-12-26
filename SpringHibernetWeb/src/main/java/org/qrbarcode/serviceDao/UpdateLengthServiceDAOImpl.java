package org.qrbarcode.serviceDao;


import java.math.BigDecimal;

import org.qrbarcode.model.UpdateLength;
import org.qrbarcode.model.barcode.MainGRN;
import org.qrbarcode.model.barcode.POBarcode;
import org.qrbarcode.model.nav.MRNIssue;
import org.qrbarcode.dao.GenericDAOImpl;
import org.qrbarcode.dao.MRNIssueDAO;
import org.qrbarcode.dao.MainGRNDAO;
import org.qrbarcode.dao.POBarcodeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateLengthServiceDAOImpl
  extends GenericDAOImpl<Object, Integer>
  implements UpdateLengthServiceDAO
{
	  @Autowired
	  private POBarcodeDAO objPoBarcodeDAO;
	  
	  @Autowired
	  private MainGRNDAO objMainGrnDAO;
	  
	  @Autowired
	  private MRNIssueDAO objMRNIssueDAO;
	  
  public void updateLength(UpdateLength paramObjUpdateLength) throws Exception
  {
	  try {
		  if(paramObjUpdateLength.getLength().compareTo(paramObjUpdateLength.getOldLength())==0) {
			  throw new Exception("No update in length.");
		  }else{
			  POBarcode objPOBarcode=objPoBarcodeDAO.getPOBarcodeByBarcode(paramObjUpdateLength.getBarCode());
			  if(objPOBarcode==null){
				  throw new Exception("Barcode Not Found");
			  }else{
				  if(objPOBarcode.getMrnNo()!=null){
					  throw new Exception("MRN already generated");
				  }else{
					  BigDecimal objBigDecimalTotLength=objPoBarcodeDAO.getSumOfPOBarcodeLengthByDocNo(objPOBarcode.getDocNo());
					  MainGRN objMainGRN=objMainGrnDAO.getMainGRNByDocNo(objPOBarcode.getDocNo());
					  MRNIssue objMRNIssue=objMRNIssueDAO.getMRNIssueByEntryNo(objPOBarcode.getDocNo());
					  if(objMainGRN.getQuantity().compareTo(objBigDecimalTotLength)!=0 && objMainGRN.getQuantity().compareTo(objMRNIssue.getQtyM())!=0){
						  throw new Exception("TotalLengthMismatch");
					  }else{
						  objPOBarcode.setLength(paramObjUpdateLength.getLength());
						  objMainGRN.setQuantity(objMainGRN.getQuantity().add(paramObjUpdateLength.getLength()));
						  objMRNIssue.setQtyM(objMRNIssue.getQtyM().add(paramObjUpdateLength.getLength()));
						  objPoBarcodeDAO.saveOrUpdate(objPOBarcode, currentPrimarySession());
						  //objPoBarcodeDAO.updatePOBarcode(objPOBarcode);
						  objMainGrnDAO.saveOrUpdate(objMainGRN, currentPrimarySession());
						  //objMainGrnDAO.updateMainGRN(objMainGRN);
						  objMRNIssueDAO.saveOrUpdate(objMRNIssue, currentSecondarySession());
						  //objMRNIssueDAO.updateMRNIssue(objMRNIssue);
					  }
				  }
			  }
		  }
	  }catch(Exception ex){
		  ex.printStackTrace();
		  throw ex;
	  }
  }
}
