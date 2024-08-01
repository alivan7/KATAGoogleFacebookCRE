package edu.alenasoft.principlespatterns.patterns.factory;

public class DefaultItem extends Item {

  public DefaultItem() {
    super(ItemType.NORMAL);
  }

  @Override
  void print() {
    System.out.println("Item desconocido");
  }
}
