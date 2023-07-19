package singleton;

public class SingletonPatternExample {

    /**
     * The Singleton pattern ensures that a class has only one instance
     * and provides a global point of access to that instance
     *
     * In mobile app development,
     * the Singleton pattern is often used to ensure that
     * there is only one instance of a particular class throughout the app's lifecycle.
     * such as database connection.
     */

    public static void main(String[] args) {

        DatabaseConnection networkCall = DatabaseConnection.getInstance();
        networkCall.getUser();

    }
}
