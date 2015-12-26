package org.qrbarcode.dao;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.qrbarcode.model.barcode.POBarcode;
import org.springframework.stereotype.Service;

@Service
public class POBarcodeDAOImpl
  extends GenericDAOImpl<POBarcode, Integer>
  implements POBarcodeDAO
{
  public void addPOBarcode(POBarcode paramObjPOBarcode)
  {
	  currentPrimarySession().persist(paramObjPOBarcode);
  }
  
  public void updatePOBarcode(POBarcode paramObjPOBarcode)
  {
	  currentPrimarySession().update(paramObjPOBarcode);
  }
  
  @SuppressWarnings("unchecked")
  public List<POBarcode> listPOBarcodes()
  {
    
	List<POBarcode> pOBarcodesList = currentPrimarySession().createQuery("from POBarcode where status = :status").setParameter("status", "O").list();
    for (POBarcode p : pOBarcodesList) {
      System.out.println("POBarcode List::" + p);
    }
    return pOBarcodesList;
  }
  
  public POBarcode getPOBarcodeById(int paramIntId)
  {
    POBarcode p = (POBarcode)currentPrimarySession().load(POBarcode.class, new Integer(paramIntId));
    System.out.println("POBarcode loaded successfully, pobarcode details=" + p);
    return p;
  }
  
  public void removePOBarcode(int paramIntId)
  {
    POBarcode p = (POBarcode)currentPrimarySession().load(POBarcode.class, new Integer(paramIntId));
    if (p != null) {
    	currentPrimarySession().delete(p);
    }
    System.out.println("POBarcode deleted successfully, POBarcode details=" + p);
  }
  
  public POBarcode getPOBarcodeByBarcode(String paramStringBarcode)
  {
	 Query query = currentPrimarySession().createQuery("from POBarcode where barCode = :barCode AND status = :status");
	 query.setParameter("barCode", paramStringBarcode);
	 query.setParameter("status", "O");
	 return (POBarcode)query.uniqueResult();
  }

  public BigDecimal getSumOfPOBarcodeLengthByDocNo(int paramIntDocNo) {
	  String hqlQuery="select sum(length) as totlength from POBarcode p where p.docNo = :docNo and p.status = :status";
	  Query query = currentPrimarySession().createQuery(hqlQuery);
	  query.setParameter("docNo", paramIntDocNo);
	  query.setParameter("status", "O");
	  return new BigDecimal(query.uniqueResult().toString());
  }
  
}
