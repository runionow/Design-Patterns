package chainResponsibility_pattern;


public class Dollar20dispenser implements IDispenser {
    private IDispenser _chain;

    @Override
    public void nextChain(IDispenser nextChain) {
        this._chain = nextChain;
    }

    @Override
    public void getCurrency(Currency cur) {
        if (cur.getAmount() >=20){
            int num = (int)cur.getAmount()/20;
            float remainder = cur.getAmount()%20;
            System.out.println("Count :"+ num + " $20 Notes");
            if(remainder!=0){
                this._chain.getCurrency(new Currency(remainder));
            }
        }
        else{
            this._chain.getCurrency(cur);
        }
    }
}
