package org.qrbarcode.dao;

import java.io.PrintStream;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.qrbarcode.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonDAOImpl
  extends GenericDAOImpl<Person, Integer>
  implements PersonDAO
{
  public void addPerson(Person p)
  {
   // currentSession2().persist(p);
  }
  
  public void updatePerson(Person p)
  {
    currentSession().update(p);
  }
  
  public List<Person> listPersons()
  {
    System.out.println("currentSession() : " + currentSession());
    List<Person> personsList = currentSession().createQuery("from Person").list();
    for (Person p : personsList) {
      System.out.println("Person List::" + p);
    }
    return personsList;
  }
  
  public Person getPersonById(int id)
  {
    Person p = (Person)currentSession().load(Person.class, new Integer(id));
    System.out.println("Person loaded successfully, Person details=" + p);
    return p;
  }
  
  public void removePerson(int id)
  {
    Person p = (Person)currentSession().load(Person.class, new Integer(id));
    if (p != null) {
      currentSession().delete(p);
    }
    System.out.println("Person deleted successfully, person details=" + p);
  }
}
