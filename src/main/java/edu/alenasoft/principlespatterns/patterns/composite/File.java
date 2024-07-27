package edu.alenasoft.principlespatterns.patterns.composite;

public class File {

  private final String name;

  public File(String name) {
    this.name = name;
  }

  public void print() {
    System.out.println("- " + name);
  }
}
