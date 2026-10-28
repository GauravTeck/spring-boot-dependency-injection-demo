package org.cfs.springbootp02.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final CourseService courseService;
    private final PaymentService paymentService;

    public StudentService(@Qualifier("javaCourseService") CourseService courseService, PaymentService paymentService) {
        this.courseService = courseService;
        this.paymentService = paymentService;
    }

    public void enrollStudent(){
        System.out.println("Student enrollment started ");
        courseService.getCourseDetails();
        paymentService.doPayment();
        System.out.println("Student enrollment finished ");
    }
}
