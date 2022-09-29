package com.sunfengnancodes.studentmanagementsystem.controller;

import com.sunfengnancodes.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        super();
        this.studentService = studentService;
    }

    // handler method to handle list students and return mode and view
    @GetMapping("/get")
    public String listStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "get students list";
    }
}
