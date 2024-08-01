package edu.alenasoft.principlespatterns.patterns.factory;

public class GildedApp {

  public void run() {
    var factory = new ItemFactory();

    var newItem1 = factory.create(new CreationParam(ItemType.NORMAL,"tomate", null));
    var newItem2 = factory.create(new CreationParam(ItemType.AGED_BRIE, "album", 100));

    newItem1.print();
    newItem2.print();
  }
}
