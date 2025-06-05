package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    List<Subscriber> subscribers = new ArrayList<>();
    private String title;

    public void subscribe(Subscriber subscriber) {

        subscribers.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber) {

        subscribers.remove(subscriber);
    }

    public void notifySubscriber(String videoTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.updateSubscriber(videoTitle);
        }
    }

    public void upload(String title) {

        this.title = title;
        notifySubscriber(title);
    }
}
