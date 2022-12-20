package money.tdd;

public class Franc extends Money {

    private String currency;
    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    protected String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

}
