package org.qrbarcode.dao;

import java.util.List;

public abstract interface GenericDAO<E, PK>
{
  public abstract void add(E paramE);
  
  public abstract void saveOrUpdate(E paramE);
  
  public abstract void update(E paramE);
  
  public abstract void remove(E paramE);
  
  public abstract E find(PK paramPK);
  
  public abstract List<E> getAll();
}
