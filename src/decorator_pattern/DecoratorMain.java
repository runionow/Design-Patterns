package decorator_pattern;

/**
 * Decorator  pattern
 * 1. Also called a wrapper
 * 2. Add behaviour without affecting others,
 * 3. More than just inheritance
 * 4. Single responsibility principle
 * 5. Compose behaviour dynamically.
 * Examples: java.io.inputStream
 */
public class DecoratorMain {
    public static void main(String[] args ) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator( new SimpleSandwich()));
        System.out.println(sandwich.make());

    }
}
