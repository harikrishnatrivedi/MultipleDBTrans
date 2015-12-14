package org.qrbarcode.dao;

import java.util.List;
import org.qrbarcode.model.User;

public abstract interface UserDAO
  extends GenericDAO<User, Integer>
{
  public abstract void insertUser(User paramUser);
  
  public abstract User getUserById(Integer paramInteger);
  
  public abstract User getUser(String paramString);
  
  public abstract List<User> getUsers();
}
