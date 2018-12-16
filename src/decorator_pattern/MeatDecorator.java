package decorator_pattern;

public class MeatDecorator extends SandwichDecorator {
    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make() + addMeat();
    }

    private String addMeat() {
        return " + Turkey";
    }
}
