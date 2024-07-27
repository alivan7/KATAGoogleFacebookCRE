package edu.alenasoft.principlespatterns.patterns.decorator;

public class MenuApp {

  public void showMenu() {
    var pizza = new Pizza(10);
    System.out.println(pizza.details() + pizza.getPrice() + "Bs.");

    pizza = new PizzaTomatoe(10, 5);
    System.out.println(pizza.details() + pizza.getPrice() + "Bs.");
  }
}
