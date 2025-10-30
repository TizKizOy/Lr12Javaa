package org.shabCompany;

public interface Instrumentable {
  void play();
  default void stop() {
    System.out.println("Останавливаемся");
  }
}


