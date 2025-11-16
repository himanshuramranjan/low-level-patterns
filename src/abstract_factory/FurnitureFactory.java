package abstract_factory;

import abstract_factory.furniture.Chair;
import abstract_factory.furniture.Sofa;
import abstract_factory.furniture.CoffeeTable;

/**
 * The Abstract Factory interface declares a set of methods for creating each
 * type of furniture.
 * This is the core of the Abstract Factory pattern - it provides an interface
 * for creating
 * families of related or dependent objects without specifying their concrete
 * classes.
 * 
 * Each method creates a different type of furniture, but ensures they're all in
 * the same style
 * (Modern or Victorian) when implemented by concrete factories.
 */
public interface FurnitureFactory {
    // Creates a chair in the specific style of this factory
    Chair createChair();

    // Creates a sofa in the specific style of this factory
    Sofa createSofa();

    // Creates a coffee table in the specific style of this factory
    CoffeeTable createCoffeeTable();
}