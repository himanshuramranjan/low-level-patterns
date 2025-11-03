package abstract_factory.furniture;

/**
 * CoffeeTable is the third product interface in our furniture family.
 * Part of the Abstract Factory pattern's product hierarchy.
 * Concrete implementations will provide style-specific behavior.
 */
public interface CoffeeTable {
    void putOn();    // Operation to simulate putting items on the coffee table
    String getStyle(); // Returns the style of the coffee table
}