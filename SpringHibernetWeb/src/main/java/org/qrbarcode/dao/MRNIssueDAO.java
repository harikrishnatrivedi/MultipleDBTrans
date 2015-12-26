package org.qrbarcode.dao;

import java.util.List;

import org.qrbarcode.model.nav.MRNIssue;

public abstract interface MRNIssueDAO
  extends GenericDAO<MRNIssue, Integer>
{
  public abstract void addMRNIssue(MRNIssue paramObjMRNIssue);
  
  public abstract void updateMRNIssue(MRNIssue paramObjMRNIssue);
  
  public abstract List<MRNIssue> listMRNIssues();
  
  //public abstract MRNIssue getMRNIssueById(int paramIntId);
  
  public abstract void removeMRNIssue(int paramIntId);
  
  public abstract MRNIssue getMRNIssueByEntryNo(int paramIntEntryNo);
  
}
