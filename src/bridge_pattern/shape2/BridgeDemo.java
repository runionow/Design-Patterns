package bridge_pattern.shape2;

public class BridgeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();
        Color red = new Red();
        Color green = new Green();

        Shape blueCircle = new Circle(blue);
        Shape redSquare = new Square(red);

        redSquare.applyColor();
        blueCircle.applyColor();
    }
}
