package edu.alenasoft.principlespatterns.patterns.strategy;

public class DefenseStrategy implements Strategy {
  @Override
  public void play() {
    System.out.println("defense");
  }
}
