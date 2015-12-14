package org.qrbarcode.service;

import java.util.List;
import org.qrbarcode.model.User;

public abstract interface UserService
{
  public abstract void insertUser(User paramUser);
  
  public abstract User getUserById(int paramInt);
  
  public abstract User getUser(String paramString);
  
  public abstract List<User> getUsers();
}
