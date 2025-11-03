package singleton_pattern.singleton;

/**
 * Double Checked Locking Singleton Pattern
 * 
 * Key Characteristics:
 * - Lazy initialization
 * - Thread-safe with minimal synchronization
 * - Uses volatile keyword to prevent partially initialized instances
 * 
 * Best Use Cases:
 * 1. Resource-Intensive Services:
 *    - Database connection managers that are expensive to create
 *    - File system handlers that need lazy initialization
 *    - Heavy external service clients (e.g., REST clients, SOAP clients)
 * 
 * 2. High-Concurrency Scenarios:
 *    - Connection pools in multi-threaded applications
 *    - Thread-safe logging services
 *    - Shared resource managers in concurrent environments
 * 
 * 3. Memory-Sensitive Applications:
 *    - Mobile applications where memory is crucial
 *    - Systems with multiple heavyweight singletons
 *    - Applications with conditional resource usage
 * 
 * Advantages:
 * - Lazy initialization
 * - High performance in multi-threaded environments
 * - Thread-safe without excessive synchronization
 * 
 * Disadvantages:
 * - Complex implementation
 * - Requires volatile keyword understanding
 * - Potential issues with Java versions before 1.5
 */
public class DoubleCheckSingleton {
    // volatile keyword ensures that multiple threads handle the instance variable correctly
    private static volatile DoubleCheckSingleton instance;
    
    private DoubleCheckSingleton() {
        // Prevent instantiation via reflection
        if (instance != null) {
            throw new IllegalStateException("Instance already exists! Use getInstance() method.");
        }
    }
    
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
    
    // Example method demonstrating resource-intensive operation
    public void initializeDatabaseConnection() {
        System.out.println("Initializing expensive database connection...");
        // Simulate expensive initialization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    // Example method demonstrating thread-safe logging
    public void logMessage(String message) {
        System.out.println("Thread " + Thread.currentThread().getName() + ": " + message);
    }
}