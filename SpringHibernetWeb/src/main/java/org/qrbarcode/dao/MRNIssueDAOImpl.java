package org.qrbarcode.dao;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.qrbarcode.model.POBarcode;
import org.qrbarcode.modelnav.MRNIssue;
import org.springframework.stereotype.Service;

@Service
public class MRNIssueDAOImpl
  extends GenericDAOImpl<MRNIssue, Integer>
  implements MRNIssueDAO
{
  public void addMRNIssue(MRNIssue paramObjMRNIssue)
  {
    currentSession2().persist(paramObjMRNIssue);
  }
  
  public void updateMRNIssue(MRNIssue paramObjMRNIssue)
  {
    currentSession2().update(paramObjMRNIssue);
  }
  
  public List<MRNIssue> listMRNIssues()
  {
    System.out.println("currentSession() : " + currentSession2());
    List<MRNIssue> lstObjMRNIssue = currentSession2().createQuery("from MRNIssue").list();
    for (MRNIssue objMRNIssue : lstObjMRNIssue) {
      System.out.println("MRNIssue List::" + objMRNIssue);
    }
    return lstObjMRNIssue;
  }
  
  /*public MRNIssue getMRNIssueById(int paramIntId)
  {
    MRNIssue objMRNIssue = (MRNIssue)currentSession2().load(MRNIssue.class, new Integer(paramIntId));
    System.out.println("MRNIssue loaded successfully, MRNIssue details=" + objMRNIssue);
    return objMRNIssue;
  }*/
  
  public MRNIssue getMRNIssueByEntryNo(int paramIntEntryNo) {
	  
    /* MRNIssue objMRNIssue = (MRNIssue)currentSession2().load(MRNIssue.class, new Integer(paramIntEntryNo));
    System.out.println("MRNIssue loaded successfully, MRNIssue details=" + objMRNIssue);*/
	Query query = currentSession2().createQuery("from MRNIssue where entryNo = : entryNo");
	query.setParameter("entryNo", paramIntEntryNo);
	MRNIssue objMRNIssue = (MRNIssue)query.uniqueResult();
    return objMRNIssue;
  }
  
  public void removeMRNIssue(int paramIntId) {
	  
    MRNIssue objMRNIssue = (MRNIssue)currentSession2().load(MRNIssue.class, new Integer(paramIntId));
    if (objMRNIssue != null) {
      currentSession().delete(objMRNIssue);
    }
    System.out.println("MRNIssue deleted successfully, MRNIssue details=" + objMRNIssue);
  }
  
}
