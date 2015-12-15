package org.qrbarcode.dao;

import java.io.PrintStream;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.qrbarcode.model.MainGRN;
import org.springframework.stereotype.Service;

@Service
public class MainGRNDAOImpl
  extends GenericDAOImpl<MainGRN, Integer>
  implements MainGRNDAO
{
  public void addMainGRN(MainGRN paramObjMainGRN)
  {
    currentSession().persist(paramObjMainGRN);
  }
  
  public void updateMainGRN(MainGRN paramObjMainGRN)
  {
    currentSession().update(paramObjMainGRN);
  }
  
  public List<MainGRN> listMainGRN()
  {
    System.out.println("currentSession() : " + currentSession());
    List<MainGRN> lstObjMainGRNs = currentSession().createQuery("from Main_Grn").list();
    /*for (MainGRN objMainGRN : lstObjMainGRNs) {
      System.out.println("POBarcode List::" + objMainGRN);
    }*/
    return lstObjMainGRNs;
  }
  
  public MainGRN getMainGRNById(int paramIntId)
  {
    MainGRN objMainGRN = (MainGRN)currentSession().load(MainGRN.class, new Integer(paramIntId));
    System.out.println("MainGRN loaded successfully, MainGRN details=" + objMainGRN);
    return objMainGRN;
  }
  
  public void removeMainGRN(int paramIntId)
  {
    MainGRN objMainGRN = (MainGRN)currentSession().load(MainGRN.class, new Integer(paramIntId));
    if (objMainGRN != null) {
      currentSession().delete(objMainGRN);
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
	  Query query = currentSession().createQuery("from Main_Grn where Docno = :docNo");
	  query.setParameter("docNo", paramIntDocNo);
	  return (MainGRN) query.list().get(0);  
  }
  
  
}
