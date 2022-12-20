package money.tdd;

public abstract class Money {
    protected int amount;
    protected abstract String currency();

    public abstract Money times(int multiplier);

    public static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(object.getClass());
    }
}
