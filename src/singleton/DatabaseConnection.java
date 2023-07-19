package singleton;

public class DatabaseConnection {

    /**
     * This is a singleton class.
     * Object can not be created with new keyword.
     * You have to call getInstance method to create object of this class
     */

    // Instance of this class must be in private in singleton class
    private static DatabaseConnection instance;

    // Constructor must be in private in singleton class
    private DatabaseConnection() {
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void getUser(){
        System.out.println("User");
    }

}
