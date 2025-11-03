package abstract_factory.furniture;

/**
 * Chair is a product interface that declares the operations all concrete chairs must implement.
 * This is part of the Abstract Factory pattern's product interface hierarchy.
 * Different styles of chairs (Modern, Victorian) will implement this interface.
 */
public interface Chair {
    void sitOn();    // Operation to simulate sitting on the chair
    String getStyle(); // Returns the style of the chair (e.g., "Modern", "Victorian")
}