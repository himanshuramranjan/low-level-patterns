package state_pattern;

import state_pattern.pattern.LockedState;
import state_pattern.pattern.State;

/**
 * Context for the Turnstile example. Delegates behavior to the current State.
 */
public class TurnstileContext {
    private State currentState;

    public TurnstileContext() {
        // Default state is locked
        this.currentState = new LockedState();
    }

    public void setState(State state) {
        this.currentState = state;
        System.out.println("State changed to: " + state.name());
    }

    public State getState() {
        return currentState;
    }

    // Actions delegated to the current state
    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void push() {
        currentState.push(this);
    }

    @Override
    public String toString() {
        return "TurnstileContext{" + "state=" + currentState.name() + '}';
    }
}