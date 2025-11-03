package proxy_pattern.pattern;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String password) {
        if ("admin".equalsIgnoreCase(user) && "admin123".equals(password)) {
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String command) throws Exception {
        if (isAdmin) {
            executor.runCommand(command);
        } else {
            if (command.trim().startsWith("rm")) {
                throw new Exception("Access Denied: Non-admin users cannot execute delete commands.");
            } else {
                executor.runCommand(command);
            }
        }
    }
}
