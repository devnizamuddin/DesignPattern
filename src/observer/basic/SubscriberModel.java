package observer.basic;

import observer.utils.PrintHelper;

/**
 * Represents a subscriber (observer) to the NizamLearningChannel.
 * This class holds subscriber information and defines how they get notified.
 */
public class SubscriberModel {

    // The name of the subscriber
    private String name;

    /**
     * Constructor to initialize the subscriber's name.
     *
     * @param name the name of the subscriber
     */
    public SubscriberModel(String name) {
        PrintHelper.printHeader(" \uD83D\uDC68\u200D\uD83D\uDCBB "+name+" user created! ✅");
        this.name = name;
    }

    /**
     * Returns the subscriber's name with a programmer emoji prefix.
     *
     * @return formatted name of the subscriber
     */
    public String getName() {
        return "\uD83D\uDC68\u200D\uD83D\uDCBB " + name;  // 👨‍💻 + name
    }

    /**
     * Subscribes this subscriber to a NizamLearningChannel.
     *
     * @param channel the channel to subscribe to
     */
    public void subscribeChannel(NizamLearningChannel channel) {
        channel.addSubscriber(this);
    }

    public void unSubscribeChannel(NizamLearningChannel channel) {
        channel.removeSubscriber(this);
    }

    /**
     * This method is called when the channel publishes new content.
     * Acts as the update/notification method.
     *
     * @param title the title of the new video/content
     */
    public void notify(String title) {
        System.out.println(
                "\uD83D\uDC42 Hey " + getName() + ",\n" +  // 👂 Hey [Name]
                        title + " has been uploaded on NizamLearning Channel\n"
        );
    }
}
