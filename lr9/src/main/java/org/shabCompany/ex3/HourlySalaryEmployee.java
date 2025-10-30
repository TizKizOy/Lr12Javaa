package org.shabCompany.ex3;

public class HourlySalaryEmployee extends Employee{
  private double hourlyRate;
  private int hoursWorked;

  public HourlySalaryEmployee(String fullName, int id, int hoursWorked, double hourlyRate){
    super(fullName, id);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }
  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public int getHoursWorked() {
    return hoursWorked;
  }
  public void setHoursWorked(int hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  @Override
  public double getAverageMonthlySalary() {
    return hourlyRate * hoursWorked;
  }
}
