package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Course;
import com.geekster.MappingPractice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping()
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @GetMapping()
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("{id}")
    public Course getCourse(@PathVariable Integer id){
        return courseService.getCourse(id);
    }

    @PutMapping()
    public void updateCourse(@RequestBody Course course){
        courseService.updateCourse(course);
    }

    @DeleteMapping("{id}")
    public void deleteCourse(@PathVariable Integer id){
        courseService.deleteCourse(id);
    }
}
