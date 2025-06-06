package observer.basic;

/**
 * Entry point of the application that demonstrates
 * the Observer Design Pattern using NizamLearningChannel.
 */
public class Main {

    public static void main(String[] args) {
        // Get the singleton instance of the channel (Subject)
        NizamLearningChannel nizamLearning = NizamLearningChannel.getInstance();

        // Create subscribers (Observers)
        SubscriberModel nizamUddin = new SubscriberModel("Nizam Uddin");
        SubscriberModel zahidHasan = new SubscriberModel("Zahid Hasan");
        SubscriberModel alRazi = new SubscriberModel("Al-Razi");

        // Add subscriber directly to the channel
        nizamLearning.addSubscriber(nizamUddin);

        // Zahid subscribes through his own method (encapsulation)
        zahidHasan.subscribeChannel(nizamLearning);

        // Al-Razi is added both directly and via his method
        nizamLearning.addSubscriber(alRazi);
        alRazi.subscribeChannel(nizamLearning);

        // First video uploaded — all current subscribers get notified
        nizamLearning.uploadVideo("Video 1 - Basic Programming");

        // Al-Razi unsubscribes
        nizamLearning.removeSubscriber(alRazi);

        // Second video uploaded — only remaining subscribers are notified
        nizamLearning.uploadVideo("Video 2 - Object Oriented Programming");
    }
}
