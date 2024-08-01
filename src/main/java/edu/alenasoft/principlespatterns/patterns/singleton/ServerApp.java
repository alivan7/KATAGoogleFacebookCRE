package edu.alenasoft.principlespatterns.patterns.singleton;

public class ServerApp {

  public void run() {
    var sing1 = Singleton.getInstance();
    var sing2 = Singleton.getInstance();

    System.out.println(sing1);
    System.out.println(sing2);

    // implementacion

    var sing100 = Singleton.getInstance();
    System.out.println(sing100);
  }
}
