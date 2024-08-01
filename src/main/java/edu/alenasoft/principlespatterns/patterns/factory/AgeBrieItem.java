package edu.alenasoft.principlespatterns.patterns.factory;

public class AgeBrieItem extends Item {

  private final String name;
  private final Integer quality;

  public AgeBrieItem(String name, Integer quality) {
    super(ItemType.AGED_BRIE);
    this.name = name;
    this.quality = quality;
  }

  @Override
  void print() {
    System.out.println("AgeBrie: " + this.name + " - " + this.quality);
  }
}
