package com.vivek.spring.ems.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.vivek.spring.ems.model.Employee;
import com.vivek.spring.ems.repository.EmployeeRepository;
import com.vivek.spring.ems.services.EmployeeServices;

public class EmployeeServiceImpl implements EmployeeServices {

	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public List<Employee> getEmployees() {
		return empRepository.findAll();
	}

}
