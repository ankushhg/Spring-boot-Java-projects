package com.example.mysqlDemo.Service;

import org.springframework.stereotype.Service;

import com.example.mysqlDemo.dto.request.StudentRequest;
import com.example.mysqlDemo.dto.responce.StudentResponce;
import com.example.mysqlDemo.entity.StudentEntity;
import com.example.mysqlDemo.repositary.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public StudentResponce saveStudent(StudentRequest studentRequest) {
         
        StudentEntity student = new StudentEntity();
        student.setName(studentRequest.getName());
        StudentEntity savedStudent = studentRepository.save(student);

        return new StudentResponce(savedStudent.getId(), 
        savedStudent.getName(), null );
    }
}
