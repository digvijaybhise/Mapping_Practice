package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Student;
import com.geekster.MappingPractice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudent(Integer id) {
        return studentRepo.getById(id);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepo.deleteById(id);
    }
}
