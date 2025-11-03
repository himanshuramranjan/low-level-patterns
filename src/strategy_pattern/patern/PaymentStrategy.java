package strategy_pattern.patern;

/**
 * Strategy interface for payment processing.
 * Different payment methods implement this interface.
 */
public interface PaymentStrategy {
    void pay(double amount);
    String name();
}
