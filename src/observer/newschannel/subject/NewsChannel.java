package observer.newschannel.subject;

import observer.newschannel.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of the Subject interface.
 * Acts as a news publisher (subject) that notifies all subscribed observers when news is published.
 */
public class NewsChannel implements Subject {

    // List to hold all observers (subscribers) interested in receiving news updates
    private List<Observer> observerList = new ArrayList<>();

    // The latest news that will be sent to all observers
    private String news;

    /**
     * Attach (subscribe) an observer to the channel.
     *
     * @param observer the observer to be added
     */
    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * Detach (unsubscribe) an observer from the channel.
     *
     * @param observer the observer to be removed
     */
    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * Notify all registered observers by calling their update() method.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(news);
        }
    }

    /**
     * Publish new news to the channel.
     * Updates the internal news field and notifies all observers.
     *
     * @param news the news content to be published
     */
    public void publishNews(String news) {
        this.news = news;
        notifyObservers(); // Notify all observers about the new update
    }
}
