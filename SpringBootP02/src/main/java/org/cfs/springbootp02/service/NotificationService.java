package org.cfs.springbootp02.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(){
        System.out.println("Notification sent to students......");
    }

}
