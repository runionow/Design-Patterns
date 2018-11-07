package template_pattern;

public abstract class OrderTemplate {
    public boolean isGift;

    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReciept();

    public final void wrapGift(){
        System.out.println("Gift Wrapped");
    }

    public final void processOrder(){
        doCheckout();
        doPayment();
        if(isGift){
            wrapGift();
        }
        else{
            doReciept();
        }
    }
}
