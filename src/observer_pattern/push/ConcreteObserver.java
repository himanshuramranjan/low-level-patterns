package observer_pattern.push;

/**
 * Simple observer that receives pushed messages.
 */
public class ConcreteObserver implements Observer {
    private final String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("[PushObserver " + name + "] Received: " + message);
    }
}
