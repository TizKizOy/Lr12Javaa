package org.shabCompany;

public class Guitar extends Instrument {

  public Guitar(String name, String color){
    super(name, color);
  }

  @Override
  public void play() {
    System.out.println("Играет " + getName() + " гитара, " + getColor() + " цвет");
  }
}
