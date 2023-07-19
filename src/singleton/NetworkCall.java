package singleton;

public class NetworkCall {

    /**
     * This is a singleton class.
     * Object can not be created with new keyword.
     * You have to call getInstance method to create object of this class
     */

    // Instance of this class must be in private in singleton class
    private static NetworkCall instance;

    // Constructor must be in private in singleton class
    private NetworkCall() {
    }

    public static NetworkCall getInstance() {
        if (instance == null) {
            instance = new NetworkCall();
        }
        return instance;
    }

    public void doNetworkCall(){
        System.out.println("Doing network call..");
    }

}
