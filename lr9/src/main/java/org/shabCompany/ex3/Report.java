package org.shabCompany.ex3;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Report {
  public static void generateReport( List<Employee> employees){
    employees.sort(Comparator
      .comparingDouble(Employee::getAverageMonthlySalary).reversed()
      .thenComparing(Employee::getFullName).reversed()
    );

    System.out.println("Отчёт о среднемесячной зарплате сотрудников:");
    System.out.printf("%-5s %-15s %15s%n", "ID", "ФИО", "Средняя зарплата");
    System.out.println("----------------------------------------");
    for (Employee employee : employees) {
      System.out.printf(
        "%-5d %-15s %,15.2f%n",
        employee.getId(),
        employee.getFullName(),
        employee.getAverageMonthlySalary()
      );
    }

    //какая-то структура данный которая имеет свои методы и способ реализации

    System.out.println("\nПервые 5 имён сотрудников:");
    int count = Math.min(5, employees.size());
    for (int i = 0; i < count; i++) {
      System.out.println(employees.get(i).getFullName());
    }

    System.out.println("\nПоследние 3 идентификатора сотрудников:");
    int startIndex = Math.max(0, employees.size() - 3);
    for (int i = startIndex; i < employees.size(); i++) {
      System.out.println(employees.get(i).getId());
    }
  }
}