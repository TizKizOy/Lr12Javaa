package org.shabCompany.ex3;

public class FixedSalaryEmployee extends Employee{
  private double fixedSalary;
  public FixedSalaryEmployee(String fullName, int id, double fixedSalary){
    super(fullName, id);
    this.fixedSalary = fixedSalary;
  }

  public void setFixedSalary(double fixedSalary) {
    this.fixedSalary = fixedSalary;
  }
  @Override
  public double getAverageMonthlySalary() {
    return fixedSalary;
  }

}