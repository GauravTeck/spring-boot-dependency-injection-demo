package org.cfs.springbootp02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificateService {
    private NotificationService notificationService;

    // setter dependency injection
   @Autowired
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void sendCertificate(){
        System.out.println("Certificate is ready......");


    }



}
