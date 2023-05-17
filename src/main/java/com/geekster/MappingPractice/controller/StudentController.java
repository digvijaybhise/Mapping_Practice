package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Student;
import com.geekster.MappingPractice.service.StudentService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping()
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping()
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }

    @PutMapping()
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }
}
