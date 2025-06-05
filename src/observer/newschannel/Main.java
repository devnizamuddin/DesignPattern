package observer.newschannel;

import observer.newschannel.observer.EmailSubscriber;
import observer.newschannel.observer.Observer;
import observer.newschannel.observer.SMSSubscriber;
import observer.newschannel.subject.NewsChannel;

public class Main {
    public static void main(String[] args) {
        NewsChannel channel = new NewsChannel();

        Observer emailUser = new EmailSubscriber("Nizam Uddin");
        Observer smsUser = new SMSSubscriber("Mehedy Hasan");

        channel.attach(emailUser);
        channel.attach(smsUser);

        channel.publishNews("New Java version released!");
    }
}

