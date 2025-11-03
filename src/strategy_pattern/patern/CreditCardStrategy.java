package strategy_pattern.patern;

import strategy_pattern.patern.PaymentStrategy;

/**
 * Concrete PaymentStrategy that charges a credit card.
 */
public class CreditCardStrategy implements PaymentStrategy {
    private final String cardNumber;
    private final String cardHolderName;

    public CreditCardStrategy(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Charging $" + amount + " to credit card " + mask(cardNumber) + " (" + cardHolderName + ")");
    }

    @Override
    public String name() {
        return "CreditCard";
    }

    private String mask(String cc) {
        if (cc == null || cc.length() < 4) return "****";
        return "****-****-****-" + cc.substring(cc.length() - 4);
    }
}
