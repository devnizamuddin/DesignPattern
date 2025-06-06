package factory.notification;

import factory.notification.component.NotificationFactory;

public class Main {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification(NotificationType.EMAIL);
        notification.send("Welcome to the system!");

        Notification sms = NotificationFactory.createNotification(NotificationType.SMS);
        sms.send("Your OTP is 123456");
    }
}
