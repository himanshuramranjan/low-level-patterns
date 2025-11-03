package decorator_pattern.model;

import decorator_pattern.model.Beverage;

/**
 * Another concrete component implementing the base Beverage interface.
 * This represents a basic house blend coffee without any additional condiments.
 */
public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;  // Base price for house blend
    }
}