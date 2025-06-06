package factory.notification.service;

import factory.notification.Notification;
import observer.utils.PrintHelper;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        PrintHelper.printHeader("\uD83D\uDCE7 Sending EMAIL: " + message);
    }
}

