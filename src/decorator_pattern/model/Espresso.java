package decorator_pattern.model;

import decorator_pattern.model.Beverage;

/**
 * Concrete component that provides the basic implementation of the Beverage interface.
 * This represents a simple espresso without any additional condiments.
 */
public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;  // Base price for espresso
    }
}