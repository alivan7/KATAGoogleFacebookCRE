package edu.alenasoft.principlespatterns.patterns.composite;

public record LinkFile(String name, String linkPath) implements File {

  @Override
  public void print() {
    System.out.printf("- %s (%s)%n", this.name, this.linkPath);
  }
}
