package edu.alenasoft.principlespatterns.patterns.decorator;

public class Pizza {

    private final int price;

    public Pizza(int price) {
        this.price = price;
    }

    public String details() {
        return "Masa base y queso";
    }

    public int getPrice() {
        return price;
    }
}
