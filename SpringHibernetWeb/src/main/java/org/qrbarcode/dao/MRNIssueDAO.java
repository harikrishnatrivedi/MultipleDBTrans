package org.qrbarcode.dao;

import java.math.BigDecimal;
import java.util.List;
import org.qrbarcode.modelnav.MRNIssue;

public abstract interface MRNIssueDAO
  extends GenericDAO<MRNIssue, Integer>
{
  public abstract void addMRNIssue(MRNIssue paramObjMRNIssue);
  
  public abstract void updateMRNIssue(MRNIssue paramObjPOBarcode);
  
  public abstract List<MRNIssue> listMRNIssues();
  
  //public abstract MRNIssue getMRNIssueById(int paramIntId);
  
  public abstract void removeMRNIssue(int paramIntId);
  
  public abstract MRNIssue getMRNIssueByEntryNo(int paramIntEntryNo);
  
}
