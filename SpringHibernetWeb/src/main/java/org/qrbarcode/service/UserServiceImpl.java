package org.qrbarcode.service;

import java.util.List;
import org.qrbarcode.dao.UserDAO;
import org.qrbarcode.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserServiceImpl
  implements UserService
{
  @Autowired
  private UserDAO userDAO;
  
  public void insertUser(User user)
  {
    this.userDAO.insertUser(user);
  }
  
  public User getUserById(int userId)
  {
    return this.userDAO.getUserById(Integer.valueOf(userId));
  }
  
  public User getUser(String username)
  {
    return this.userDAO.getUser(username);
  }
  
  public List<User> getUsers()
  {
    return this.userDAO.getUsers();
  }
}
