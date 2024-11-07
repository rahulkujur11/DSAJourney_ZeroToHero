package LLD.NotificationSystem;

public class NotificationSystemDemo {
    public static void main(String[] args) {
        // Create the notification service (Subject)
        NotificationService notificationService = new NotificationService();

        // Use the factory to create notification channels
        NotificationChannel emailChannel = NotificationChannelFactory.createChannel("email");
        NotificationChannel smsChannel = NotificationChannelFactory.createChannel("sms");
        NotificationChannel pushChannel = NotificationChannelFactory.createChannel("push");

        // Subscribe to the channels
        notificationService.addChannel(emailChannel);
        notificationService.addChannel(smsChannel);
        notificationService.addChannel(pushChannel);

        // Send a message
        notificationService.notifyAllChannels("New message for users!");

        // Remove a channel and send another message
        notificationService.removeChannel(smsChannel);
        notificationService.notifyAllChannels("Message after SMS unsubscription.");
    }
    
}
