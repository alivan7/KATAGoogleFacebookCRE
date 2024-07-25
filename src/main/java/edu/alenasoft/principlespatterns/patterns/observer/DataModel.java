package edu.alenasoft.principlespatterns.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class DataModel {

  private final List<Observer> observers;
  private int a;
  private int b;
  private int c;

  public DataModel(int a, int b, int c) {
    this.observers = new ArrayList<>();
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
    this.notifyObservers();
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
    this.notifyObservers();
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
    this.notifyObservers();
  }

  // adjuntar observadores
  public void attach(Observer observer) {
    this.observers.add(observer);
  }

  // notificar a los observadores
  // cuando haya cambios
  private void notifyObservers() {
    this.observers.forEach(Observer::print);
  }
}
