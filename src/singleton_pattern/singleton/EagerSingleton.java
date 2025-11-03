package singleton_pattern.singleton;

/**
 * Eager Initialization Singleton Pattern
 * 
 * Key Characteristics:
 * - Instance is created when class is loaded
 * - Thread-safe by default (JVM guarantees thread safety during class loading)
 * - No lazy loading - might waste resources if instance is not needed
 * 
 * Best Use Cases:
 * 1. Configuration Management:
 *    - Loading application configurations that are always needed
 *    - System settings that are used throughout the application
 * 
 * 2. Resource Management:
 *    - Database connection pools where connection is always needed
 *    - File system managers that are constantly used
 * 
 * 3. Cache Management:
 *    - Application-level cache that needs to be available immediately
 *    - Shared resource pools that are always required
 * 
 * Advantages:
 * - Simple implementation
 * - Guaranteed thread-safety
 * - No synchronization overhead in methods
 * 
 * Disadvantages:
 * - No lazy loading
 * - May waste resources if instance is never used
 * - No exception handling during instantiation
 */
public class EagerSingleton {
    // Create instance during class loading
    private static final EagerSingleton instance = new EagerSingleton();
    
    // Private constructor to prevent instantiation
    private EagerSingleton() {
        // Prevent instantiation via reflection
        if (instance != null) {
            throw new IllegalStateException("Instance already exists! Use getInstance() method.");
        }
    }
    
    public static EagerSingleton getInstance() {
        return instance;
    }
    
    // Example method demonstrating configuration management
    public void loadConfiguration() {
        System.out.println("Loading application configuration...");
        // Configuration loading logic
    }
    
    // Example method demonstrating resource management
    public void connectToDatabase() {
        System.out.println("Establishing database connection...");
        // Database connection logic
    }
}