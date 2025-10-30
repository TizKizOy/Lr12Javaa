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
        Meerkat meerkat1 = new Meerkat();
        Meerkat meerkat2 = new Meerkat("Тимон", 3, "Пустыня", false);

        meerkat1.eat();
        meerkat1.standOnHindLegs();
        meerkat1.play();
        meerkat1.goToSleep();

        System.out.println("Возраст " + meerkat1.name + ": " + meerkat1.getAge());

        meerkat2.eat();
        meerkat2.eat();
        meerkat2.setAge(4);
        System.out.println("Возраст " + meerkat2.name + ": " + meerkat2.getAge());
        break;
      case 2:
        Str[] strings = {
          new Str("Ми", 1.0, "Нейлон"),
          new Str("Ля", 1.1, "Сталь"),
          new Str("Ре", 0.9, "Нейлон"),
          new Str("Соль", 1.2, "Сталь"),
          new Str("Си", 1.1, "Нейлон"),
          new Str("Ми", 1.3, "Сталь")
        };
        Birdhouse birdhouse = new Birdhouse("Дерево", "Круглая");

        Guitar guitar = new Guitar(strings, birdhouse);
        guitar.play();
        guitar.tuneStrs();

        Str newStr = new Str("До", 1.0, "Нейлон");
        guitar.replaceStr(2, newStr);
        System.out.println(guitar);
        break;
      default:
        break;
    }
  }
}
