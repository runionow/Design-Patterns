package startegy_pattern;

public abstract class Duck {
    FlyBeahviour fly;
    QuackBehaviour quack;

    Duck(){

    }

    public abstract void display();

    public void performFly(){
        fly.fly();
    }

    public void performQuack (){
        quack.quack();
    }

    public void setFlyBehaviour(FlyBeahviour fb){
        this.fly = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        this.quack = qb;
    }

    public void swim(){
        System.out.println("All the ducks will float, even decoys");
    }
}
