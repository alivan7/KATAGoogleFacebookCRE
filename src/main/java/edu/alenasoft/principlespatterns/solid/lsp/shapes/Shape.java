package edu.alenasoft.principlespatterns.solid.lsp.shapes;

public sealed interface Shape permits Rectangle, Square {

    int getArea();
}
