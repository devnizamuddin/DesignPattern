package factory.notification.service;

import factory.notification.Notification;
import observer.utils.PrintHelper;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        PrintHelper.printHeader("\uD83D\uDD14 Sending PUSH: " + message);
    }
}

