package com.hcl.java8streams.dao;

import java.util.List;

import com.hcl.java8streams.model.Employee;

public interface EmployeeDAO {
  public List<Employee> getAllEmployees();
  
  public List<Employee> getEmployee (String empname,char band,String salary);
}
