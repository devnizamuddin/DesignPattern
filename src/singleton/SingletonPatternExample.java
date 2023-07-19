package singleton;

public class SingletonPatternExample {

    /**
     * The Singleton pattern ensures that a class has only one instance
     * and provides a global point of access to that instance
     */

    public static void main(String[] args) {

        NetworkCall networkCall = NetworkCall.getInstance();
        networkCall.doNetworkCall();

    }
}
