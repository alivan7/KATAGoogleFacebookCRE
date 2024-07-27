package edu.alenasoft.principlespatterns.patterns.decorator;

public class MenuApp {

  public void showMenu() {
    var pizza = new Pizza(10);
    this.print(pizza);

    pizza.addExtra(new Extra("tomate", 5));
    this.print(pizza);

    pizza.addExtra(new Extra("carne", 20));
    this.print(pizza);

    // Extensión con herencia (opcion 1)
    //    pizza = new PizzaTomato(10, 5);
    //    System.out.println(pizza.details() + pizza.getPrice() + "Bs.");
  }

  private void print(Pizza pizza) {
    System.out.println(pizza.details() + " " + pizza.getPrice() + "Bs.");
  }
}
