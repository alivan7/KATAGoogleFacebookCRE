package edu.alenasoft.principlespatterns.patterns.singleton;

public class Singleton {

  private static Singleton INSTANCE;

  public synchronized static Singleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Singleton();
    }

    return INSTANCE;
  }

  private Singleton() {}
}
