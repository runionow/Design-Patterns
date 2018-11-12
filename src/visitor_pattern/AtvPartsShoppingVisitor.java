package visitor_pattern;

import java.util.List;

public class AtvPartsShoppingVisitor implements AtvPartVisitor {

    private double shippingAmount = 0;
    @Override
    public void visit(Fender fender) {
        shippingAmount += 15;
    }

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 25;
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 15;

    }

    public void visit(PartsOrder order){
        List<AtvPart> parts = order.getParts();
        if(parts.size() > 3){
            shippingAmount -=5;
        }
        System.out.println("Shipping Amount: " + shippingAmount);
    }
}
