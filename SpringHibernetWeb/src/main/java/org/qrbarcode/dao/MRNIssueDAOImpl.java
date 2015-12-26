package org.qrbarcode.dao;


import java.util.List;

import org.hibernate.Query;
import org.qrbarcode.model.nav.MRNIssue;
import org.springframework.stereotype.Service;

@Service
public class MRNIssueDAOImpl
  extends GenericDAOImpl<MRNIssue, Integer>
  implements MRNIssueDAO
{
  public void addMRNIssue(MRNIssue paramObjMRNIssue)
  {
	  currentSecondarySession().persist(paramObjMRNIssue);
  }
  
  public void updateMRNIssue(MRNIssue paramObjMRNIssue)
  {
	  currentSecondarySession().update(paramObjMRNIssue);
  }
  
  @SuppressWarnings("unchecked")
  public List<MRNIssue> listMRNIssues()
  {
	List<MRNIssue> lstObjMRNIssue = currentSecondarySession().createQuery("from MRNIssue").list();
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
	Query query = currentSecondarySession().createQuery("from MRNIssue where entryNo = :entryNo");
	query.setParameter("entryNo", paramIntEntryNo);
	MRNIssue objMRNIssue = (MRNIssue)query.uniqueResult();
    return objMRNIssue;
  }
  
  public void removeMRNIssue(int paramIntId) {
	  
    MRNIssue objMRNIssue = (MRNIssue)currentSecondarySession().load(MRNIssue.class, new Integer(paramIntId));
    if (objMRNIssue != null) {
    	currentSecondarySession().delete(objMRNIssue);
    }
    System.out.println("MRNIssue deleted successfully, MRNIssue details=" + objMRNIssue);
  }
  
}
