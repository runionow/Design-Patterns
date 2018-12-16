package decorator_pattern;

import java.beans.Customizer;

public  abstract class SandwichDecorator implements Sandwich{
    public Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }
}
