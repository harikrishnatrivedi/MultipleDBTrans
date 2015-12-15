package org.qrbarcode.dao;

import java.util.List;
import org.qrbarcode.model.MainGRN;

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
