package edu.alenasoft.principlespatterns.patterns.observer;

public class BarView implements Observer {

  private final DataModel dataModel;

  public BarView(DataModel dataModel) {
    this.dataModel = dataModel;
  }

  @Override
  public void print() {
    System.out.println("|| || || || ||");
    System.out.printf(
        "a: %d, b: %d, c: %d%n", dataModel.getA(), dataModel.getB(), dataModel.getC());
  }
}
