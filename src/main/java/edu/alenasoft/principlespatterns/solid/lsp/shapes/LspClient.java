package edu.alenasoft.principlespatterns.solid.lsp.shapes;

import java.util.List;

public class LspClient {

  void execute() {
    Rectangle rectangle = new Rectangle();
    rectangle.setWidth(5);
    rectangle.setHeight(10);

    Square square = new Square();
    square.setSide(5);

    List.of(rectangle, square)
        .forEach(
            s -> System.out.println("Area of shape: " + s.getArea()));

//    Shape rectangleShape = rectangle;
//    Shape squareShape = square;
  }
}
