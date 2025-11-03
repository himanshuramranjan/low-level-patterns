package state_pattern.pattern;

import state_pattern.TurnstileContext;

/**
 * State interface for a simple turnstile example.
 * Defines actions that change behavior depending on the current state.
 *
 * Notes / Alternatives:
 * - Adapter / Abstract base class (StateAdapter): If your State interface grows
 *   to include many methods and most concrete states only implement a subset,
 *   an abstract adapter with default no-op implementations reduces boilerplate.
 *   Use an adapter when you also want to provide shared helper methods or
 *   protected fields to concrete states.
 *
 * - Interface default methods (Java 8+): You can supply default implementations
 *   directly on the interface (e.g., default void push(...) { }). This keeps
 *   multiple-inheritance of types possible (states can still extend another
 *   class) and is lightweight. Prefer interface defaults for simple no-op
 *   behavior. Prefer an adapter class if you need shared state or helper logic.
 *
 * - Trade-offs: Default no-ops can hide missing behavior; prefer explicit
 *   overrides when state actions are critical. Adapters are convenient for
 *   learning examples and when adding new actions gradually.
 */
public interface State {
    void insertCoin(TurnstileContext context);
    void push(TurnstileContext context);
    String name();
}