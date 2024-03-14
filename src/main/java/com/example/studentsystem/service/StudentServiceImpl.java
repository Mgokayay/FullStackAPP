package com.example.studentsystem.service;

import com.example.studentsystem.model.Student;
import com.example.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Integer id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(studentOptional.isPresent()){
            return studentOptional.get();

        }
        return null;
    }

    @Override
    public Student delete(Integer id) {


        Student student = findById(id);
        if(student!=null){
             studentRepository.delete(student);
        }
        return null;
    }
}
