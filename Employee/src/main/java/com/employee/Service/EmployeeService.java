package com.employee.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Entity.Employee;
import com.employee.FeignClient.AddressFeignClient;
import com.employee.Repository.EmployeeRepo;
import com.employee.Responce.AddressResponce;
import com.employee.Responce.EmployeeResponce;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private AddressFeignClient addressFeignClient;

	public EmployeeResponce getEmployeeById(int id) {

		Employee emp = employeeRepo.findById(id).get();
		EmployeeResponce employeeResponce = modelMapper.map(emp, EmployeeResponce.class);		
		AddressResponce addressResponce = addressFeignClient.getAddressByEmployeeId(id);
		employeeResponce.setAddressResponce(addressResponce);

		return employeeResponce;

	}

}
