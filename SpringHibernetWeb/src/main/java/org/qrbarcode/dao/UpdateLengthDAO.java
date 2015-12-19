package org.qrbarcode.dao;

import java.math.BigDecimal;
import java.util.List;

import org.qrbarcode.model.POBarcode;
import org.qrbarcode.model.UpdateLength;
import org.qrbarcode.modelnav.MRNIssue;
import org.qrbarcode.model.MainGRN;

public abstract interface UpdateLengthDAO
  /*extends GenericDAO<ModelName, Integer>*/
{
  
  public abstract void updateLengthBarcodeDS(POBarcode paramObjPOBarcode, MainGRN paramObjMainGRN) throws Exception;
  
  public abstract void updateLengthNAVDS(MRNIssue paramObjMRNIssue) throws Exception;
  
  public abstract POBarcode updateLengthGetPOBarcode(UpdateLength paramObjupdateLength);
  
  public abstract BigDecimal updateLengthGetSumOfPOBarcodeLengthByDocNo(int paramIntDocNo);
  
  public abstract MainGRN updateLengthGetMainGRNByDocNo(int paramIntDocNo);
  
  public abstract MRNIssue updateLengthGetMRNIssueByEntryNo(int paramIntDocNo);
  
  /*public abstract boolean checkMRN(String strBarcode);
  
  public abstract void updatePerson(UpdateLength paramPerson);
  
  public abstract List<Person> listPersons();
  
  public abstract Person getPersonById(int paramInt);
  
  public abstract void removePerson(int paramInt);*/
}
