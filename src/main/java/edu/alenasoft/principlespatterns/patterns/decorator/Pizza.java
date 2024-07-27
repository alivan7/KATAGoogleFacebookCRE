package edu.alenasoft.principlespatterns.patterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

  private final int price;
  private final List<Extra> extras;

  public Pizza(int price) {
    this.price = price;
    this.extras = new ArrayList<>();
  }

  public String details() {
    var extraNames = this.extras.stream().map(Extra::getName).reduce("", (a, b) -> a + b);
    return "Masa base y queso, " + extraNames;
  }

  public int getPrice() {
    var extraPrice = this.extras.stream().map(Extra::getPrice).reduce(0, Integer::sum);
    return price + extraPrice;
  }

  public void addExtra(Extra extra) {
    this.extras.add(extra);
  }
}
