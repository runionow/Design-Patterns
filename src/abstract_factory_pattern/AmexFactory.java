package abstract_factory_pattern;

public class AmexFactory extends CreditCardFactory {
    @Override
    public CreditCard gertCreditCard(CardType card) {

        switch(card) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator() {
        return null;
    }
}
