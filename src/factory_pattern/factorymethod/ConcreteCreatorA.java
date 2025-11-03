package factory_pattern.factorymethod;

import factory_pattern.model.ConcreteProductA;
import factory_pattern.model.Product;

public class ConcreteCreatorA extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProductA();
    }
}
