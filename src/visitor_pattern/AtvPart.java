package visitor_pattern;

public interface AtvPart {
//    public double calculateShipping();
void accept(AtvPartVisitor visitor);
}
