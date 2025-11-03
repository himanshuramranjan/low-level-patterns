package chain_of_command_pattern.models;

import chain_of_command_pattern.models.pattern.DebugLogProcessor;
import chain_of_command_pattern.models.pattern.ErrorLogProcessor;
import chain_of_command_pattern.models.pattern.InfoLogProcessor;
import chain_of_command_pattern.models.pattern.LogProcessor;

public class Client {
    public static void main(String[] args) {

        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this ");
        logObject.log(LogProcessor.INFO, "just for info ");

    }
}