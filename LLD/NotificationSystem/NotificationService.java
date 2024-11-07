package LLD.NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    
    List<NotificationChannel> channels = new ArrayList<>();


    public void addChannel(NotificationChannel notificationChannel){
        channels.add(notificationChannel);
    }

    public void removeChannel(NotificationChannel notificationChannel){
        channels.remove(notificationChannel);
    }

    public void notifyAllChannels(String message){
        for (NotificationChannel channel : channels){
            channel.sendNotification(message);
        }
    }
}
