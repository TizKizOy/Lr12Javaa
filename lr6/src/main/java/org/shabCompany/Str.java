package org.shabCompany;

public class Str {
  private String note;
  private double tension; //натяжение
  private String material;

  public Str(String note, double tension, String material){
    this.note = note;
    this.tension = tension;
    this.material = material;
  }

  public String getNote(){
    return note;
  }
  public void setNote(String note){
    this.note = note;
  }
  public double getTension(){
    return tension;
  }
  public void setTension(double tension) {
    this.tension = tension;
  }
  public String getMaterial() {
    return material;
  }
  public void setMaterial(String material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return "Струна: нота=" + note + ", натяжение=" + tension + ", материал=" + material;
  }
}