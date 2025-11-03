package state_pattern;

/**
 * Simple client to demonstrate state transitions for the turnstile.
 * Other way of implementation is like Vending Machine example where
 * we call the state and directly call the methods rather defining them in the class (like
 * TurnstileContext class has push and insert coin)
 */
public class Client {
    public static void main(String[] args) {
        TurnstileContext turnstile = new TurnstileContext();
        System.out.println(turnstile);

        System.out.println("User tries to push without coin:");
        turnstile.push();

        System.out.println("User inserts coin:");
        turnstile.insertCoin();

        System.out.println("User pushes to pass:");
        turnstile.push();

        System.out.println("User inserts coin again:");
        turnstile.insertCoin();

        System.out.println("User inserts another coin (already unlocked):");
        turnstile.insertCoin();

        System.out.println("Final state: " + turnstile);
    }
}