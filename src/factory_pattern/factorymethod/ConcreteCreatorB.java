package factory_pattern.factorymethod;

import factory_pattern.model.ConcreteProductB;
import factory_pattern.model.Product;

public class ConcreteCreatorB extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProductB();
    }
}
