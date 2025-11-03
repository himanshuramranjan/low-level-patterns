package observer_pattern.pull;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Subject for pull model exposes state that observers can pull.
 */
public class Subject {
    private final List<Observer> observers = new CopyOnWriteArrayList<>();
    private String state;

    public void register(Observer o) {
        observers.add(o);
    }

    public void unregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("PullSubject: new state -> " + state);
        notifyObservers();
    }
}
