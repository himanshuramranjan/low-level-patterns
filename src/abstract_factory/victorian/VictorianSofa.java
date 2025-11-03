package abstract_factory.victorian;

import abstract_factory.furniture.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a luxurious Victorian sofa");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}