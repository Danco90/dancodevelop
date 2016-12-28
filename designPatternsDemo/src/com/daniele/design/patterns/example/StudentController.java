package com.daniele.design.patterns.example;

public class StudentController {
	
	private StudentModel model;
	private StudentView view;
	
	
	public StudentController(StudentModel student, StudentView view) {
		this.model = student;
		this.view = view;
	}
	
	
	public String getStudentname() {
		return model.getName();
	}
	public void setStudentName(String name) {
		model.setName(name);
	}
	
	
	public String getStudentRollNo() {
		return model.getRollNo();
	}
	
	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo); 
	}
	
	public void updateView(){
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
	
	

}
