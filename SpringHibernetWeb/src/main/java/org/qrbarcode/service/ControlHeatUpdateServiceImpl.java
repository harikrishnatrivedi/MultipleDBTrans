package org.qrbarcode.service;


import org.qrbarcode.model.barcode.QualityTest;
import org.qrbarcode.serviceDao.ControlHeatUpdateServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ControlHeatUpdateServiceImpl
  implements ControlHeatUpdateService
{
  @Autowired
  private ControlHeatUpdateServiceDAO objControlHeatUpdateServiceDAO;
  
  
  public void addQualityTestUpdatePOBarcode(QualityTest paramObjQualityTest) throws Exception{
	  try {
		  objControlHeatUpdateServiceDAO.addQualityTestUpdatePOBarcode(paramObjQualityTest);
	  }catch(Exception ex){
		  ex.printStackTrace();
		  throw ex;
	  }
  }  
  
  
  
}
