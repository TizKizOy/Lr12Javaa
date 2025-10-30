package org.shabCompany;
import java.io.*;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in, "Cp866");
    System.out.println("Напишите номер задания, которое нужно выполнить: (1-3) ");
    int num = in.nextInt();
    switch (num) {
      case 1:
        String filePath = "info_about_me.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
          writer.write("ФИО: Шабуневич Захар\n");
          writer.write("Возраст: 20\n");
          writer.write("Город: Минск\n");
          writer.write("Учебное заведение: Колледж бизнеса и права\n");
          System.out.println("Файл успешно создан и заполнен.");
        } catch (IOException e) {
          System.err.println("Ошибка при создании файла: " + e.getMessage());
          return;
        }

        File file = new File(filePath);
        System.out.println("\nДанные о файле:");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь к файлу: " + file.getAbsolutePath());
        System.out.println("Размер файла (байт): " + file.length());

        System.out.println("\nИнформация из файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
          String line;
          while ((line = reader.readLine()) != null) {
            System.out.println(line);
          }
        } catch (IOException e) {
          System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        break;
      case 2:
        String filePath2 = "temperatures.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath2))) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Введите 5 значений температуры воздуха:");
          for (int i = 0; i < 5; i++) {
            System.out.print("Температура " + (i + 1) + ": ");
            double temperature = scanner.nextDouble();
            writer.write(String.valueOf(temperature) + "\n");
          }
          System.out.println("Температуры успешно записаны в файл.");
        } catch (IOException e) {
          System.err.println("Ошибка при записи в файл: " + e.getMessage());
          return;
        }

        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath2))) {
          String line;
          while ((line = reader.readLine()) != null) {
            double temperature = Double.parseDouble(line);
            sum += temperature;
            count++;
          }
          if (count > 0) {
            double averageTemperature = sum / count;
            System.out.printf("\nСредняя температура: %.2f\n", averageTemperature);
          } else {
            System.out.println("Файл пуст.");
          }
        } catch (IOException e) {
          System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (NumberFormatException e) {
          System.err.println("Ошибка формата числа: " + e.getMessage());
        }
        break;
      case 3:
        String filePath3 = "dates.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath3))) {
          writer.write("01.01.2023\n");
          writer.write("15.05.2024\n");
          writer.write("неправильная дата\n");
          writer.write("31.12.2025\n");
          System.out.println("Файл с датами успешно создан.");
        } catch (IOException e) {
          System.err.println("Ошибка при создании файла: " + e.getMessage());
          return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("\nОбработка дат из файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath3))) {
          String line;
          while ((line = reader.readLine()) != null) {
            try {
              Date date = dateFormat.parse(line.trim());
              System.out.println("Корректная дата: " + dateFormat.format(date));
            } catch (ParseException e) {
              System.err.println("Ошибка: Некорректный формат даты '" + line + "'");
            }
          }
        } catch (IOException e) {
          System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        break;
      default:
        System.out.println("Абоба");
        break;
    }
  }
}