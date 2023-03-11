package schoolmanagement.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import schoolmanagement.com.entity.Student;
import schoolmanagement.com.service.StudentService;

@Controller
@RequestMapping
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	private Student regesterStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
}
