package demo.coin;

import java.util.Random;

public class Coin {
  private CoinValue value;

  public Coin() {
    Random random = new Random();
    if (random.nextBoolean())
      value = CoinValue.HEADS;
    else
      value = CoinValue.TAIL;
  }

  public CoinValue getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "Coin{" +
        "value=" + value +
        '}';
  }
}
