package org.qrbarcode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Person
{
  @Id
  @Column(name="id")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  private String name;
  private String country;
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getCountry()
  {
    return this.country;
  }
  
  public void setCountry(String country)
  {
    this.country = country;
  }
  
  public String toString()
  {
    return "id=" + this.id + ", name=" + this.name + ", country=" + this.country;
  }
}
