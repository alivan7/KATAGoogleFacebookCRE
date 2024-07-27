package edu.alenasoft.principlespatterns.patterns.decorator;

public class Extra {

    private final String name;
    private final int price;

    public Extra(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
