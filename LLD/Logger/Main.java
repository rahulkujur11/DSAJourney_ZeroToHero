package LLD.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        // Set log level to INFO, so all levels are logged
        logger.setLogLevel(Logger.LogLevel.ERROR);
        logger.log(Logger.LogLevel.INFO, "This is an info message.");
        logger.log(Logger.LogLevel.DEBUG, "This is a debug message.");
        logger.log(Logger.LogLevel.ERROR, "This is an error message.");

        // Change log level to DEBUG, so INFO messages are ignored
        logger.setLogLevel(Logger.LogLevel.DEBUG);
        logger.log(Logger.LogLevel.INFO, "This info message will not be shown.");
        logger.log(Logger.LogLevel.DEBUG, "This is a debug message.");
        logger.log(Logger.LogLevel.ERROR, "This is another error message.");

        // Change log level to ERROR, only ERROR messages will be shown
        logger.setLogLevel(Logger.LogLevel.ERROR);
        logger.log(Logger.LogLevel.INFO, "This info message will not be shown.");
        logger.log(Logger.LogLevel.DEBUG, "This debug message will not be shown.");
        logger.log(Logger.LogLevel.ERROR, "This is a final error message.");
    }
}

