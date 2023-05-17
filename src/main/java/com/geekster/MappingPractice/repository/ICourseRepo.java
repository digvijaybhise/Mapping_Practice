package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course, Integer> {
}
