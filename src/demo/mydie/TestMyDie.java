package demo.mydie;

public class TestMyDie {
  public static void main(String[] args) {
    MyDie die1 = new MyDie();
    MyDie die2 = new MyDie();

    die1.roll();
    System.out.println(die1.getValue());
    System.out.println(die2.getValue());

    System.out.println("New dies:");
    MyDie die3 = new MyDie(true);
    MyDie die4 = new MyDie(false);
  }
}
