package com.hcl.StudentSpringHibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.StudentSpringHibernate.model.Student;
import com.hcl.StudentSpringHibernatedao.StudentDao;

@Service
public class StudentManagerimpl implements StudentManager {

	@Autowired
	StudentDao d;
	public boolean addStudent(Student st) {
     boolean b=d.addStudent(st);
     return b;

	}

	public boolean upateStudent(Student st) {
		// TODO Auto-generated method stub
		return false;
	}

	public Student getStudent(int Rollnum) {
		// TODO Auto-generated method stub
		return null;
	}

}
