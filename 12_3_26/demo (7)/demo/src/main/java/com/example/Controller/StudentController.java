package com.example.demo.Controller;

import com.example.demo.service.Studentservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")


public class StudentController {
    public StudentController(Studentservice studentservice){

    }

}