package decorator_pattern.pattern;

import decorator_pattern.model.Beverage;

/**
 * Concrete decorator that adds whipped cream to the beverage.
 * Demonstrates how decorators can be stacked to add multiple condiments.
 */
public class WhipCream extends CondimentDecorator {
    public WhipCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.30;  // Add cost of whipped cream
    }
}