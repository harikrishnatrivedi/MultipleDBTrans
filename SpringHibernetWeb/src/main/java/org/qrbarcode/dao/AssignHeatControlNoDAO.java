package org.qrbarcode.dao;

import java.util.List;

import org.qrbarcode.model.nav.AssignHeatControlNo;
import org.qrbarcode.model.nav.ItemEntry;

public abstract interface AssignHeatControlNoDAO
  extends GenericDAO<AssignHeatControlNo, Integer>
{
  public abstract void addAssignHeatControlNo(AssignHeatControlNo paramObjAssignHeatControlNo);
  
  public abstract void updateAssignHeatControlNo(AssignHeatControlNo paramObjAssignHeatControlNo);
  
  public abstract List<AssignHeatControlNo> listAssignHeatControlNo();
  
  public abstract AssignHeatControlNo getAssignHeatControlNoByIetmEntry(ItemEntry paramObjItemEntry);

  public int getMaxEntryNoFromAssignHeatControlNo();
}
