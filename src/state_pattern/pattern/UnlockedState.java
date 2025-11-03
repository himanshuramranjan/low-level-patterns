package state_pattern.pattern;

import state_pattern.TurnstileContext;

/**
 * UnlockedState: When unlocked, pushing will pass and relock the turnstile; inserting extra coins returns them.
 */
public class UnlockedState extends StateImpl {
    @Override
    public void insertCoin(TurnstileContext context) {
        log("Already unlocked. Coin returned.");
    }

    @Override
    public void push(TurnstileContext context) {
        log("You passed through. Locking turnstile.");
        context.setState(new LockedState());
    }

    @Override
    public String name() {
        return "UNLOCKED";
    }
}