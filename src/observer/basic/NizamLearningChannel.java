package observer.basic;

import observer.utils.PrintHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * NizamLearningChannel is the Subject (Publisher) in the Observer Design Pattern.
 * It maintains a list of subscribers (observers) and notifies them when a new video is uploaded.
 * This class also follows the Singleton Pattern — only one channel instance is allowed.
 */
public class NizamLearningChannel {

    // Singleton instance (only one NizamLearningChannel can exist)
    private static NizamLearningChannel instance;

    // List of all subscribed observers
    List<SubscriberModel> subscribers = new ArrayList<>();

    // Title of the most recent video or default channel name
    private String title = "\uD83C\uDFE2 NizamLearning channel";  // 🏢 Emoji for channel

    /**
     * Private constructor prevents instantiation from other classes.
     */
    private NizamLearningChannel() {
    }

    /**
     * Returns the singleton instance of the channel.
     * If it hasn't been created yet, it initializes it.
     */
    public static NizamLearningChannel getInstance() {
        if (instance == null) {
            PrintHelper.printHeader(" \uD83C\uDFE2 NizamLearning channel created! ✅");
            return instance = new NizamLearningChannel();
        }
        return instance;
    }

    /**
     * Adds a subscriber to the list.
     *
     * @param subscriber the subscriber to be added
     */
    public void addSubscriber(SubscriberModel subscriber) {
        PrintHelper.printHeader(title + " - added " + subscriber.getName() + " as a subscriber.");
        subscribers.add(subscriber);
    }

    /**
     * Removes a subscriber from the list.
     *
     * @param subscriber the subscriber to be removed
     */
    public void removeSubscriber(SubscriberModel subscriber) {
        PrintHelper.printHeader(subscriber.getName() + " - removed " + " as a subscriber.");
        subscribers.remove(subscriber);
    }

    /**
     * Notifies all subscribers of a newly uploaded video.
     *
     * @param videoTitle the title of the new video
     */
    public void notifySubscribers(String videoTitle) {
        for (SubscriberModel subscriber : subscribers) {
            subscriber.notify(videoTitle);  // Observer's notify method
        }
    }

    /**
     * Uploads a new video and notifies all subscribers.
     *
     * @param title the title of the uploaded video
     */
    public void uploadVideo(String title) {
        // Print a formatted message about the upload
        PrintHelper.printImportantNews("NizamLearning Channel", "* Video uploaded\n\n - " + title);

        this.title = title;
        notifySubscribers(title);  // Trigger update to all observers
    }
}
