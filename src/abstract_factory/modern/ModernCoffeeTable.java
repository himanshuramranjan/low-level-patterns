package abstract_factory.modern;

import abstract_factory.furniture.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void putOn() {
        System.out.println("Putting items on a modern glass coffee table");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}