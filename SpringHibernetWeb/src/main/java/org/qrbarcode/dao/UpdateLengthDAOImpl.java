package org.qrbarcode.dao;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.qrbarcode.model.MainGRN;
import org.qrbarcode.model.POBarcode;
import org.qrbarcode.model.UpdateLength;
import org.qrbarcode.modelnav.MRNIssue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateLengthDAOImpl
  /*extends GenericDAOImpl<Person, Integer>*/
  implements UpdateLengthDAO
{
	  @Autowired
	  private POBarcodeDAO objPoBarcodeDAO;
	  
	  @Autowired
	  private MainGRNDAO objMainGrnDAO;
	  
	  @Autowired
	  private MRNIssueDAO objMRNIssueDAO;
	  
  public void updateLength(UpdateLength objUpdateLength) throws Exception
  {
	  try {
		  POBarcode objPOBarcode=objPoBarcodeDAO.getPOBarcodeByBarcode(objUpdateLength.getBarCode());
		  if(objPOBarcode==null){
			  throw new Exception("BarcodeNotFound");
		  }else{
			  if(objPOBarcode.getMrnNo()!=null){
				  throw new Exception("MRNGenerated");
			  }else{
				  if(objUpdateLength.getLength().compareTo(objUpdateLength.getOldLength())==0) {
					  throw new Exception("NoUpdate");
				  }else{
					  MainGRN objMainGRN = objMainGrnDAO.getMainGRNByDocNo(objPOBarcode.getDocNo());
					  BigDecimal objBigDecTotLengthInPOBarcode=objPoBarcodeDAO.getSumOfPOBarcodeLengthByDocNo(objPOBarcode.getDocNo());
					  MRNIssue objMRNIssue=objMRNIssueDAO.getMRNIssueByEntryNo(objPOBarcode.getDocNo());
					  if(objMainGRN.getQuantity().compareTo(objBigDecTotLengthInPOBarcode)!=0 && objMainGRN.getQuantity().compareTo(objMRNIssue.getQtyM())!=0){
						  throw new Exception("TotalLengthMismatch");
					  } else {
						  objPOBarcode.setLength(objUpdateLength.getLength());
						  objPoBarcodeDAO.updatePOBarcode(objPOBarcode);
						  objMainGRN.setQuantity(objMainGRN.getQuantity().add(objUpdateLength.getLength()));
						  objMainGrnDAO.updateMainGRN(objMainGRN);
						  objMRNIssue.setQtyM(objMRNIssue.getQtyM().add(objUpdateLength.getLength()));
						  System.out.println("Lenth is updated successfully.");
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
