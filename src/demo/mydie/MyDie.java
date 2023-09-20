package demo.mydie;

import java.util.Random;

/**
 * Always call roll() before getValue() to ensure allowed value 1-6.
 */
public class MyDie {
  private int value;

  public MyDie() {
    roll();
  }

  public MyDie(boolean printValue) {
    roll();
    if (printValue)
      System.out.println(value);
    else
      System.out.println("Secret value.");
    // Don't roll() here!
  }

  public int getValue() {
    return value;
  }

  public void roll() {
    Random random = new Random();
    value = random.nextInt(6) + 1;
  }
}
