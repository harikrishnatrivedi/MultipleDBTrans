package org.qrbarcode.service;

import java.util.List;
import org.qrbarcode.dao.PersonDAO;
import org.qrbarcode.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UpdateLengthServiceImpl
  implements PersonService
{
  @Autowired
  private PersonDAO personDAO;
  
  public void addPerson(Person p)
  {
    this.personDAO.addPerson(p);
  }
  
  public void updatePerson(Person p)
  {
    this.personDAO.updatePerson(p);
  }
  
  public List<Person> listPersons()
  {
    return this.personDAO.listPersons();
  }
  
  public Person getPersonById(int id)
  {
    return this.personDAO.getPersonById(id);
  }
  
  public void removePerson(int id)
  {
    this.personDAO.removePerson(id);
  }
}
