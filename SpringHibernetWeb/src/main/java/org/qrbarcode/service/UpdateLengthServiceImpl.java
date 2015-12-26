package org.qrbarcode.service;


import org.qrbarcode.model.UpdateLength;
import org.qrbarcode.serviceDao.UpdateLengthServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UpdateLengthServiceImpl
  implements UpdateLengthService
{
  @Autowired
  private UpdateLengthServiceDAO objUpdateLengthDAO;
  
  
  public void updateLength(UpdateLength paramObjUpdateLength) throws Exception{
	  try {
		  	objUpdateLengthDAO.updateLength(paramObjUpdateLength);
	  }catch(Exception ex){
		  ex.printStackTrace();
		  throw ex;
	  }
  }  
  
  
  
}
