package edu.alenasoft.principlespatterns.patterns.decorator;

// Componente concreto
public class Pizza implements Food {

  private final int price;

  public Pizza(int price) {
    this.price = price;
  }

  public String details() {
    return "Masa base y queso";
  }

  public int getPrice() {
    return this.price;
  }
}
