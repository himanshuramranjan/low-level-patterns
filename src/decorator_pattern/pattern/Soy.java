package decorator_pattern.pattern;

import decorator_pattern.model.Beverage;

/**
 * Concrete decorator that adds soy milk to the beverage.
 * Shows how different types of additions can be made to the base beverage.
 */
public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;  // Add cost of soy
    }
}