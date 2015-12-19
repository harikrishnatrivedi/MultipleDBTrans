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
	  
  public void updateLengthBarcodeDS(POBarcode paramObjPOBarcode, MainGRN paramObjMainGRN) throws Exception
  {
	  try {
		  objPoBarcodeDAO.updatePOBarcode(paramObjPOBarcode);
		  objMainGrnDAO.updateMainGRN(paramObjMainGRN);
		  System.out.println("Lenth is updated in Barcode DS successfully.");
	  }catch(Exception ex){
		  ex.printStackTrace();
		  throw ex;
	  }
  }
  
  public void updateLengthNAVDS(MRNIssue paramObjMRNIssue) throws Exception
  {
	  try {
		  objMRNIssueDAO.updateMRNIssue(paramObjMRNIssue);
		  System.out.println("Lenth is updated in NAV DS successfully.");
	  }catch(Exception ex){
		  ex.printStackTrace();
		  throw ex;
	  }
  }
  
  public POBarcode updateLengthGetPOBarcode(String paramStrBarcode) {
	return objPoBarcodeDAO.getPOBarcodeByBarcode(paramStrBarcode);
  }
  
  public BigDecimal updateLengthGetSumOfPOBarcodeLengthByDocNo(int paramIntDocNo) {
	  return objPoBarcodeDAO.getSumOfPOBarcodeLengthByDocNo(paramIntDocNo);
  }
  
  public MainGRN updateLengthGetMainGRNByDocNo(int paramIntDocNo) {
	  return objMainGrnDAO.getMainGRNByDocNo(paramIntDocNo);
  }
  
  public MRNIssue updateLengthGetMRNIssueByEntryNo(int paramIntDocNo) {
	  return objMRNIssueDAO.getMRNIssueByEntryNo(paramIntDocNo);
  }
  
  
  
}
