package org.shabCompany.ex2;
import java.util.Iterator;
import java.util.List;

public class Student {
  private String name;
  private String group;
  private int course;
  private int[] grades;

  public Student(String name, String group, int course, int[] grades){
    this.name = name;
    this.group = group;
    this.course = course;
    this.grades = grades;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public int getCourse() {
    return course;
  }
  public void setCourse(int course) {
    this.course = course;
  }

  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
  }

  public int[] getGrades() {
    return grades;
  }
  public void setGrades(int[] grades) {
    this.grades = grades;
  }

  public double getAverageGrades(){
    double sum = 0;
    for(int grade : grades){
      sum += grade;
    }
    return  sum / grades.length;
  }


  public static void filterAndPromoteStudent(List<Student> students){
    Iterator<Student> iterator = students.iterator();
    while (iterator.hasNext()){
      Student student = iterator.next();
      if (student.getAverageGrades() < 3) {
        iterator.remove();
      } else {
        student.setCourse(student.getCourse() + 1);
      }
    }
  }

  public static void printStudent(List<Student> students, int course){
    System.out.println("Студенты " + course + " курса:");
    for (Student student : students){
      if(student.getCourse() == course){
        System.out.println(student.getName());
      }
    }
  }
}