package demo.arraylistdemo;

import java.util.ArrayList;

public class TestPassenger {
  public static void main(String[] args) {
    ArrayList<Passenger> passengers = new ArrayList();

    for (int i = 0; i < 10000; i++) {
      passengers.add(new Passenger());
    }


    for (int i = 0; i < passengers.size(); i++)
      System.out.println(passengers.get(i).getNumber());

    System.out.println("Look here");
    System.out.println(passengers.size());
    passengers.add(new Passenger());
    System.out.println(passengers.size());
  }
}
