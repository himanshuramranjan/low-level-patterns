package observer_pattern.push;

/**
 * Observer (push model) - subject pushes the update payload to observers.
 */
public interface Observer {
    void update(String message);
}
