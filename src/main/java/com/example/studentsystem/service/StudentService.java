package com.example.studentsystem.service;

import com.example.studentsystem.model.Student;
import com.example.studentsystem.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
     Student saveStudent(Student student);

     List<Student> getAllStudents();

     Student findById(Integer id);

     Student delete(Integer id);


}
