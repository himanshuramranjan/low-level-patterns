package factory_pattern;

import factory_pattern.factorymethod.ConcreteCreatorA;
import factory_pattern.factorymethod.ConcreteCreatorB;
import factory_pattern.model.Product;

/**
 * Client demonstrating Simple Factory and Factory Method examples.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-- SimpleFactory demo --");
        Product p1 = SimpleFactory.createProduct("A");
        System.out.println("Created: " + p1.getName());
        p1.use();

        Product p2 = SimpleFactory.createProduct("B");
        System.out.println("Created: " + p2.getName());
        p2.use();

        System.out.println("\n-- FactoryMethod demo --");
        ConcreteCreatorA creatorA = new ConcreteCreatorA();
        creatorA.doSomething();

        ConcreteCreatorB creatorB = new ConcreteCreatorB();
        creatorB.doSomething();
    }
}
