package org.qrbarcode.dao;


import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.qrbarcode.model.nav.AssignHeatControlNo;
import org.qrbarcode.model.nav.ItemEntry;
import org.springframework.stereotype.Service;

@Service
public class AssignHeatControlNoDAOImpl
  extends GenericDAOImpl<AssignHeatControlNo, Integer>
  implements AssignHeatControlNoDAO
{
  public void addAssignHeatControlNo(AssignHeatControlNo paramObjAssignHeatControlNo)
  {
	  currentSecondarySession().persist(paramObjAssignHeatControlNo);
  }
  
  public void updateAssignHeatControlNo(AssignHeatControlNo paramObjAssignHeatControlNo)
  {
	  currentSecondarySession().update(paramObjAssignHeatControlNo);
  }
  
  @SuppressWarnings("unchecked")
  public List<AssignHeatControlNo> listAssignHeatControlNo()
  {
	List<AssignHeatControlNo> lstObjAssignHeatControlNo = currentSecondarySession().createQuery("from AssignHeatControlNo").list();
    for (AssignHeatControlNo objAssignHeatControlNo : lstObjAssignHeatControlNo) {
      System.out.println("AssignHeatControl List::" + objAssignHeatControlNo);
    }
    return lstObjAssignHeatControlNo;
  }
  
  public AssignHeatControlNo getAssignHeatControlNoByIetmEntry(ItemEntry paramObjItemEntry) {
	  
	Query query = currentSecondarySession().createQuery("from AssignHeatControlNo where itemNo= :itemNo and entryNo= :entryNo");
	query.setParameter("itemNo", paramObjItemEntry.getItemNo());
	query.setParameter("entryNo", paramObjItemEntry.getEntryNo());
	AssignHeatControlNo objAssignHeatControlNo = (AssignHeatControlNo)query.uniqueResult();
    return objAssignHeatControlNo;
  }
 
  public int getMaxEntryNoFromAssignHeatControlNo(){
	  return Integer.parseInt(currentSecondarySession().createCriteria(AssignHeatControlNo.class).setProjection(Projections.max("objItemEntry.entryNo")).uniqueResult().toString())+1;
  }
  
}
