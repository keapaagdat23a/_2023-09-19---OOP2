package demo.arraylistdemo;

import java.util.Random;

public class Passenger {
  private int number;

  public int getNumber() {
    return number;
  }

  Passenger() {
    Random random = new Random();
    number = random.nextInt(8999) + 1000;
  }

  @Override
  public String toString() {
    return "Passenger{" +
        "number=" + number +
        '}';
  }
}
