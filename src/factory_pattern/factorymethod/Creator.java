package factory_pattern.factorymethod;

import factory_pattern.model.Product;

/**
 * Factory Method pattern - Creator declares factory method returning Product.
 */
public abstract class Creator {
    // Factory method
    protected abstract Product factoryMethod();

    // Business logic that uses the product
    public void doSomething() {
        Product p = factoryMethod();
        System.out.println("Creator: created product -> " + p.getName());
        p.use();
    }
}
