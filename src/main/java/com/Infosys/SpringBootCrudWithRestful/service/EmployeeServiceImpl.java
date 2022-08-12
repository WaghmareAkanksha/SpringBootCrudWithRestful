package com.Infosys.SpringBootCrudWithRestful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Infosys.SpringBootCrudWithRestful.dao.EmployeeDao;
import com.Infosys.SpringBootCrudWithRestful.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public int saveUserServic(Employee employee) {
		// TODO Auto-generated method stub
		int saveUserDao = employeeDao.saveUserDao(employee);
		
		return saveUserDao;
	}

	@Override
	public List<Employee> getAllUserServices() {
		// TODO Auto-generated method stub
		List<Employee> allUserDao = employeeDao.getAllUserDao();
		
		return allUserDao;
	}

	@Override
	public Employee loginCheck(String userName, String password) {
		// TODO Auto-generated method stub
		
		Employee loginCheckDao = employeeDao.loginCheckDao(userName, password);
		return loginCheckDao;
	}

	@Override
	public Employee updateUser(Employee employee) {
		// TODO Auto-generated method stub
		Employee updateUserDao = employeeDao.updateUserDao(employee);
		
		return updateUserDao;
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String deleteEmployeeDao = employeeDao.deleteEmployeeDao(id);
		
		return deleteEmployeeDao;
	}

}
