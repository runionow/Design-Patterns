package visitor_pattern;

public class VisitorMain {
    public static void main(String... args){
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        order.accept(new AtvPartsShoppingVisitor());

    }
}
