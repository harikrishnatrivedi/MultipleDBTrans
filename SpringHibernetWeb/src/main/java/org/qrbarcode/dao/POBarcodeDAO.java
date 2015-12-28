package org.qrbarcode.dao;

import java.math.BigDecimal;
import java.util.List;

import org.qrbarcode.model.barcode.POBarcode;

public abstract interface POBarcodeDAO
  extends GenericDAO<POBarcode, Integer>
{
  public abstract void addPOBarcode(POBarcode paramObjPOBarcode);
  
  public abstract void updatePOBarcode(POBarcode paramObjPOBarcode);
  
  public abstract List<POBarcode> listPOBarcodes();
  
  public abstract POBarcode getPOBarcodeById(int paramIntId);
  
  public abstract void removePOBarcode(int paramIntId);
  
  public abstract POBarcode getPOBarcodeByBarcode(String paramStringBarcode);
  
  public abstract BigDecimal getSumOfPOBarcodeLengthByDocNo(int paramIntDocNo);
  
  public abstract int getTotQtyBarcodeByMRNNo(String paramIntMrnNo);
}
