package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Student;
import com.app.service.StudentService;

@Controller
@RequestMapping("/abc")
public class CustomerController {
	
	@Autowired
	private StudentService studentService;
	@GetMapping("/list")
	public String listStudent(Model theModel)
	{
		List<Student> theStudent = studentService.getStudents();
		theModel.addAttribute("students", theStudent);
		return "list-customer";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel)
	{
		Student theStudent = new Student();
		theModel.addAttribute("students", theStudent);
		return "customer-form";
	}
	@PostMapping("/saveStudents")
	public String saveStudent(@ModelAttribute("students") Student theStudent)
	{
		studentService.saveStudents(theStudent);
		return "redirect:/abc/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int theId, Model theModel)
	{
		Student theStudent = studentService.getStudent(theId);
		theModel.addAttribute("students",theStudent);
		return "customer-form";
	}
	
	
	  @GetMapping("/deleteStudent") 
	  public String deleteStudent(@RequestParam("studentId") int theId)
	  {
		  studentService.deleteStudent(theId); 
		  return "redirect:/abc/list"; 
	  }
	 
}

