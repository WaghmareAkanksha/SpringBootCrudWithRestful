package com.Infosys.SpringBootCrudWithRestful.dao;

import java.util.List;

import com.Infosys.SpringBootCrudWithRestful.model.Employee;

public interface EmployeeDao 
{
    public int saveUserDao();
    
    public List<Employee> getAllUserDao();
    
    public Employee loginCheckDao(String userName,String password);

	public Employee updateUserDao(Employee employee);
	
	public String deleteEmployeeDao(int id);

    
}
