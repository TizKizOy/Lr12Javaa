package org.shabCompany;

public class Birdhouse {
  private String material;
  private String shape;

  public Birdhouse(String material, String shape){
    this.material = material;
    this.shape = shape;
  }

  public void setMaterial(String material) {
    this.material = material;
  }
  public String getMaterial() {
    return material;
  }
  public void setShape(String shape) {
    this.shape = shape;
  }
  public String getShape() {
    return shape;
  }

  @Override
  public String toString() {
    return "Скворечник: материал=" + material + ", форма=" + shape;
  }
}

