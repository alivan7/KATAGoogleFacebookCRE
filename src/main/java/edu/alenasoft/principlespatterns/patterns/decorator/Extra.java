package edu.alenasoft.principlespatterns.patterns.decorator;

// Decorator
public class Extra implements Food {

    private final Food food;
    private final String name;
    private final int price;

    public Extra(Food food, String name, int price) {
        this.food = food;
        this.name = name;
        this.price = price;
    }

    @Override
    public String details() {
        return this.food.details() + ", " + this.name;
    }

    @Override
    public int getPrice() {
        return this.food.getPrice() + this.price;
    }
}
