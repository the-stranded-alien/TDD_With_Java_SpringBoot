package money.tdd;

public class Dollar extends Money {

    private String currency;
    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    @Override
    protected String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
