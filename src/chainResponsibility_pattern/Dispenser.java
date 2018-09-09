package chainResponsibility_pattern;

import java.util.Scanner;

public class Dispenser {
    private IDispenser _d1;
    public Dispenser(){
        this._d1 = new Dollar50dispenser();
        IDispenser _d2 = new Dollar20dispenser();
        IDispenser _d3 = new Dollar10dispenser();

        _d1.nextChain(_d2);
        _d2.nextChain(_d3);
    }

    public static void main(String[] args){
        Dispenser dispense = new Dispenser();
        while (true){

            System.out.println("Enter Amount : ");
            Scanner input = new Scanner(System.in);
            int amount = input.nextInt();

            if(amount %10 != 0){
                System.out.println("Amount should be multiples of 10");
                return;
            }
            dispense._d1.getCurrency(new Currency(amount));
        }

    }
}
