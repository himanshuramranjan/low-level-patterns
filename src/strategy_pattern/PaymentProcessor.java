package strategy_pattern;

import strategy_pattern.patern.PaymentStrategy;

/**
 * Context that uses a PaymentStrategy to perform payments. Strategy can be
 * swapped at runtime.
 */
public class PaymentProcessor {
    private PaymentStrategy strategy;

    public PaymentProcessor(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public PaymentStrategy getStrategy() {
        return strategy;
    }

    public void pay(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("No payment strategy set");
        }
        System.out.println("Processing payment using strategy: " + strategy.name());
        strategy.pay(amount);
    }
}
