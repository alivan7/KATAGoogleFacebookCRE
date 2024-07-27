package edu.alenasoft.principlespatterns.patterns.decorator;

public class PizzaTomatoe extends Pizza {

  private final int ownPrice;

  public PizzaTomatoe(int pizzePrice, int ownPrice) {
    super(pizzePrice);
    this.ownPrice = ownPrice;
  }

  @Override
  public String details() {
    return super.details() + ", tomate";
  }

  @Override
  public int getPrice() {
    return super.getPrice() + ownPrice;
  }
}
