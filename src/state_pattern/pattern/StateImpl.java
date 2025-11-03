package state_pattern.pattern;

import state_pattern.TurnstileContext;

/**
 * StateAdapter provides default (no-op) implementations of the State interface.
 *
 * Use this when many concrete State classes only need to implement a subset
 * of State methods. The adapter reduces boilerplate and can provide shared
 * helper methods or protected fields for subclasses.
 *
 * Caution: default no-ops may hide logic mistakes. Prefer explicit overrides
 * for critical behavior. If you only need trivial defaults, consider using
 * interface default methods instead so concrete states can still extend
 * other classes.
 */
public abstract class StateImpl implements State {
    @Override
    public void insertCoin(TurnstileContext context) {
        System.out.println("Invalid behaviour");
    }

    @Override
    public void push(TurnstileContext context) {
        System.out.println("Invalid behaviour");
    }

    @Override
    public String name() {
        return "UNKNOWN";
    }

    // Protected helper for subclasses
    protected void log(String message) {
        System.out.println(message);
    }
}
