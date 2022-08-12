package com.Infosys.SpringBootCrudWithRestful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Infosys.SpringBootCrudWithRestful.model.Employee;
import com.Infosys.SpringBootCrudWithRestful.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value="/saveuser",produces="application/json",consumes="application/json")
	public ResponseEntity<Integer> saveUser(@RequestBody Employee employee) {

		int saveUserServic = employeeService.saveUserServic(employee);
		return new ResponseEntity<>(saveUserServic, HttpStatus.CREATED);

	}

	@GetMapping(value="/getall",produces="application/json")
	public ResponseEntity<List<Employee>> getAll() {
		List<Employee> allUserServices = employeeService.getAllUserServices();

		return new ResponseEntity<List<Employee>>(allUserServices, HttpStatus.OK);

	}
	
	@PutMapping(value="/update",produces="application/json",consumes="application/json")
	public ResponseEntity<Employee> update(@RequestBody Employee employee) {
		
		Employee updateUser = employeeService.updateUser(employee);
		
		return new ResponseEntity<Employee>(updateUser,HttpStatus.OK);
		
		
		
		
	}

	@GetMapping(value="/logincheck/{name}/{password}",produces="application/json")
	public ResponseEntity<Employee> loginCheck(@PathVariable String name, @PathVariable String password) {

		Employee loginCheck = employeeService.loginCheck(name, password);

		if (loginCheck == null) {
			return new ResponseEntity<>(loginCheck, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(loginCheck, HttpStatus.FOUND);
	}
	
	

	@DeleteMapping(value="/deletid/{id}",produces="application/json")
	public ResponseEntity<String> deletId(@PathVariable int id) {

		String deleteEmployee = employeeService.deleteEmployee(id);

		return new ResponseEntity<String>(deleteEmployee, HttpStatus.OK);

	}
}