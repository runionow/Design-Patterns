package chainResponsibility_pattern;


public interface IDispenser {
    void getCurrency(Currency cur);
    void nextChain(IDispenser nextChain);
}
