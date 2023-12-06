package com.login.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.Entity.UserLoginEn;
import com.login.Repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginRepository;

//	@Autowired
//	private ModelMapper modelMapper;
	
	public UserLoginEn getEmployeeLoginDetails(String userName) {
		
		UserLoginEn user = loginRepository.findByUserName(userName);
		System.out.println("User -->"+user);
		return user;

	}

	public boolean validateUser() {

		int count = 0;
	
		if (count != 0)
			return true;
		else
			return false;
	}
	
	
	public void saveUser(UserLoginEn loginen) {
		try {
		loginRepository.save(loginen);
//		return 1;
		}
		catch(Exception e) {
			System.out.println(e);
		}
//		return 0;
		
	}

}
