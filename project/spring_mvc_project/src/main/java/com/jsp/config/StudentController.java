package com.jsp.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.entity.Student;
import com.jsp.service.StudentService;

@Controller
public class StudentController {

//	@RequestMapping("/hii")
//	public String print() {
//		System.out.println("Hello world");
//		return "hii";

	@RequestMapping("/hi")
	public String hi() {
		return "hi.jsp";
	}

	@RequestMapping("/student")
	public String student() {
		return "student.jsp";
	}

//	@RequestMapping("/register")
//	public String register() {
//		return "register.jsp";
//	}
	@Autowired
	private StudentService service;

	@RequestMapping("/register")
	public ModelAndView register() {
		Student s1 = new Student();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register.jsp");
		mv.addObject("student", s1);
		return mv;
	}
//@RequestMapping("/save")
//public ModelAndView saveStudent(Student s1) {
//	System.out.println(s1.getName());
//	System.out.println(s1.getPhone());
//	System.out.println(s1.getEmail());
//	System.out.println(s1.getPassword());
//	return new ModelAndView("index.jsp");
//	
//}

//@RequestMapping("/save")
//public ModelAndView saveStudent(Student s1) {
//	StudentController service = null;
//	service.saveStudent(s1);
//	return new ModelAndView("index.jsp");
//}
//--------------------------------------------------------------------------------------------------------------
	@RequestMapping("/save")
	public ModelAndView saveStudent(Student s1) {
		service.saveStudent(s1);
		ModelAndView mv = new ModelAndView("view.jsp");
		List<Student> stlist = service.getAllStudent();
		mv.addObject("std", stlist);
		return mv;
	}

	@RequestMapping("/delete")
	public ModelAndView deleteStudent(@RequestParam("id") int id) {
		service.deleteStudent(id);
		ModelAndView mv = new ModelAndView("view.jsp");
		mv.addObject("std", service.getAllStudent());
		return mv;
	}

	@RequestMapping("/allStudent")
	public ModelAndView studentRecord() {

		ModelAndView mv = new ModelAndView("record.jsp");
		List<Student> sr = service.getAllStudent();
		mv.addObject("students", sr);
		return mv;
	}

//----------------------------------------------------------------------------------
	@RequestMapping("/update")
	public ModelAndView updateStudent(@RequestParam(value = "id") int id) {
		Student student = service.getStudentById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("edit.jsp");
		mv.addObject("student", student);
		return mv;
	}

	@RequestMapping("/edit")
	public ModelAndView editStudent(Student student) {
		service.UpdateStudent(student);
		ModelAndView mv = new ModelAndView("view.jsp");
		mv.addObject("std", service.getAllStudent());
		return mv;
	}
//--------------------------------------------------------------------------------------------------

}

//---------------------------------------------------------
//@RequestMapping("/register")
//public ModelAndView register() {
//	Student s1=new Student();
//	ModelAndView mv=new ModelAndView();
//	mv.setViewName("register.jsp");
//	mv.addObject("student",s1);
//	return mv;
//}

//-----------------------------------------------------------------------------------------------------------

