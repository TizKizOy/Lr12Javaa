package org.shabCompany;

public class Piano extends Instrument{

  public Piano(String name, String color){
    super(name, color);
  }

  @Override
  public void play() {
    System.out.println("Играет " + getName() + " пианино, " + getColor() + " цвета");
  }
}
