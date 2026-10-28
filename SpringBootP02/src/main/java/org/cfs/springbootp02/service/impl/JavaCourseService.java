package org.cfs.springbootp02.service.impl;

import org.cfs.springbootp02.service.CourseService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
public class JavaCourseService implements CourseService {

    @Override
    public void getCourseDetails() {
        System.out.println("JavaCourseService getCourseDetails");
    }
}
