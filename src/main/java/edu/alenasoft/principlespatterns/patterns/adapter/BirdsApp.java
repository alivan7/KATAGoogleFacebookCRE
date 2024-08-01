package edu.alenasoft.principlespatterns.patterns.adapter;

import java.util.List;

public class BirdsApp {

  public void play() {
    var duck = new Duck();
    List<Turkey> birds = List.of(new TurkeyImpl(), new TurkeyImpl(), new DuckAdapter(duck));

    birds.forEach(Turkey::gobble);
  }
}
