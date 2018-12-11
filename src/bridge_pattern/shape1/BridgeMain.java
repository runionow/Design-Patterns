package bridge_pattern.shape1;

// Decouple abstraction and implementation
// Encapsulation, Composition, Inheritance
// Changes in abstraction wont affect client
// Details wont be right
// Eg: Driver, JDBC

import javafx.scene.shape.Circle;

// Design:
// Interfaces and Abstract Classes
// Composition over Inheritance
// More than composition
// Expect changes from both sides
public class BridgeMain {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

    }
}
