package observer_pattern.pull;

/**
 * Concrete observer that pulls state from the subject when notified.
 */
public class ConcreteObserver implements Observer {
    private final String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println("[PullObserver " + name + "] Pulled state: " + subject.getState());
    }
}
