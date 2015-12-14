package org.qrbarcode.dao;

import java.io.PrintStream;
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
  public void addPOBarcode(POBarcode p)
  {
    currentSession2().persist(p);
  }
  
  public void updatePOBarcode(POBarcode p)
  {
    currentSession().update(p);
  }
  
  public List<POBarcode> listPOBarcodes()
  {
    System.out.println("currentSession() : " + currentSession());
    List<POBarcode> pOBarcodesList = currentSession().createQuery("from Po_barcode").list();
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
	 Query query = currentSession().createQuery("from po_barcode where barCode = :paramStringBarcode");
	 query.setParameter("paramStringBarcode", paramStringBarcode);
	 return (POBarcode)query.list().get(0);
  }
  
}
