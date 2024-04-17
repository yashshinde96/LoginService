package com.employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.Responce.EmployeeResponce;
import com.employee.Service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{id}")
	ResponseEntity<EmployeeResponce> getEmployeedetails(@PathVariable("id") int id) {
		try {
		EmployeeResponce employeeResponce = employeeService.getEmployeeById(id);
		
		System.out.println(employeeResponce);

		return ResponseEntity.status(HttpStatus.OK).body(employeeResponce);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@GetMapping("/home")
	public String hello(Model model) {
		System.out.println("in home");
//		model.addAttribute("message", "Hello, World!");
		return "home";
	}

}
