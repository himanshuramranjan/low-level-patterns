package abstract_factory;

import abstract_factory.furniture.Chair;
import abstract_factory.furniture.Sofa;
import abstract_factory.furniture.CoffeeTable;
import abstract_factory.modern.ModernChair;
import abstract_factory.modern.ModernSofa;
import abstract_factory.modern.ModernCoffeeTable;

/**
 * ModernFurnitureFactory is a concrete implementation of the FurnitureFactory interface.
 * It creates a family of modern-style furniture products.
 * 
 * This factory ensures that all furniture pieces created are in the modern style and
 * are compatible with each other. This is a key benefit of the Abstract Factory pattern -
 * it guarantees that products are of the same family.
 */
public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}