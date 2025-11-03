package singleton_pattern.singleton;

/**
 * Enum Singleton Pattern
 * 
 * Key Characteristics:
 * - Guaranteed serialization by JVM
 * - Thread-safe by default
 * - Prevents reflection attacks
 * - Perfect for constant configurations
 * 
 * Best Use Cases:
 * 1. Configuration Management:
 *    - Application settings
 *    - Feature flags/toggles
 *    - Environment configurations
 * 
 * 2. State Management:
 *    - Application state machines
 *    - Game states
 *    - Process control states
 * 
 * 3. Registry Pattern Implementation:
 *    - Type registries
 *    - Strategy registries
 *    - Command registries
 * 
 * Advantages:
 * - Serialization guaranteed
 * - Reflection-proof
 * - Thread-safe by default
 * - Simplest implementation
 * 
 * Disadvantages:
 * - Eager initialization only
 * - Limited flexibility (can't extend other classes)
 * - All enum constants are public static final
 */
public enum EnumSingleton {
    INSTANCE;
    
    private String configValue;
    private boolean featureFlag;
    
    EnumSingleton() {
        // Initialize default values
        this.configValue = "default";
        this.featureFlag = false;
    }
    
    // Example method demonstrating configuration management
    public void setConfiguration(String value) {
        this.configValue = value;
        System.out.println("Configuration updated to: " + value);
    }
    
    public String getConfiguration() {
        return configValue;
    }
    
    // Example method demonstrating feature flag management
    public void toggleFeature(boolean enabled) {
        this.featureFlag = enabled;
        System.out.println("Feature " + (enabled ? "enabled" : "disabled"));
    }
    
    public boolean isFeatureEnabled() {
        return featureFlag;
    }
}