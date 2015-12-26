package org.qrbarcode.dao;


import java.util.List;


import org.hibernate.Query;
import org.qrbarcode.model.barcode.MainGRN;
import org.springframework.stereotype.Service;

@Service
public class MainGRNDAOImpl
  extends GenericDAOImpl<MainGRN, Integer>
  implements MainGRNDAO
{
  public void addMainGRN(MainGRN paramObjMainGRN)
  {
	  currentPrimarySession().persist(paramObjMainGRN);
  }
  
  public void updateMainGRN(MainGRN paramObjMainGRN)
  {
	  currentPrimarySession().update(paramObjMainGRN);
  }
  
  @SuppressWarnings("unchecked")
  public List<MainGRN> listMainGRN()
  {
    System.out.println("currentSession() : " + currentPrimarySession());
    
	List<MainGRN> lstObjMainGRNs = currentPrimarySession().createQuery("from Main_Grn").list();
    /*for (MainGRN objMainGRN : lstObjMainGRNs) {
      System.out.println("POBarcode List::" + objMainGRN);
    }*/
    return lstObjMainGRNs;
  }
  
  public MainGRN getMainGRNById(int paramIntId)
  {
    MainGRN objMainGRN = (MainGRN)currentPrimarySession().load(MainGRN.class, new Integer(paramIntId));
    System.out.println("MainGRN loaded successfully, MainGRN details=" + objMainGRN);
    return objMainGRN;
  }
  
  public void removeMainGRN(int paramIntId)
  {
    MainGRN objMainGRN = (MainGRN)currentPrimarySession().load(MainGRN.class, new Integer(paramIntId));
    if (objMainGRN != null) {
    	currentPrimarySession().delete(objMainGRN);
    }else{
    	try{
    	throw new Exception("NoRecordFoundToRemove.");
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    }
    System.out.println("MainGRN deleted successfully, MainGRN details");
  }

  public MainGRN getMainGRNByDocNo(int paramIntDocNo) {
	  Query query = currentPrimarySession().createQuery("from MainGRN where Docno = :docNo");
	  query.setParameter("docNo", paramIntDocNo);
	  return (MainGRN) query.list().get(0);  
  }
  
  
}
