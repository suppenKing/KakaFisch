package com.ogopogo.okanagan.lake;
/**
 * 
 * @param <T>
 */
public interface Kiste<T> {
 
  /**
   * I have to find a better job
   * @param e  leere Kieste
   */
  abstract void put(T e);
  
  abstract void calculateGermkn�delFette(T t);
  
  abstract void systemTrinkOut(T e);
  
  abstract void makeCleanAfterUser();
  
  
}
