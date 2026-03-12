package com.example.demo.service;


import Request.StudentRequest;
import Response.StudentResponse;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

public class Studentservice {
    private final StudentRepository studentRepository;

    public Studentservice(StudentRepository studentRepository){
        this.studentRepository=studentRepository;

    }
    public StudentResponse processStudent(StudentRequest request){
        int total=request.getMarks().stream().mapToInt(Integer::intValue).sum();
        int subjects=request.getMarks().size();
        double percentage=(double) total/subjects;
        String result=percentage>=75?"PASS":"FAIL";

        Student student=new Student();
        student.setName(request.getName());
        student.setRollNumber(request.getRollNumber());
        student.setpercentage(percentage);
        student.setResult(Double.parseDouble(result));

        return new StudentResponse(
                request.getName(),
                request.getRollNumber(),
                total,
                percentage,
                result
        );



    }
}