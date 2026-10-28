package org.cfs.springbootp02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassScheduleService {

    // Field injection
    @Autowired
    private NotificationService notificationService;

    void sendClassNotification(){
        System.out.println("Class scheduling........");
        notificationService.sendNotification();
    }

}
