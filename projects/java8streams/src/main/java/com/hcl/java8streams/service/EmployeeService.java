package com.hcl.java8streams.service;

import java.util.List;

import com.hcl.java8streams.model.Employee;

public interface EmployeeService {
  public List<Employee> getAllEmployees();
  
  public List<Employee> getEmployee(String empname,String c,String salary);
}
