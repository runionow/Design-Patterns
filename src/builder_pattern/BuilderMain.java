package builder_pattern;

public class BuilderMain {
    public static void main(String[] args){
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("bread").meat("chicken").seasoning("oregano").dressing("Buttermilk Ranch");
        LunchOrder order = builder.build();

        System.out.println(order.getBread());
        System.out.println(order.getMeat());
    }

}
