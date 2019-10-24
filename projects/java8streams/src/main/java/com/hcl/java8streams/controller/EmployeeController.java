package com.hcl.java8streams.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.java8streams.model.Employee;
import com.hcl.java8streams.service.EmployeeService;

@Controller
public class EmployeeController {
 
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/")
	public ModelAndView employeeList (ModelAndView model){
		List<Employee> employeeList = employeeService.getAllEmployees();
				model.addObject("employeeList",employeeList);
	            model.addObject("searchEmploy",new Employee());
				model.setViewName("employeehome");
		       return model;
	}
	@RequestMapping(value="/searchemployee",method = RequestMethod.POST)
	public ModelAndView searchEmployee (ModelAndView model, HttpServletRequest req){  
		List<Employee> Lst = employeeService.getEmployee(req.getParameter("empname"),req.getParameter("bandname"),req.getParameter("salary"));
				model.addObject("employeeList",Lst);
				model.setViewName("employeehome");
		       return model;
	}
	
 }
