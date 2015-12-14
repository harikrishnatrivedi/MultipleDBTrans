package org.qrbarcode.controller;

import java.util.List;

import org.qrbarcode.model.Person;
import org.qrbarcode.model.User;
import org.qrbarcode.service.PersonService;
import org.qrbarcode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController
{
  @Autowired
  private PersonService personService;
  @Autowired
  private UserService userService;
  
  @RequestMapping(value="/users", method=RequestMethod.GET)
  public ModelAndView home() {
      List<User> listUsers = userService.getUsers();
      ModelAndView model = new ModelAndView("home");
      model.addObject("userList", listUsers);
      return model;
  }
   
  @RequestMapping(value={"/persons"}, method=RequestMethod.GET)
  public String listPersons(Model model)
  {
    model.addAttribute("person", new Person());
    model.addAttribute("listPersons", this.personService.listPersons());
    return "person";
  }
  
  @RequestMapping(value={"/person/add"}, method=RequestMethod.GET)
  public String addPerson(@ModelAttribute("person") Person p)
  {
    p = new Person();
    p.setCountry("india");
    p.setName("ind");
    if (p.getId() == 0) {
      this.personService.addPerson(p);
    } else {
      this.personService.updatePerson(p);
    }
    System.out.println("$$$$$$$$$ Object Inserted.... $$$$$$$$$");
    
    return "redirect:/persons";
  }
  
  @RequestMapping({"/remove/{id}"})
  public String removePerson(@PathVariable("id") int id)
  {
    this.personService.removePerson(id);
    return "redirect:/persons";
  }
  
  @RequestMapping({"/edit/{id}"})
  public String editPerson(@PathVariable("id") int id, Model model)
  {
    model.addAttribute("person", this.personService.getPersonById(id));
    model.addAttribute("listPersons", this.personService.listPersons());
    return "person";
  }
}
