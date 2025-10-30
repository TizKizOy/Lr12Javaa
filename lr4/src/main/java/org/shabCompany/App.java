package org.shabCompany;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Напишите номер задания, которое нужно выполнить: (1-2) ");
        int num = in.nextInt();
        switch (num) {
            case 1:
                Employee emp = new Employee();
                emp.setEmpId(101);
                emp.setName("Jane Smith");
                emp.setSalary(120_345.27);
                emp.setSsn("012-34-5678");


                System.out.println("Employee ID: "+emp.getEmpId());
                System.out.println("Employee Name: "+emp.getName());
                System.out.println("Employee Soc Sec # "+emp.getSsn());
                System.out.println("Employee salary: "+emp.getSalary());
                break;
            case 2:
                //Книга, 3 поля и  3 класса наследника
                Book book = new Book("Книга", "Автор", 4);
                Encyclopedia encyclopedia = new Encyclopedia("Энциклопедия", "Автор", 4, 12);
                Novel novel = new Novel("Роман", "Автор", 4, "Роман");
                Textbook textbook = new Textbook("Учебник", "Автор", 4, "Биология");

                book.printInfo();
                encyclopedia.printInfo();
                novel.printInfo();
                textbook.printInfo();

                break;
            default:
                break;
        }
    }
}