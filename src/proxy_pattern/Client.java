package proxy_pattern;

import proxy_pattern.pattern.CommandExecutor;
import proxy_pattern.pattern.CommandExecutorProxy;


// The Proxy Pattern acts as a substitute or placeholder for another object to control access to it.
// The proxy performs additional operations — like security, caching, lazy loading,
// or access control — before delegating to the real object.



// A system that executes shell commands (e.g., deleting files).
// Only Admins are allowed to execute dangerous commands.
// Normal users can run only safe commands.
// The proxy acts as a security gatekeeper between the client and the real executor.

public class Client {
    public static void main(String[] args) {
        CommandExecutor userExecutor = new CommandExecutorProxy("guest", "guest123");
        CommandExecutor adminExecutor = new CommandExecutorProxy("admin", "admin123");

        try {
            System.out.println("Guest trying to execute commands:");
            userExecutor.runCommand("ls -ltr");
            userExecutor.runCommand("rm -rf test.txt");  // should fail
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\nAdmin executing commands:");
        try {
            adminExecutor.runCommand("rm -rf test.txt");  // allowed
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}