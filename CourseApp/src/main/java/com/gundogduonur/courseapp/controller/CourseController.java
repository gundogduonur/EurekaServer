package com.gundogduonur.courseapp.controller;

import com.gundogduonur.courseapp.entity.Course;
import com.gundogduonur.courseapp.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;


    //@RequestMapping(value ="/courses",method = RequestMethod.GET)
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return courseRepository.findAll();
    }

}
