package edu.alenasoft.principlespatterns.patterns.strategy;

public class SoccerPlayApp {

  public void run() {
    var team = new SoccerTeam();

    // if subscription == PREMIUM
    // var allStrategies = AttackFamilyStrategy + DefenseFamilyStrategy;
    // if subscription == BASIC
    // var allStrategies = DefenseFamilyStrategy;

    var attack = new AttackStrategy();
    // team.attack(); // amerita cambio en el core
    team.play(attack); // esencia del modelo pluginable

    var defense = new DefenseStrategy();
    team.play(defense);

    team.play(new Strategy() {
      @Override
      public void play() {
        System.out.println("Slow down");
      }
    });

    team.play(() -> System.out.println("Force ball out"));

    team.play(() -> {
      // Cuando el algoritmo no pertene a la familia de algoritmos
      // esperado, se considera un mal uso del patron estrategia.

      // llamar a base de datos
      // x operaciones
      System.out.println("Bad use of algorithm");
    });
  }
}
