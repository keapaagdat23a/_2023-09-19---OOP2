package demo.mygrades.grades;

public class TestStudent {
  public static void main(String[] args) {
    new TestStudent().run();
  }

  private void run() {
    Student carrie = new Student("Carrie");
    Student sheila = new Student("Sheila");

    /*
    carrie.addGrade(12);
    carrie.addGrade(4);
    carrie.addGrade(10);
    carrie.addGrade(12);
    carrie.addGrade(10);
    carrie.addGrade(4);
    carrie.addGrade(12);
    carrie.addGrade(0);
    carrie.addGrade(-3);
*/

    carrie.addGrade(Grade.TWELVE);
    carrie.addGrade(Grade.FOUR);
    carrie.addGrade(Grade.TEN);
    carrie.addGrade(Grade.TWELVE);
    carrie.addGrade(Grade.TEN);
    carrie.addGrade(Grade.FOUR);
    carrie.addGrade(Grade.TWELVE);
    carrie.addGrade(Grade.ZERO);
    carrie.addGrade(Grade.MINUS3);

    System.out.println(carrie);
    System.out.println(sheila);
  }
}
