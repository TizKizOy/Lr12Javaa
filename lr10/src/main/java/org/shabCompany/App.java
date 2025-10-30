package org.shabCompany;

import org.shabCompany.ex2.Employee;
import org.shabCompany.ex2.FullTimeEmployee;
import org.shabCompany.ex2.exception.OkladException;

public class App
{
  public static void main( String[] args ) {
    try {
      Employee employee1 = new Employee("Иванов Иван Иванович", "Менеджер", -1000);
    } catch (OkladException e) {
      System.err.println("Ошибка: " + e.getMessage());
    }

    try {
      FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Петров Петр Петрович", "Инженер", 5000, -1000);
      System.out.println("Зарплата: " + fullTimeEmployee.calculateSalary());
    } catch (OkladException e) {
      System.err.println("Ошибка: " + e.getMessage());
    }
  }
}
