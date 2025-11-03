package strategy_pattern;

import strategy_pattern.patern.CreditCardStrategy;
import strategy_pattern.patern.PayPalStrategy;
import strategy_pattern.patern.PaymentStrategy;

/**
 * Demo client for the Strategy pattern (Payment example).
 */
public class Client {
    public static void main(String[] args) {
        // Start with credit-card strategy
        PaymentProcessor processor = new PaymentProcessor(new CreditCardStrategy("4111111111111111", "Alice"));
        processor.pay(49.99);

        // Switch to PayPal at runtime
        processor.setStrategy(new PayPalStrategy("alice@example.com"));
        processor.pay(19.95);

        // Custom anonymous strategy for e.g., reward points
        processor.setStrategy(new PaymentStrategy() {
            @Override
            public void pay(double amount) {
                System.out.println("Paying $" + amount + " using reward points (mock)");
            }

            @Override
            public String name() {
                return "RewardPoints";
            }
        });

        processor.pay(5.50);
    }
}
