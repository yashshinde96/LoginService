package com.login.Repository;

import org.springframework.data.repository.CrudRepository;

import com.login.Entity.UserLoginEn;

public interface LoginRepository extends CrudRepository<UserLoginEn, Integer>{

	
	public UserLoginEn findByUserName(String userName);
	public UserLoginEn findBySystemId(int id);
}
