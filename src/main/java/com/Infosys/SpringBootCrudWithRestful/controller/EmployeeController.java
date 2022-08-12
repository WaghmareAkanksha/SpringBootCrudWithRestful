package com.Infosys.SpringBootCrudWithRestful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Infosys.SpringBootCrudWithRestful.model.Employee;
import com.Infosys.SpringBootCrudWithRestful.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public ResponseEntity<Integer> saveUser(@RequestBody Employee employee) {

		int saveUserServic = employeeService.saveUserServic(employee);
		return new ResponseEntity<>(saveUserServic, HttpStatus.CREATED);

	}

	public ResponseEntity<List<Employee>> getAll() {
		List<Employee> allUserServices = employeeService.getAllUserServices();

		return new ResponseEntity<List<Employee>>(allUserServices, HttpStatus.OK);

	}

	public ResponseEntity<Employee> loginCheck(@PathVariable String name, @PathVariable String password) {

		Employee loginCheck = employeeService.loginCheck(name, password);

		if (loginCheck == null) {
			return new ResponseEntity<>(loginCheck, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(loginCheck, HttpStatus.FOUND);
	}

	public ResponseEntity<String> deletId(@PathVariable int id) {

		String deleteEmployee = employeeService.deleteEmployee(id);

		return new ResponseEntity<String>(deleteEmployee, HttpStatus.OK);

	}
}