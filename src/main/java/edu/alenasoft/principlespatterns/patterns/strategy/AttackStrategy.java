package edu.alenasoft.principlespatterns.patterns.strategy;

public class AttackStrategy implements Strategy {
  @Override
  public void play() {
    System.out.println("attack");
  }
}
