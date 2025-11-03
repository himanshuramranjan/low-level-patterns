package abstract_factory.modern;

import abstract_factory.furniture.Chair;

/**
 * ModernChair is a concrete product implementation of the Chair interface.
 * It represents a chair in the modern furniture family.
 * This is one of the products created by the ModernFurnitureFactory.
 */
public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern minimalist chair");
    }

    @Override
    public String getStyle() {
        return "Modern";
    }
}