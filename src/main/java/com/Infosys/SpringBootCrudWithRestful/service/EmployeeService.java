package com.Infosys.SpringBootCrudWithRestful.service;

import java.util.List;

import com.Infosys.SpringBootCrudWithRestful.model.Employee;


public interface EmployeeService {

	
	public int saveUserServic(Employee employee);

	public List<Employee> getAllUserServices();
	
	public Employee loginCheck(String userName,String password);

	public Employee updateUser(Employee employee);
	
	public String deleteEmployee(int id);



}
