package factory_pattern.model;

public class ConcreteProductA implements Product {
    @Override
    public String getName() {
        return "ProductA";
    }

    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}
