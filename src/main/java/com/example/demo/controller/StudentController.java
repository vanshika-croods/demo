package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Student;

@Controller
public class StudentController {

	@GetMapping("/")
	public  ModelAndView Regsitartion() {
		Student student = new Student();
		student.setFirstName("vanshika");
		student.setLastName("shah");
		return new ModelAndView("index","student",student);
	}
}
