package chainResponsibility_pattern;

public class Currency {
    private float _amount;
    public Currency(float amount){
        this._amount = amount;
    }

    public float getAmount(){
        return this._amount;
    }
}
