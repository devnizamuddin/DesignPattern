package observer;

public class ObserverPatternExample {

    public static void main(String[] args) {
        Channel telusko = new Channel();

        Subscriber subscriber1 = new Subscriber("Nizam");
        Subscriber subscriber2 = new Subscriber("Shahadat");
        Subscriber subscriber3 = new Subscriber("Zahid");
        Subscriber subscriber4 = new Subscriber("Al-Razi");
        Subscriber subscriber5 = new Subscriber("Masum");

        telusko.subscribe(subscriber1);
        telusko.subscribe(subscriber2);
        telusko.subscribe(subscriber3);
        telusko.subscribe(subscriber4);
        telusko.subscribe(subscriber5);

        subscriber1.subscribeChannel(telusko);
        subscriber2.subscribeChannel(telusko);
        subscriber3.subscribeChannel(telusko);
        subscriber4.subscribeChannel(telusko);
        subscriber5.subscribeChannel(telusko);

        telusko.upload("How to learn programming");

    }
}
