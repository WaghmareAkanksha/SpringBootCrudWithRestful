package com.Infosys.SpringBootCrudWithRestful.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.Infosys.SpringBootCrudWithRestful.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sf;

	@Override
	public int saveUserDao(Employee employee) {
		
		Session session = sf.openSession();
		session.beginTransaction();
		int id = (int) session.save(employee);
		session.getTransaction().commit();
		return id;
	}

	@Override
	public List<Employee> getAllUserDao() {
		
		Session session = sf.openSession();
		String hql = "from Employee";
		Query query = session.createQuery(hql);
		List resultList = query.getResultList();
		return resultList;
	}

	@Override
	public Employee loginCheckDao(String userName, String password) {
		
		Session session = sf.openSession();
		String hql = "from Employee";
		Query query = session.createQuery(hql);
		List<Employee> list = query.getResultList();
		
		
		for(Employee e : list ) {
			if(e.getUserName().equals(userName) && e.getPassword().equals(password)) {
				return e;
			}
		}
		
		return null;
	}

	@Override
	public Employee updateUserDao(Employee employee) {
		
		Session s = sf.openSession();
		s.beginTransaction();
		s.update(employee);
		s.getTransaction().commit();
		s.close();
		
		Session ss = sf.openSession();
		Employee employee2 = ss.get(Employee.class, employee.getId());
		ss.close();
		return employee2;
	}

	@Override
	public String deleteEmployeeDao(int id) {
		
		Session session = sf.openSession();
		session.beginTransaction();
		Employee employee = session.get(Employee.class, id);

		if(employee != null) {
			session.delete(employee);
			session.getTransaction().commit();
			session.close();
		}
		
		return "Id deleted successfully";
	}

}
