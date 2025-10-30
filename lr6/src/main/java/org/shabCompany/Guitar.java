package org.shabCompany;

import java.util.Arrays;

public class Guitar {
  private Str[] strs;
  private Birdhouse birdhouse;

  public Guitar(Str[] strs, Birdhouse birdhouse){
    this.strs = strs;
    this.birdhouse = birdhouse;
  }

  public void play(){
    System.out.println("Гитара играет красивую мелодию!");
  }
  public void tuneStrs(){
    System.out.println("Настройка струн гитары...");
    for (Str str : strs){
      str.setTension(str.getTension() + 0.2);
      System.out.println("Струна " + str.getNote() + " настроена. Новое натяжение: " + str.getTension());
    }
  }
  public void replaceStr(int index, Str newStr){
    if(index > 0 && index < strs.length){
      strs[index] = newStr;
      System.out.println("Струна заменена: " + newStr);
    } else{
      System.out.println("Некорректный индекс струны!");
    }
  }

  @Override
  public String toString() {
    return "Гитара: \nСтруны=" + Arrays.toString(strs) + "\n" + birdhouse;
  }
}
