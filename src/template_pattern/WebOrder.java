package template_pattern;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Checking out the items from the cart");
    }

    @Override
    public void doPayment() {
        System.out.println("Paying money");
    }

    @Override
    public void doReciept() {
        System.out.println("Generate Reciept");

    }
}
