package org.qrbarcode.dao;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.qrbarcode.model.POBarcode;
import org.springframework.stereotype.Service;

@Service
public class POBarcodeDAOImpl
  extends GenericDAOImpl<POBarcode, Integer>
  implements POBarcodeDAO
{
  public void addPOBarcode(POBarcode paramObjPOBarcode)
  {
    currentSession().persist(paramObjPOBarcode);
  }
  
  public void updatePOBarcode(POBarcode paramObjPOBarcode)
  {
    currentSession().update(paramObjPOBarcode);
  }
  
  public List<POBarcode> listPOBarcodes()
  {
    System.out.println("currentSession() : " + currentSession());
    List<POBarcode> pOBarcodesList = currentSession().createQuery("from POBarcode where status = :status").setParameter("status", "O").list();
    for (POBarcode p : pOBarcodesList) {
      System.out.println("POBarcode List::" + p);
    }
    return pOBarcodesList;
  }
  
  public POBarcode getPOBarcodeById(int paramIntId)
  {
    POBarcode p = (POBarcode)currentSession().load(POBarcode.class, new Integer(paramIntId));
    System.out.println("POBarcode loaded successfully, pobarcode details=" + p);
    return p;
  }
  
  public void removePOBarcode(int paramIntId)
  {
    POBarcode p = (POBarcode)currentSession().load(POBarcode.class, new Integer(paramIntId));
    if (p != null) {
      currentSession().delete(p);
    }
    System.out.println("POBarcode deleted successfully, POBarcode details=" + p);
  }
  
  public POBarcode getPOBarcodeByBarcode(String paramStringBarcode)
  {
	 Query query = currentSession().createQuery("from POBarcode where barCode = :barCode AND status = :status");
	 query.setParameter("barCode", paramStringBarcode);
	 query.setParameter("status", "O");
	 List<POBarcode> lstPOBarcode=query.list();
	 POBarcode objPOBarcode=null;
	 if(lstPOBarcode.isEmpty())
		 return objPOBarcode;
	 else 
		 return (POBarcode)query.list().get(0);
  }

  public BigDecimal getSumOfPOBarcodeLengthByDocNo(int paramIntDocNo) {
	  String hqlQuery="select sum(length) as totlength from POBarcode p where p.docNo = :docNo and p.status = :status";
	  Query query = currentSession().createQuery(hqlQuery);
	  query.setParameter("docNo", paramIntDocNo);
	  query.setParameter("status", "O");
	  return new BigDecimal(query.uniqueResult().toString());
  }
  
}
