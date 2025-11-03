package decorator_pattern.model;

/**
 * The base Component interface declares operations that can be altered by decorators.
 * In this case, it represents a basic beverage that can be ordered.
 */
public interface Beverage {
    String getDescription();  // Get the description of the beverage with any added condiments
    double cost();           // Calculate the total cost including any condiments
}