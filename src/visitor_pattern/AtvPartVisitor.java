package visitor_pattern;

public interface AtvPartVisitor {

    double shippingCost = 0;

    void visit(Fender fender);
    void visit(Wheel wheel);
    void visit(Oil oil);
    void visit(PartsOrder partsOrder);
}
