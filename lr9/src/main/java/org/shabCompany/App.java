package org.shabCompany;

import org.shabCompany.ex1.German;
import org.shabCompany.ex1.Language;
import org.shabCompany.ex1.Spanish;
import org.shabCompany.ex2.Student;
import org.shabCompany.ex3.Employee;
import org.shabCompany.ex3.FixedSalaryEmployee;
import org.shabCompany.ex3.HourlySalaryEmployee;
import org.shabCompany.ex3.Report;

import java.util.*;

public class App
{
  public static void main( String[] args )
  {
    Scanner in = new Scanner(System.in, "Cp866");
    System.out.println("Напишите номер задания, которое нужно выполнить: (1-3) ");
    int num = in.nextInt();
    switch (num) {
      case 1:
        HashMap<String, Language> languageMap = new HashMap<>();

        languageMap.put("German", new German());
        languageMap.put("Spanish", new Spanish());

        for (String key : languageMap.keySet()){
          System.out.println(key);
        }

        for (Map.Entry<String, Language> value : languageMap.entrySet()){
          System.out.println(value);
        }
        break;
      case 2:
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Илья", "Группа 1", 2, new int[]{9,8,9,9}));
        students.add(new Student("Мария", "Группа 2", 2, new int[]{5,6,4,3}));
        students.add(new Student("Петр", "Группа 1", 1, new int[]{2,3,2,2}));
        students.add(new Student("Анна", "Группа 3", 1, new int[]{5,8,9,3}));

        Student.filterAndPromoteStudent(students);

        Student.printStudent(students, 1);
        Student.printStudent(students, 2);
        Student.printStudent(students, 3);
        break;
      case 3:
        ArrayList<Employee> employees = new ArrayList<>(
          Arrays.asList(
            new FixedSalaryEmployee("Иванов Иван", 1, 50000),
            new HourlySalaryEmployee("Петров Петр", 2, 500, 120),
            new FixedSalaryEmployee("Сидоров Сидор", 3, 45000),
            new HourlySalaryEmployee("Алексеев Алексей", 4, 600, 100),
            new FixedSalaryEmployee("Кузнецов Николай", 5, 60000),
            new HourlySalaryEmployee("Смирнова Анна", 6, 400, 150),
            new FixedSalaryEmployee("Васильев Василий", 7, 55000),
            new HourlySalaryEmployee("Попов Дмитрий", 8, 450, 130)
          )
        );

        Report.generateReport(employees);
        break;
      default:
        System.out.println("Абобкин");
        break;
    }
  }
}
