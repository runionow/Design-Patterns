package chainResponsibility_pattern;


public class Dollar10dispenser implements IDispenser {
    private IDispenser _chain;

    @Override
    public void nextChain(IDispenser nextChain) {
        this._chain = nextChain;
    }

    @Override
    public void getCurrency(Currency cur) {
        if(cur.getAmount()>=10){
            int number = (int)cur.getAmount()/10;
            float remainder = cur.getAmount()%10;
            System.out.println("Count :"+number+" $10 Notes");

            if(remainder !=0){
                this._chain.getCurrency(new Currency(remainder));
            }
        }
        else {
            this._chain.getCurrency(cur);
        }
    }
}
