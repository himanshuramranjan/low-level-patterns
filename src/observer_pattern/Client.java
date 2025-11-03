package observer_pattern;

/**
 * Top-level client demonstrating push and pull observer variants.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("--- Observer (Push) demo ---");
        observer_pattern.push.ConcreteSubject pushSubject = new observer_pattern.push.ConcreteSubject();
        observer_pattern.push.ConcreteObserver p1 = new observer_pattern.push.ConcreteObserver("P1");
        observer_pattern.push.ConcreteObserver p2 = new observer_pattern.push.ConcreteObserver("P2");
        pushSubject.register(p1);
        pushSubject.register(p2);
        pushSubject.publishEvent("Event-1");
        pushSubject.unregister(p1);
        pushSubject.publishEvent("Event-2");

        System.out.println("\n--- Observer (Pull) demo ---");
        observer_pattern.pull.Subject pullSubject = new observer_pattern.pull.Subject();
        observer_pattern.pull.ConcreteObserver o1 = new observer_pattern.pull.ConcreteObserver("O1");
        observer_pattern.pull.ConcreteObserver o2 = new observer_pattern.pull.ConcreteObserver("O2");
        pullSubject.register(o1);
        pullSubject.register(o2);
        pullSubject.setState("STATE-1");
        pullSubject.setState("STATE-2");
    }
}
