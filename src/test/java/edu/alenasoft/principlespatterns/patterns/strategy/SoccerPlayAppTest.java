package edu.alenasoft.principlespatterns.patterns.strategy;

import org.junit.jupiter.api.Test;

class SoccerPlayAppTest {

  @Test
  void play() {
    var app = new SoccerPlayApp();

    app.run();
  }
}
