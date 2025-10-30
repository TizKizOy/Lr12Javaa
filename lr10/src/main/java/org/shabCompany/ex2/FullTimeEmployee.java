package org.shabCompany.ex2;

import org.shabCompany.ex2.exception.OkladException;
import org.shabCompany.ex2.exception.PremiyaException;

public class FullTimeEmployee extends Employee {
  private double prize;

  public FullTimeEmployee(String fio, String position, double salary, double prize) throws OkladException {
    super(fio, position, salary);
    this.prize = prize;
  }

  public double getPrize() {
    return prize;
  }
  public void setPrize(double prize) {
    this.prize = prize;
  }

  @Override
  public double calculateSalary() {
    try {
      if (prize < 0) {
        throw new PremiyaException("Премия не может быть отрицательной: " + prize);
      }
      return getSalary() + prize;
    } catch (PremiyaException e) {
      System.err.println("Ошибка: " + e.getMessage());
      return getSalary();
    } catch (Exception e) {
      System.err.println("Произошла ошибка при расчёте зарплаты: " + e.getMessage());
      return 0;
    }
  }
}
