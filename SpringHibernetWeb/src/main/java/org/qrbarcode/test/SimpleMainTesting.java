package org.qrbarcode.test;

import java.io.PrintStream;
import java.util.List;
import org.qrbarcode.model.User;
import org.qrbarcode.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleMainTesting
{
  public static void main(String[] args)
  {
    ApplicationContext ctx = 
      new ClassPathXmlApplicationContext("applicationContext.xml");
    UserService userManager = 
      (UserService)ctx.getBean("userServiceImpl");
    
    String userName = "sp";
    String fullName = "S P";
    User user = new User();
    user.setUsername(userName);
    user.setName(fullName);
    
    userManager.insertUser(user);
    
    System.out.println("User inserted!");
    
    user = userManager.getUser(userName);
    
    System.out.println("\nUser fetched by username!\nId: " + 
      user.getId() + 
      "\nUsername: " + user.getUsername() + 
      "\nName: " + user.getName());
    
    user = userManager.getUserById(user.getId());
    
    System.out.println("\nUser fetched by ID!\nId: " + 
      user.getId() + 
      "\nUsername: " + user.getUsername() + 
      "\nName: " + user.getName());
    
    List<User> users = userManager.getUsers();
    
    System.out.println("\nUser list fetched!\nUser count: " + 
      users.size());
  }
}
