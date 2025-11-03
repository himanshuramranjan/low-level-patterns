package factory_pattern.model;

public class ConcreteProductB implements Product {
    @Override
    public String getName() {
        return "ProductB";
    }

    @Override
    public void use() {
        System.out.println("Using Product B");
    }
}
