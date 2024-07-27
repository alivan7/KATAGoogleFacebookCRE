package edu.alenasoft.principlespatterns.patterns.decorator;

public class MenuApp {

  public void showMenu() {
    var pizza = new Pizza(10);
    this.print(pizza);

    var pizzaTomato = new Extra(pizza, "tomate", 5);
    this.print(pizzaTomato);

    var pizzaBeef = new Extra(pizzaTomato, "carne", 20);
    this.print(pizzaBeef);
  }

  private void print(Food food) {
    System.out.println(food.details() + " " + food.getPrice() + "Bs.");
  }
}
