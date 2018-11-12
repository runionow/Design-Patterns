package visitor_pattern;

public interface AtvPart {
//    public double calculateShipping();
    public void accept(AtvPartVisitor visitor);
}
