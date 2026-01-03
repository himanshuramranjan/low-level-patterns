package singleton_pattern.singleton;

/**
 * Bill Pugh Singleton Implementation (Initialization-on-demand holder idiom)
 * 
 * Key Characteristics:
 * - Lazy initialization using inner static helper class
 * - Thread-safe without synchronization
 * - Utilizes JVM class loader's behavior
 * 
 * Best Use Cases:
 * 1. Perfect for Memory-Critical Applications:
 * - Android applications
 * - Memory-sensitive desktop applications
 * - Embedded systems with limited resources
 * 
 * 2. High-Performance Requirements:
 * - Real-time systems requiring quick access
 * - High-throughput services
 * - Performance-critical components
 * 
 * 3. Framework Development:
 * - Plugin managers
 * - Service locators
 * - Resource managers in frameworks
 * 
 * Advantages:
 * - Most efficient thread-safe singleton
 * - Zero synchronization overhead
 * - Perfect lazy initialization
 * - Simple and elegant
 * 
 * Disadvantages:
 * - Can't pass parameters to constructor
 * - Reflection can still break singleton pattern
 */
public class BillPughSingleton {
    private BillPughSingleton() {
        // Private constructor
        // Prevent reflection instantiation
        if (SingletonHelper.INSTANCE != null) {
            throw new IllegalStateException("Instance already exists! Use getInstance() method.");
        }
    }

    // Inner static helper class - not loaded until getInstance() is called
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    // Example method demonstrating plugin management
    public void registerPlugin(String pluginName) {
        System.out.println("Registering plugin: " + pluginName);
        // Plugin registration logic
    }

    // Example method demonstrating resource management
    public void allocateResource(String resourceName) {
        System.out.println("Allocating resource: " + resourceName);
        // Resource allocation logic
    }
}