package org.qrbarcode.dao;

import org.qrbarcode.model.barcode.MainGRN;

public abstract interface MainGRNDAO
  extends GenericDAO<MainGRN, Integer>
{
  /*public abstract void addMainGRN(MainGRN paramObjMainGRN);*/
  
  public abstract void updateMainGRN(MainGRN paramObjMainGRN);
  /*
  public abstract List<MainGRN> listPOBarcodes();
  
  public abstract MainGRN getMainGRNById(int paramIntId);
  
  public abstract void removeMainGRN(int paramIntId);*/
  
  public abstract MainGRN getMainGRNByDocNo(int paramIntDocNo);
}
