package edu.alenasoft.principlespatterns.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder {

  private final String name;
  private final List<File> files;
  private final List<Folder> folders;

  public Folder(String name) {
    this.name = name;
    this.files = new ArrayList<>();
    this.folders = new ArrayList<>();
  }

  public void addFile(File file) {
    this.files.add(file);
  }

  public void addFolder(Folder folder) {
      this.folders.add(folder);
  }

  public void print() {
    System.out.println("+ " + name);
    this.files.forEach(File::print);
    this.folders.forEach(Folder::print);
  }
}
