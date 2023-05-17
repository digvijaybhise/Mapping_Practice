package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Course;
import com.geekster.MappingPractice.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo courseRepo;

    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course getCourse(Integer id) {
        return courseRepo.getById(id);
    }

    public void updateCourse(Course course) {
        courseRepo.save(course);
    }

    public void deleteCourse(Integer id) {
        courseRepo.deleteById(id);
    }
}
