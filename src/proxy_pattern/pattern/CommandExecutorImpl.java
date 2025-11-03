package proxy_pattern.pattern;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String command) throws Exception {
        System.out.println("'" + command + "' command executed successfully.");
    }
}
