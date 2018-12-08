package abstract_factory_pattern;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard gertCreditCard(CardType card) {
        switch (card) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator() {
        return null;
    }
}
