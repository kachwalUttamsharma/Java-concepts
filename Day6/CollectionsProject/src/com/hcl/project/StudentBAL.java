<<<<<<< HEAD
package com.hcl.project;

import java.util.List;

public class StudentBAL {
	static StringBuilder sb = new StringBuilder();
	
	public boolean addStudentBal(Student objStudent) throws StudentException{
		boolean isAdded = true;
		
		if(objStudent.getSno() <= 0){
			sb.append("StudentNo cannot be negative or Zero \r\n");
			isAdded = false;
		}
		
		if(objStudent.getName().length() <= 3){
			sb.append("Name more than 3 characters \r\n");
			isAdded = false;
		}
		
		if(objStudent.getCity().length() <= 3){
			sb.append("City more than 3 characters \r\n");
			isAdded = false;
		}
		if(objStudent.getCgp() < 0){
			sb.append("Cgp Non Negative");
			isAdded = false;
		}
		if(isAdded == false){
			throw new StudentException(sb.toString());
		}else {
			new StudentDAO().addStudentDao(objStudent);
		}
		return isAdded;
	}
	
	public Student searchStudentBal(int sno){
		return new StudentDAO().searchStudentDao(sno);
	}
	
	public List<Student> showStudentBal(){
		return new StudentDAO().showStudentDao();
	}
	
	public String updateStudentBal(Student objStudent){
		return new StudentDAO().updateStudentDao(objStudent);
	}
	
	public String deleteStudentBal(int sno){
		return new StudentDAO().deleteStudentDao(sno);
	}
}

=======
package com.hcl.project;

import java.util.List;

public class StudentBAL {
	static StringBuilder sb = new StringBuilder();
	
	public boolean addStudentBal(Student objStudent) throws StudentException{
		boolean isAdded = true;
		
		if(objStudent.getSno() <= 0){
			sb.append("StudentNo cannot be negative or Zero \r\n");
			isAdded = false;
		}
		
		if(objStudent.getName().length() <= 3){
			sb.append("Name more than 3 characters \r\n");
			isAdded = false;
		}
		
		if(objStudent.getCity().length() <= 3){
			sb.append("City more than 3 characters \r\n");
			isAdded = false;
		}
		if(objStudent.getCgp() < 0){
			sb.append("Cgp Non Negative");
			isAdded = false;
		}
		if(isAdded == false){
			throw new StudentException(sb.toString());
		}else {
			new StudentDAO().addStudentDao(objStudent);
		}
		return isAdded;
	}
	
	public Student searchStudentBal(int sno){
		return new StudentDAO().searchStudentDao(sno);
	}
	
	public List<Student> showStudentBal(){
		return new StudentDAO().showStudentDao();
	}
	
	public String updateStudentBal(Student objStudent){
		return new StudentDAO().updateStudentDao(objStudent);
	}
	
	public String deleteStudentBal(int sno){
		return new StudentDAO().deleteStudentDao(sno);
	}
}

>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
