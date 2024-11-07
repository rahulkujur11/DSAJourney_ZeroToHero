package LLD.NotificationSystem;

public class PushNotification implements NotificationChannel{

    @Override
    public void sendNotification(String message){
        System.out.println("Sending Push Notification: " + message);
    }
    
}
