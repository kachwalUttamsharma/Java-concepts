package com.hcl.java8streams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.java8streams.dao.EmployeeDAO;
import com.hcl.java8streams.model.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeDAO employeeDao;
	
	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployees();
	}

	@Override
	public List<Employee> getEmployee(String empname,String bandname,String salary) {
		if (bandname != ""){
			return employeeDao.getEmployee(empname, bandname.charAt(0), salary);
		}else if(salary != ""){
		return employeeDao.getEmployee(empname, ' ',salary);
	} else{
		return employeeDao.getEmployee(empname, ' ', " ");
	}
	}
}
