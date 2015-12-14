package org.qrbarcode.dao;

import java.util.List;
import org.qrbarcode.model.Person;

public abstract interface PersonDAO
  extends GenericDAO<Person, Integer>
{
  public abstract void addPerson(Person paramPerson);
  
  public abstract void updatePerson(Person paramPerson);
  
  public abstract List<Person> listPersons();
  
  public abstract Person getPersonById(int paramInt);
  
  public abstract void removePerson(int paramInt);
}
