package org.qrbarcode.serviceDao;



import org.qrbarcode.dao.GenericDAO;
import org.qrbarcode.model.UpdateLength;

public abstract interface UpdateLengthServiceDAO
  extends GenericDAO<Object, Integer>
{
  
  public abstract void updateLength(UpdateLength paramObjUpdateLength) throws Exception;
  
}
