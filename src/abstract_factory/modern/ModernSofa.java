package abstract_factory.modern;

import abstract_factory.furniture.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a modern sectional sofa");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}