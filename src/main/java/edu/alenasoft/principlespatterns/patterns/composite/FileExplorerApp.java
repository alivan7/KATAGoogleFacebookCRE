package edu.alenasoft.principlespatterns.patterns.composite;

public class FileExplorerApp {

  public void print() {
    var rootFolder = new Folder("root");
    var file0 = new File("zero");
    rootFolder.addFile(file0);

    var subFolder = new Folder("subFolder");
    var file1 = new File("one");
    var file2 = new File("two");
    subFolder.addFile(file1);
    subFolder.addFile(file2);

    var subSubFolder = new Folder("subSubFolder");
    subSubFolder.addFile(new File("extra"));
    subFolder.addFolder(subSubFolder);

    rootFolder.addFolder(subFolder);

    rootFolder.print();
  }
}
