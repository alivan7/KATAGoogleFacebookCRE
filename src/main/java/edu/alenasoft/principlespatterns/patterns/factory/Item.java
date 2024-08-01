package edu.alenasoft.principlespatterns.patterns.factory;

public abstract class Item {

    private final ItemType itemType;

    protected Item(ItemType itemType) {
        this.itemType = itemType;
    }

    abstract void print();
}
