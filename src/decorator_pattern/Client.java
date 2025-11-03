package decorator_pattern;

import decorator_pattern.model.Beverage;
import decorator_pattern.model.Espresso;
import decorator_pattern.model.HouseBlend;
import decorator_pattern.pattern.Mocha;
import decorator_pattern.pattern.Soy;
import decorator_pattern.pattern.WhipCream;

/**
 * Client class demonstrates the Decorator pattern in action.
 * Shows how we can:
 * 1. Create basic beverages
 * 2. Add condiments (decorators) in any order
 * 3. Stack multiple decorators
 * 4. Calculate total cost and get complete description dynamically
 */
public class Client {
    public static void main(String[] args) {
        // Order 1: Espresso with double mocha and whipped cream
        System.out.println("=== Order 1 ===");
        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);      // Add mocha
        beverage1 = new Mocha(beverage1);      // Add second mocha
        beverage1 = new WhipCream(beverage1);  // Add whipped cream
        
        System.out.println("Description: " + beverage1.getDescription());
        System.out.printf("Cost: $%.2f%n", beverage1.cost());

        // Order 2: House Blend with soy and whipped cream
        System.out.println("\n=== Order 2 ===");
        Beverage beverage2 = new WhipCream(new Soy(new HouseBlend()));
        
        System.out.println("Description: " + beverage2.getDescription());
        System.out.printf("Cost: $%.2f%n", beverage2.cost());

        // Order 3: Just an Espresso (no decorators)
        System.out.println("\n=== Order 3 ===");
        Beverage beverage3 = new Espresso();
        System.out.println("Description: " + beverage3.getDescription());
        System.out.printf("Cost: $%.2f%n", beverage3.cost());
    }
}