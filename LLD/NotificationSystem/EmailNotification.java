package LLD.NotificationSystem;

public class EmailNotification implements NotificationChannel{
    
    @Override
    public void sendNotification(String message){
        System.out.println("Sending Email: " + message);
    }
}
