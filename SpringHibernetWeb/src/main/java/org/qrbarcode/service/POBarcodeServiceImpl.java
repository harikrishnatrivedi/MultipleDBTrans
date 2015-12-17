package org.qrbarcode.service;

import java.util.List;
import org.qrbarcode.dao.POBarcodeDAO;
import org.qrbarcode.model.POBarcode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class POBarcodeServiceImpl
  implements POBarcodeService
{
  @Autowired
  private POBarcodeDAO pOBarcodeDAO;
  
  public void addPOBarcode(POBarcode p)
  {
    this.pOBarcodeDAO.addPOBarcode(p);
  }
  
  public void updatePOBarcode(POBarcode p)
  {
    this.pOBarcodeDAO.updatePOBarcode(p);
  }
  
  public List<POBarcode> listPOBarcodes()
  {
    return this.pOBarcodeDAO.listPOBarcodes();
  }
  
  public POBarcode getPOBarcodeById(int id)
  {
    return this.pOBarcodeDAO.getPOBarcodeById(id);
  }
  
  public void removePOBarcode(int id)
  {
    this.pOBarcodeDAO.removePOBarcode(id);
  }
  
  public POBarcode getPOBarcodeByBarcode(String barcode)
  {
    return this.pOBarcodeDAO.getPOBarcodeByBarcode(barcode);
  }
}
