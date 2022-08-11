package com.Infosys.SpringBootCrudWithRestful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Infosys.SpringBootCrudWithRestful.dao.EmployeeDao;
import com.Infosys.SpringBootCrudWithRestful.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public int saveUserServic(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getAllUserServices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee loginCheck(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateUser(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
