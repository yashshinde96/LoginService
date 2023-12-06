package com.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.login.Entity.UserLoginEn;
import com.login.Service.LoginService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	//Yash
	@Autowired
	LoginService loginService;

	
	@GetMapping("/")
	public String getLoginPage() {
		System.out.println(" In Login Controller ");
		return "/Login/login";
	}

	@RequestMapping(path="/login",method=RequestMethod.POST)	
	public String homePage(HttpServletRequest request) {
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		
		System.out.println("i/p by user username = "+userName);
		System.out.println("i/p by user password = "+password);

		UserLoginEn userLoginEn=new UserLoginEn();
		
		userLoginEn=loginService.getEmployeeLoginDetails(userName);
		

		if( userLoginEn!=null && userLoginEn.getUserName().equals(userName)  && userLoginEn.getPassword().equals(password) )  {
			
			System.out.println("Valid");
			return "/Home/home";
		}
		else {
			System.out.println("Not Valid");
			return "/Login/loginError";
		}
	}
	
}
