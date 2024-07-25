package edu.alenasoft.principlespatterns.patterns.strategy;

// Context
public class SoccerTeam {

  public void play(Strategy strategy) {
    strategy.play();
  }

  // public void celebrate(CelebrationStrategy strategy);
}
