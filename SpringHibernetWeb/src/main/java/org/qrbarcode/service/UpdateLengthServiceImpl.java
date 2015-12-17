package org.qrbarcode.service;

import java.util.List;
import org.qrbarcode.dao.UpdateLengthDAO;
import org.qrbarcode.model.Person;
import org.qrbarcode.model.UpdateLength;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UpdateLengthServiceImpl
  implements UpdateLengthService
{
  @Autowired
  private UpdateLengthDAO objUpdateLengthDAO;
  
  public void updateLength(UpdateLength updateLength) throws Exception{
	  try {
		  objUpdateLengthDAO.updateLength(updateLength);
	  }catch(Exception ex){
		  throw ex;
	  }
  }
}
