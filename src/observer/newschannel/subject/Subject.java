package observer.newschannel.subject;

import observer.newschannel.observer.Observer;

/**
 * Subject interface for the Observer Design Pattern.
 * Defines the contract for any class that wants to be observed.
 */
public interface Subject {

    /**
     * Attach (subscribe) an observer to this subject.
     *
     * @param o the observer to be added
     */
    void attach(Observer o);

    /**
     * Detach (unsubscribe) an observer from this subject.
     *
     * @param o the observer to be removed
     */
    void detach(Observer o);

    /**
     * Notify all registered observers of a state change.
     * Typically called when the internal state of the subject changes.
     */
    void notifyObservers();
}
