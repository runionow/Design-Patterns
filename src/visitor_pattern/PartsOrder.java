package visitor_pattern;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder implements AtvPart {

    private List<AtvPart> parts = new ArrayList<>();

    public void addPart(AtvPart part) {
        parts.add(part);
    }

    public List<AtvPart> getParts() {
        return parts;
    }

//    public double calculateShipping(){
//        double shippingCost = 0;
//        for(AtvPart part: parts){
//            shippingCost += part.calculateShipping();
//        }
//        return shippingCost;
//    }


    @Override
    public void accept(AtvPartVisitor visitor) {
        for(AtvPart p: parts){
            p.accept(visitor);
        }
        visitor.visit(this);
    }
}
