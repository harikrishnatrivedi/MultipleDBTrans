package org.qrbarcode.service;

import java.util.List;
import org.qrbarcode.model.POBarcode;

public abstract interface POBarcodeService
{
  public abstract void addPOBarcode(POBarcode paramPOBarcodeObj);
  
  public abstract void updatePOBarcode(POBarcode paramPOBarcodeObj);
  
  public abstract List<POBarcode> listPOBarcodes();
  
  public abstract POBarcode getPOBarcodeById(int paramIntId);
  
  public abstract void removePOBarcode(int paramIntId);
  
  public abstract POBarcode getPOBarcodeByBarcode(String paramStringBarcode);
}
