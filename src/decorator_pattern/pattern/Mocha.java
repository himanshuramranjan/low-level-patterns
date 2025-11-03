package decorator_pattern.pattern;

import decorator_pattern.model.Beverage;

/**
 * Concrete decorator that adds mocha to the beverage.
 * It extends CondimentDecorator and provides specific implementation
 * for adding mocha's cost and description.
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";  // Add mocha to the description
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;  // Add cost of mocha
    }
}