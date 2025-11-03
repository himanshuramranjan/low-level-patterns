package state_pattern.pattern;

import state_pattern.TurnstileContext;

/**
 * LockedState: When the turnstile is locked, pushing does nothing; inserting a coin unlocks it.
 */
public class LockedState extends StateImpl {
    @Override
    public void insertCoin(TurnstileContext context) {
        log("Coin inserted. Unlocking turnstile.");
        context.setState(new UnlockedState());
    }

    @Override
    public void push(TurnstileContext context) {
        log("Turnstile is locked. You cannot pass.");
    }

    @Override
    public String name() {
        return "LOCKED";
    }
}