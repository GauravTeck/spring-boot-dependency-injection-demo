package org.cfs.springbootp02.service.impl;

import org.cfs.springbootp02.service.CourseService;
import org.springframework.stereotype.Service;

@Service
public class DSACourseService implements CourseService {
     public void getCourseDetails() {
        System.out.println("DSA CourseService getCourseDetails");
     }
}
