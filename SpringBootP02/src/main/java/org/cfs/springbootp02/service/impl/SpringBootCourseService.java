package org.cfs.springbootp02.service.impl;

import org.cfs.springbootp02.service.CourseService;
import org.springframework.stereotype.Service;


@Service
public class SpringBootCourseService implements CourseService {

    @Override
    public void getCourseDetails(){
        System.out.println("SpringBoot  CourseService getCourseDetails");
    }
}
