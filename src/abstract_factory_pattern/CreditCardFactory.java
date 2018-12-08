package abstract_factory_pattern;

public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if(creditScore > 650) {
            return new AmexFactory();
        }

        else {
            return new VisaFactory();
        }
    }
    public abstract CreditCard gertCreditCard(CardType card);
    public abstract Validator getValidator();
}
