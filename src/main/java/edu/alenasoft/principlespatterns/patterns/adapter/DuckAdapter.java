package edu.alenasoft.principlespatterns.patterns.adapter;

// Adapter, Wrapper
public class DuckAdapter implements Turkey {

    private final Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        this.duck.quack();
    }
}
