package demo.mygrades.grades;

import java.util.Arrays;

public class Student {
  private static int nextStudentNumber = 1000;
  private int studentNumber;
  private String name;
  // private int[] grades;
  private Grade[] grades;
  private int nextGrade;

  Student(String name) {
    studentNumber = nextStudentNumber++;
    // grades = new int[7];
    grades = new Grade[7];
    nextGrade = 0;
    setName(name);
  }

  public int getStudentNumber() {
    return studentNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /*
  public int[] getGrades() {
    return grades;
  }
   */

  public Grade[] getNextGrades() {
    return grades;
  }

  // public void addGrade(int grade) {
  public void addGrade(Grade grade) {
    if (nextGrade < 7)
      grades[nextGrade++] = grade;
  }

  @Override
  public String toString() {
    return "Student{" +
        "studentNumber=" + studentNumber +
        ", name='" + name + '\'' +
        ", grades=" + Arrays.toString(grades) +
        '}';
  }
}
