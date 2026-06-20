public class SingletonPatternExample {

    // Singleton Logger Class
    static class Logger {

        // Single instance of Logger
        private static Logger instance;

        // Private constructor
        private Logger() {
            System.out.println("Logger Instance Created");
        }

        // Public method to get the single instance
        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        // Logging method
        public void log(String message) {
            System.out.println("LOG: " + message);
        }
    }

    // Test Singleton Pattern
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        System.out.println("\nChecking instances:");

        System.out.println("Logger1 HashCode: " + logger1.hashCode());
        System.out.println("Logger2 HashCode: " + logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists (Singleton Pattern).");
        } else {
            System.out.println("Multiple instances exist.");
        }
    }
}