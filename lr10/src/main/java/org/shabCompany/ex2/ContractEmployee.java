package org.shabCompany.ex2;

import org.shabCompany.ex2.exception.OkladException;

public class ContractEmployee extends Employee{
  public ContractEmployee(String fio, String position, double salary, double prize) throws OkladException {
    super(fio, position, salary);
  }

  @Override
  public double calculateSalary() {
    try {
      return getSalary();
    } catch (Exception e) {
      System.err.println("Произошла ошибка при расчёте зарплаты: " + e.getMessage());
      return 0;
    }
  }
}
