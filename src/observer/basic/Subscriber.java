package observer;

public class Subscriber {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void updateSubscriber(String title) {
        System.out.println("Hey " + name + ", " + title + " uploaded");
    }

    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }

}
