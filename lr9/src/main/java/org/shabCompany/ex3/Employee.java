package org.shabCompany.ex3;

public abstract class Employee {
  private String fullName;
  private int id;

  public Employee(String fullName, int id){
    this.fullName = fullName;
    this.id = id;
  }

  public String getFullName(){
    return fullName;
  }
  public int getId() {
    return id;
  }

  public abstract double getAverageMonthlySalary();
}
