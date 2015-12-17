package org.qrbarcode.dao;

import java.util.List;
import org.qrbarcode.model.UpdateLength;

public abstract interface UpdateLengthDAO
  /*extends GenericDAO<ModelName, Integer>*/
{
  public abstract void updateLength(UpdateLength objUpdateLength) throws Exception;
  
  /*public abstract boolean checkMRN(String strBarcode);
  
  public abstract void updatePerson(UpdateLength paramPerson);
  
  public abstract List<Person> listPersons();
  
  public abstract Person getPersonById(int paramInt);
  
  public abstract void removePerson(int paramInt);*/
}
