package edu.alenasoft.principlespatterns.patterns.factory;

public class ItemFactory {

  public Item create(CreationParam params) {
    return switch (params.type()) {
      case NORMAL -> new NormalItem(params.name());
      case AGED_BRIE -> {
        if (params.quality() == null) {
          throw new RuntimeException("No puedes crear AgeBrie sin quality");
        }
        yield new AgeBrieItem(params.name(), params.quality());
      }
      case CONJURED -> new DefaultItem();
      case SULFURAS -> throw new RuntimeException("Sulfuras no esta implementado");
    };
  }
}
