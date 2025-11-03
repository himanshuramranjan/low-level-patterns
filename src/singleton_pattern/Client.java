package singleton_pattern;

import singleton_pattern.singleton.BillPughSingleton;
import singleton_pattern.singleton.DoubleCheckSingleton;
import singleton_pattern.singleton.EagerSingleton;
import singleton_pattern.singleton.EnumSingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Client code demonstrating different Singleton implementations with practical use cases
 * and thread safety testing
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        demonstrateBasicSingletonUsage();
        demonstrateThreadSafety();
        demonstratePracticalUseCases();
    }
    private static void demonstrateBasicSingletonUsage() {
        System.out.println("\n=== Basic Singleton Usage ===");

        // Eager Singleton Demo
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("Eager Singleton Objects Same? " + (eagerSingleton1 == eagerSingleton2));
        eagerSingleton1.loadConfiguration();
        eagerSingleton2.connectToDatabase();

        // Double Check Singleton Demo
        DoubleCheckSingleton doubleCheck1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton doubleCheck2 = DoubleCheckSingleton.getInstance();
        System.out.println("Double Check Singleton Objects Same? " + (doubleCheck1 == doubleCheck2));
        doubleCheck1.initializeDatabaseConnection();
        doubleCheck2.logMessage("Test message");

        // Bill Pugh Singleton Demo
        BillPughSingleton billPugh1 = BillPughSingleton.getInstance();
        BillPughSingleton billPugh2 = BillPughSingleton.getInstance();
        System.out.println("Bill Pugh Singleton Objects Same? " + (billPugh1 == billPugh2));
        billPugh1.registerPlugin("Security Plugin");
        billPugh2.allocateResource("Memory Pool");

        // Enum Singleton Demo
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println("Enum Singleton Objects Same? " + (enumSingleton1 == enumSingleton2));
        enumSingleton1.setConfiguration("MAX_CONNECTIONS=100");
        System.out.println("Config Value: " + enumSingleton2.getConfiguration());
    }

    /**
     * Demonstrates thread safety of different singleton implementations
     */
    private static void demonstrateThreadSafety() throws InterruptedException {
        System.out.println("\n=== Thread Safety Test ===");
        
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        // Test each singleton type with multiple threads
        for (int i = 0; i < 5; i++) {
            executor.execute(() -> {
                // Access each singleton type
                EagerSingleton.getInstance().loadConfiguration();
                DoubleCheckSingleton.getInstance().logMessage("Thread: " + Thread.currentThread().getName());
                BillPughSingleton.getInstance().registerPlugin("Plugin-" + Thread.currentThread().getName());
                EnumSingleton.INSTANCE.toggleFeature(true);
            });
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Thread safety test completed.");
    }

    /**
     * Demonstrates practical use cases for each singleton type
     */
    private static void demonstratePracticalUseCases() {
        System.out.println("\n=== Practical Use Cases ===");

        // Eager Singleton for Configuration
        EagerSingleton config = EagerSingleton.getInstance();
        config.loadConfiguration();
        config.connectToDatabase();

        // Double Check Singleton for Logging
        DoubleCheckSingleton logger = DoubleCheckSingleton.getInstance();
        logger.logMessage("Application started");
        logger.logMessage("Processing request");
        logger.logMessage("Request completed");

        // Bill Pugh Singleton for Plugin Management
        BillPughSingleton pluginManager = BillPughSingleton.getInstance();
        pluginManager.registerPlugin("Authentication");
        pluginManager.registerPlugin("Authorization");
        pluginManager.allocateResource("Cache Memory");

        // Enum Singleton for Feature Flags
        EnumSingleton featureFlags = EnumSingleton.INSTANCE;
        featureFlags.setConfiguration("DARK_MODE=true");
        featureFlags.toggleFeature(true);
        System.out.println("Dark Mode Enabled: " + featureFlags.isFeatureEnabled());
    }
}