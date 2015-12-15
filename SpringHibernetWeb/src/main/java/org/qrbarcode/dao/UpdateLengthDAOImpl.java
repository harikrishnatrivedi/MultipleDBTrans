package org.qrbarcode.dao;

import java.io.PrintStream;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.qrbarcode.model.MainGRN;
import org.qrbarcode.model.POBarcode;
import org.qrbarcode.model.UpdateLength;
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
	  
  public void updateLength(UpdateLength objUpdateLength) throws Exception
  {
	  try {
		  POBarcode objPOBarcode=objPoBarcodeDAO.getPOBarcodeByBarcode(objUpdateLength.getBarCode());
		  if(objPOBarcode!=null){
			  if(objPOBarcode.getMrnNo()==null){
				  throw new Exception("MRNGenerated");
			  }else{
				  objPOBarcode.setLength(objUpdateLength.getLength());
				  objPoBarcodeDAO.updatePOBarcode(objPOBarcode);
				  MainGRN objMainGRN = objMainGrnDAO.getMainGRNByDocNo(objPOBarcode.getDocNo());
				  objMainGRN.setQuantity(objUpdateLength.getLength());
			  }
		  }else{
			  throw new Exception("BarcodeNotFound");
		  }
	  }catch(Exception ex){
		  throw ex;
	  }
  }
  
  public boolean checkMRN(String strPOBarcode) {
	  return true;
  }
  
  
}
