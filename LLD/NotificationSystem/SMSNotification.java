package LLD.NotificationSystem;

public class SMSNotification implements NotificationChannel{
    
    @Override
    public void sendNotification(String message){
        System.out.println("Sending SMS: " + message);
    }
}
