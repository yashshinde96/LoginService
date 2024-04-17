package com.employee.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.Responce.AddressResponce;

@FeignClient(name = "AddressFeignClient", url = "http://localhost:9092/microservices")
public interface AddressFeignClient {

	@GetMapping("/address/{id}")
	AddressResponce getAddressByEmployeeId(@PathVariable("id") int id);

}
