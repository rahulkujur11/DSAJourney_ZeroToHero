package LLD.Logger;

public class Logger {

    // Step 1: Create a private static instance of Logger
    private static volatile Logger instance;
    

    // Step 2: Define different log levels
    public enum LogLevel{
        INFO, DEBUG, ERROR
    }

    // Step 3: Initialize the default log level
    LogLevel logLevel = LogLevel.INFO;


    // Step 4: Private constructor to prevent instantiation
    private Logger(){}


    // Step 5: Public method to provide a global access point with thread-safe Singleton using double-checked locking
    public static Logger getInstance(){
        if(instance == null){
            synchronized (Logger.class) {
                if(instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Method to set the log level
    public void setLogLevel(LogLevel logLevel){
        this.logLevel = logLevel;
    }


    // Logging method that filters messages based on the log level
    public void log(LogLevel level, String message) {
        if (shouldLog(level)) {
            System.out.println("[" + level + "] " + message);
        }
    }

    
    // Helper method to check if a message should be logged based on the set log level
    private boolean shouldLog(LogLevel level) {
        switch (logLevel) {
            case ERROR:
                return level == LogLevel.ERROR;
            case DEBUG:
                return level == LogLevel.DEBUG || level == LogLevel.ERROR;
            case INFO:
            default:
                return true;
        }
    }

    
}


