package decorator_pattern.pattern;

import decorator_pattern.model.Beverage;

/**
 * Abstract decorator class that implements the component interface and holds
 * a reference to a component object. This class ensures all decorators follow
 * the same interface as the component they decorate.
 */
public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage;  // The beverage being decorated

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    // The abstract class implements Beverage but doesn't provide implementations
    // forcing concrete decorators to override these methods
}