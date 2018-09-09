package startegy_pattern;

public class ModelDuck extends Duck {
    ModelDuck(){
        fly =  new FlyNoWay();
        quack = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a model startegy_pattern.Duck");
    }
}

