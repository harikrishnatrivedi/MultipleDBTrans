package org.qrbarcode.service;

import java.math.BigDecimal;
import java.util.List;
import org.qrbarcode.dao.UpdateLengthDAO;
import org.qrbarcode.model.MainGRN;
import org.qrbarcode.model.POBarcode;
import org.qrbarcode.model.Person;
import org.qrbarcode.model.UpdateLength;
import org.qrbarcode.modelnav.MRNIssue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class UpdateLengthServiceImpl
  implements UpdateLengthService
{
  @Autowired
  private UpdateLengthDAO objUpdateLengthDAO;
  
  
  public void updateLength(UpdateLength paramObjupdateLength) throws Exception{
	  try {
		  if(paramObjupdateLength.getLength().compareTo(paramObjupdateLength.getOldLength())==0) {
			  throw new Exception("No update in length.");
		  }else{
			  POBarcode objPOBarcode=updateLengthGetPOBarcode(paramObjupdateLength);
			  
			  if(objPOBarcode==null){
				  throw new Exception("Barcode Not Found");
			  }else{
				  if(objPOBarcode.getMrnNo()!=null){
					  throw new Exception("MRN already generated");
				  }else{
					  BigDecimal objBigDecimalTotLength=updateLengthGetSumOfPOBarcodeLengthByDocNo(objPOBarcode.getDocNo());
					  MainGRN objMainGRN=updateLengthGetMainGRNByDocNo(objPOBarcode.getDocNo());
					  MRNIssue objMRNIssue=updateLengthGetMRNIssueByEntryNo(objPOBarcode.getDocNo());
					  if(objMainGRN.getQuantity().compareTo(objBigDecimalTotLength)!=0 && objMainGRN.getQuantity().compareTo(objMRNIssue.getQtyM())!=0){
						  throw new Exception("TotalLengthMismatch");
					  }else{
						  objPOBarcode.setLength(paramObjupdateLength.getLength());
						  objMainGRN.setQuantity(objMainGRN.getQuantity().add(paramObjupdateLength.getLength()));
						  objMRNIssue.setQtyM(objMRNIssue.getQtyM().add(paramObjupdateLength.getLength()));
						  if(updateLengthBarcodeDS(objPOBarcode, objMainGRN)&&updateLengthNAVDS(objMRNIssue)){
							  System.out.println("Lenth is updated successfully in both DS.");  
						  } else {
							  System.out.println("Lenth is not updated successfully in both DS.");
						  }
						  
					  }
				  }
			  }
		  }
	  }catch(Exception ex){
		  ex.printStackTrace();
		  throw ex;
	  }
  }  
  
  @Transactional
  @Qualifier("txPrimary")
  public POBarcode updateLengthGetPOBarcode(UpdateLength paramObjupdateLength) {
	  return objUpdateLengthDAO.updateLengthGetPOBarcode(paramObjupdateLength);
  }
  
  @Transactional
  @Qualifier("txPrimary")
  public BigDecimal updateLengthGetSumOfPOBarcodeLengthByDocNo(int paramIntDocNo) {
	  return objUpdateLengthDAO.updateLengthGetSumOfPOBarcodeLengthByDocNo(paramIntDocNo);
  }
  
  @Transactional
  @Qualifier("txPrimary")
  public MainGRN updateLengthGetMainGRNByDocNo(int paramIntDocNo) {
	  return objUpdateLengthDAO.updateLengthGetMainGRNByDocNo(paramIntDocNo);
  }
  
  @Transactional("transactionManager")
  public boolean updateLengthBarcodeDS(POBarcode paramObjPOBarcode, MainGRN paramObjMainGRN) throws Exception{
	  try {
	  objUpdateLengthDAO.updateLengthBarcodeDS(paramObjPOBarcode, paramObjMainGRN);
	  }catch(Exception ex){
		  throw ex;
	  }
	  return true;
  }
  
  @Transactional("transactionManager2")
  public boolean updateLengthNAVDS(MRNIssue paramObjMRNIssue) throws Exception
  {
	  try {
		  objUpdateLengthDAO.updateLengthNAVDS(paramObjMRNIssue);
		  System.out.println("Lenth is updated in NAV DS successfully.");
	  }catch(Exception ex){
		  ex.printStackTrace();
		  throw ex;
	  }
	  return true;
  }
  
  @Transactional("transactionManager2")
  public MRNIssue updateLengthGetMRNIssueByEntryNo(int paramIntDocNo) {
	  return objUpdateLengthDAO.updateLengthGetMRNIssueByEntryNo(paramIntDocNo);
  }
  
}
