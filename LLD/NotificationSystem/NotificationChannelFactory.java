package LLD.NotificationSystem;

public class NotificationChannelFactory {

    public static NotificationChannel createChannel(String type){
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
    
}
