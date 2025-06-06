package factory.notification.service;

import factory.notification.Notification;
import observer.utils.PrintHelper;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        PrintHelper.printHeader("Sending SMS: " + message);
    }
}

