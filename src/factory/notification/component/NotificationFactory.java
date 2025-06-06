package factory.notification.component;

import factory.notification.NotificationType;
import factory.notification.service.EmailNotification;
import factory.notification.Notification;
import factory.notification.service.PushNotification;
import factory.notification.service.SMSNotification;

public class NotificationFactory {
    public static Notification createNotification(NotificationType type) {
        return switch (type) {
            case EMAIL -> new EmailNotification();
            case SMS -> new SMSNotification();
            case PUSH -> new PushNotification();
        };
    }
}
