package org.qrbarcode.dao;

import java.util.List;
import org.qrbarcode.model.POBarcode;

public abstract interface POBarcodeDAO
  extends GenericDAO<POBarcode, Integer>
{
  public abstract void addPOBarcode(POBarcode paramObjPerson);
  
  public abstract void updatePOBarcode(POBarcode paramObjPerson);
  
  public abstract List<POBarcode> listPOBarcodes();
  
  public abstract POBarcode getPOBarcodeById(int paramIntId);
  
  public abstract void removePOBarcode(int paramIntId);
  
  public abstract POBarcode getPOBarcodeByBarcode(String paramStringBarcode);
}
