package chain_of_command_pattern.models.pattern;

public abstract class LogProcessor {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    LogProcessor nextLogProcessor;

    protected LogProcessor(LogProcessor loggerProcessor) {
        this.nextLogProcessor = loggerProcessor;
    }

    public void log(int logLevel, String message) {
        if(nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }
}
