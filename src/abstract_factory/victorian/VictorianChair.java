package abstract_factory.victorian;

import abstract_factory.furniture.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on an ornate Victorian chair");
    }

    @Override
    public String getStyle() {
        return "Victorian";
    }
}