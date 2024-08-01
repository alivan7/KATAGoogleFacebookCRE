package edu.alenasoft.principlespatterns.patterns.factory;

public class NormalItem extends Item {

  private final String name;

  public NormalItem(String name) {
    super(ItemType.NORMAL);
    this.name = name;
  }

  @Override
  void print() {
    System.out.println("Normal: " + this.name);
  }
}
