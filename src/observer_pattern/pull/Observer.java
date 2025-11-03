package observer_pattern.pull;

/**
 * Observer (pull model) - subject notifies observers, observers pull state from subject.
 */
public interface Observer {
    void update(Subject subject);
}
