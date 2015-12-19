package org.qrbarcode.dao;

import java.io.PrintStream;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.qrbarcode.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserDAOImpl
  extends GenericDAOImpl<User, Integer>
  implements UserDAO
{
  public void insertUser(User user)
  {
    System.out.println("currentSession calling...");
    currentSession().save(user);
    System.out.println("Exception will be thrown...");
//    currentSession2().save(user);
    System.out.println("calling done...");
  }
  
  public User getUserById(Integer userId)
  {
    return (User)currentSession().get(User.class, userId);
  }
  
  public User getUser(String username)
  {
    Query query = currentSession().createQuery("from User where username = :username");
    query.setParameter("username", username);
    System.out.println(currentSession().createQuery("from User where username = :username").setParameter("username", username).list().get(0));
  //  System.out.println(currentSession2().createQuery("from User where username = :username").setParameter("username", username).list().get(0));
    return (User)query.list().get(0);
  }
  
  public List<User> getUsers()
  {
    Criteria criteria = currentSession().createCriteria(User.class);
    return criteria.list();
  }
}
