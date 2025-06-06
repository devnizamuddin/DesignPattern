package observer.basic;

/**
 * Entry point of the application that demonstrates
 * the Observer Design Pattern using NizamLearningChannel.
 */
public class Main {

    public static void main(String[] args) {
        // Get the singleton instance of the channel (NizamLearningChannel)
        NizamLearningChannel nizamLearning = NizamLearningChannel.getInstance();

        // Create subscribers (Observers)
        SubscriberModel nizamUddin = new SubscriberModel("Nizam Uddin");
        SubscriberModel mirzaMahmud = new SubscriberModel("Mirza Mahmud");
        SubscriberModel hanifUddin = new SubscriberModel("Hanif uddin");

        // Add subscriber directly to the channel
        nizamLearning.addSubscriber(nizamUddin);

        // Mirza subscribes through his own method (encapsulation)
        mirzaMahmud.subscribeChannel(nizamLearning);

        // Hanif subscribes through his own method (encapsulation)
        hanifUddin.subscribeChannel(nizamLearning);

        // First video uploaded — all current subscribers get notified
        nizamLearning.uploadVideo("Video 1 - Basic Programming");

        // Remove subscriber
        nizamLearning.removeSubscriber(mirzaMahmud);

        // Chancel Subscription
        hanifUddin.unSubscribeChannel(nizamLearning);

        // Second video uploaded — only remaining subscribers are notified
        nizamLearning.uploadVideo("Video 2 - Object Oriented Programming");
    }
}
