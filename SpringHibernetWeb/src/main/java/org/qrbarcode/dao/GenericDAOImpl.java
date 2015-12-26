package org.qrbarcode.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GenericDAOImpl<E, PK extends Serializable>
  implements GenericDAO<E, PK>
{
  private final Class<? extends E> persistentClass;
  @Autowired
  @Qualifier("primarySessionFactory")
  private SessionFactory primarySessionFactory;
  
  @Autowired
  @Qualifier("secondarySessionFactory")
  private SessionFactory secondarySessionFactory;
  
  @SuppressWarnings({ "unchecked", "rawtypes" })
public GenericDAOImpl()
  {
    this.persistentClass = ((Class)((java.lang.reflect.ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1]);
  }
  
/*  protected Session getSession()
  {
    System.out.println("Session created?? 33 :" + this.sessionFactory);
    return this.sessionFactory.openSession();
  }
*/  
  protected Session currentPrimarySession()
  {
	  System.out.println("current Primary Session :" + (this.primarySessionFactory.getCurrentSession()).hashCode());
	  return this.primarySessionFactory.getCurrentSession();
  }
  
  protected Session currentSecondarySession()
  {
	  System.out.println("current Secondary Session :" + (this.secondarySessionFactory.getCurrentSession()).hashCode());
	  return this.secondarySessionFactory.getCurrentSession();
  }
  
  @SuppressWarnings("unchecked")
public E getByKey(PK key, Session session)
  {
    return (E)session.get(this.persistentClass, key);
  }
  
  @SuppressWarnings("unchecked")
public E find(PK key, Session session)
  {
    return (E)session.get(this.persistentClass, key);
  }
  
  public void persist(E entity, Session session)
  {
    session.persist(entity);
  }
  
  public void add(E entity, Session session)
  {
    session.save(entity);
  }
  
  public void delete(E entity, Session session)
  {
    session.delete(entity);
  }
  
  public void remove(E entity, Session session)
  {
    session.delete(entity);
  }
  
  public void saveOrUpdate(E entity, Session session)
  {
    session.saveOrUpdate(entity);
  }
  
  public void update(E entity, Session session)
  {
    session.saveOrUpdate(entity);
  }
  
  protected Criteria createEntityCriteria(Session session)
  {
    return session.createCriteria(this.persistentClass);
  }
  
  @SuppressWarnings("unchecked")
public List<E> getAll(Session session)
  {
    return session.createCriteria(this.persistentClass).list();
  }
}
