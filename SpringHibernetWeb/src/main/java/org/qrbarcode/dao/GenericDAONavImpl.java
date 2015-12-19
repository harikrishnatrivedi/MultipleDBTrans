package org.qrbarcode.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;


public class GenericDAONavImpl<E, PK extends Serializable>
  implements GenericDAO<E, PK>
{
  private final Class<? extends E> persistentClass;
  @Autowired
  @Qualifier("secondarySessionFactory")
  private SessionFactory sessionFactorySecond;
  
  
  public GenericDAONavImpl()
  {
    this.persistentClass = ((Class)((java.lang.reflect.ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1]);
  }
  
  protected Session getSession()
  {
    System.out.println("Session created?? 44 :" + this.sessionFactorySecond);
    return this.sessionFactorySecond.openSession();
  }
  
  protected Session currentSession()
  {
    System.out.println("sessionFactory 44 :" + this.sessionFactorySecond);
    
    Session s=this.sessionFactorySecond.getCurrentSession();
    System.out.println(sessionFactorySecond.getStatistics().toString());
    if(!s.isOpen()){
    	System.out.println("session is not opened.");
    }
    return s;
  }
  
  public E getByKey(PK key)
  {
    return (E)currentSession().get(this.persistentClass, key);
  }
  
  public E find(PK key)
  {
    return (E)currentSession().get(this.persistentClass, key);
  }
  
  public void persist(E entity)
  {
    currentSession().persist(entity);
  }
  
  public void add(E entity)
  {
    currentSession().save(entity);
  }
  
  public void delete(E entity)
  {
    currentSession().delete(entity);
  }
  
  public void remove(E entity)
  {
    currentSession().delete(entity);
  }
  
  public void saveOrUpdate(E entity)
  {
    currentSession().saveOrUpdate(entity);
  }
  
  public void update(E entity)
  {
    currentSession().saveOrUpdate(entity);
  }
  
  protected Criteria createEntityCriteria()
  {
    return currentSession().createCriteria(this.persistentClass);
  }
  
  public List<E> getAll()
  {
    return currentSession().createCriteria(this.persistentClass).list();
  }
}
