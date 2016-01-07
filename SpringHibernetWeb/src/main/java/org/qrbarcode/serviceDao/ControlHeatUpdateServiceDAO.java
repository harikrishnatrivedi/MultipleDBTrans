package org.qrbarcode.serviceDao;



import org.qrbarcode.dao.GenericDAO;
import org.qrbarcode.model.barcode.QualityTest;

public abstract interface ControlHeatUpdateServiceDAO
  extends GenericDAO<Object, Integer>
{
  
  public abstract void addQualityTestUpdatePOBarcode(QualityTest paramObjQualityTest) throws Exception;
  
}
