package chainResponsibility_pattern;


public class Dollar50dispenser implements IDispenser {
    private IDispenser _chain;

    @Override
    public void nextChain(IDispenser nextChain) {
        this._chain = nextChain;
    }

    @Override
    public void getCurrency(chainResponsibility_pattern.Currency cur ) {
        if(cur.getAmount() >= 50){
            int num = (int)cur.getAmount()/50;
            int remainder = (int) cur.getAmount()%50;
            System.out.println("Count :"+num+ " 50$ note");
            if(remainder != 0){
                this._chain.getCurrency(new chainResponsibility_pattern.Currency(remainder));
            }
        }
        else{
            this._chain.getCurrency(cur);
        }
    }
}
