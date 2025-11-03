package abstract_factory.victorian;

import abstract_factory.furniture.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void putOn() {
        System.out.println("Putting items on an antique Victorian coffee table");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}