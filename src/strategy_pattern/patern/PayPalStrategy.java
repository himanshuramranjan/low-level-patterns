package strategy_pattern.patern;

/**
 * Concrete PaymentStrategy for PayPal-like payments.
 */
public class PayPalStrategy implements PaymentStrategy {
    private final String email;

    public PayPalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        // In a real system you'd call PayPal API here.
        System.out.println("Charging $" + amount + " to PayPal account " + email);
    }

    @Override
    public String name() {
        return "PayPal";
    }
}
