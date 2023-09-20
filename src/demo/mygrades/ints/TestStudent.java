package demo.mygrades.ints;

public class TestStudent {
  public static void main(String[] args) {
    new TestStudent().run();
  }

  private void run() {
    Student carrie = new Student("Carrie");
    Student sheila = new Student("Sheila");

    carrie.addGrade(-3);
    carrie.addGrade(4);
    carrie.addGrade(10);
    carrie.addGrade(12);
    carrie.addGrade(10);
    carrie.addGrade(4);
    carrie.addGrade(12);
    carrie.addGrade(0);
    carrie.addGrade(-3);

    System.out.println(carrie);
    System.out.println(sheila);
  }
}
