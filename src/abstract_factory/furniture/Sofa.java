package abstract_factory.furniture;

/**
 * Sofa is another product interface in the Abstract Factory pattern.
 * It defines the contract for different styles of sofas.
 * Each concrete sofa implementation will provide its own unique behavior.
 */
public interface Sofa {
    void lieOn(); // Operation to simulate lying on the sofa

    String getStyle(); // Returns the style of the sofa (e.g., "Modern", "Victorian")
}