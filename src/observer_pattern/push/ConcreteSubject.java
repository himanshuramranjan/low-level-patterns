package observer_pattern.push;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Concrete subject that pushes messages to observers.
 */
public class ConcreteSubject implements Subject {
    private final List<Observer> observers = new CopyOnWriteArrayList<>();

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    // Application-specific method
    public void publishEvent(String message) {
        System.out.println("Subject: publishing -> " + message);
        notifyObservers(message);
    }
}
