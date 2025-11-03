package abstract_factory;

import abstract_factory.furniture.Chair;
import abstract_factory.furniture.Sofa;
import abstract_factory.furniture.CoffeeTable;

/**
 * Client demonstrates how to use the Abstract Factory pattern.
 * 
 * Key points demonstrated:
 * 1. Client works with factories and products through abstract interfaces
 * 2. Client doesn't know (or care) which concrete classes it's using
 * 3. All products from a factory are guaranteed to be compatible
 * 4. Easy to switch entire product families by using different factories
 */
public class Client {
    public static void main(String[] args) {
        // Create a modern furniture set using ModernFurnitureFactory
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        createFurnitureSet(modernFactory, "Modern");

        System.out.println("\n------------------------\n");

        // Create a Victorian furniture set using VictorianFurnitureFactory
        // Note how easy it is to switch the entire furniture family
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        createFurnitureSet(victorianFactory, "Victorian");
    }

    /**
     * Helper method to demonstrate creating and using a complete furniture set.
     * Shows how all products from the same factory work together.
     */
    private static void createFurnitureSet(FurnitureFactory factory, String style) {
        System.out.println("Creating " + style + " Furniture Set:");
        
        // Create all furniture pieces using the same factory
        // This ensures they are of the same family/style
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();

        // Test each piece of furniture
        System.out.println("\nTesting " + style + " furniture:");
        chair.sitOn();
        sofa.lieOn();
        coffeeTable.putOn();
    }
}