package startegy_pattern;

public class MallardDuck extends Duck {
    MallardDuck(){
        quack = new Quack();
        fly = new FlyWithWings() ;
    }

    @Override
    public void display() {
        System.out.println("I am a real mallard startegy_pattern.Duck");
    }
}
