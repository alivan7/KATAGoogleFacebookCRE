package edu.alenasoft.principlespatterns.patterns.composite;

public record FileLeaf(String name) implements File {

  @Override
  public void print() {
    System.out.println("- " + name);
  }
}
