package factory_pattern;

import factory_pattern.model.ConcreteProductA;
import factory_pattern.model.ConcreteProductB;
import factory_pattern.model.Product;

/**
 * Simple Factory (not a GoF pattern but commonly used):
 * a single factory class with a static method to create products.
 */
public class SimpleFactory {
    public static Product createProduct(String type) {
        if ("A".equalsIgnoreCase(type)) {
            return new ConcreteProductA();
        } else if ("B".equalsIgnoreCase(type)) {
            return new ConcreteProductB();
        }
        throw new IllegalArgumentException("Unknown product type: " + type);
    }
}