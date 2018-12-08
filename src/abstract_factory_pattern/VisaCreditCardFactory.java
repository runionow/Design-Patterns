package abstract_factory_pattern;

public class VisaCreditCardFactory extends CreditCardFactory{


    @Override
    public CreditCard gertCreditCard(CardType card) {
        return null;
    }

    @Override
    public Validator getValidator() {
        return null;
    }
}
