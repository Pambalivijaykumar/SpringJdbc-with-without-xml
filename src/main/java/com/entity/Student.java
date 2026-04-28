package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	int studentId;
	
	int marks;
	
	String name;

	public Student(int studentId, int marks, String name) {
		super();
		this.studentId = studentId;
		this.marks = marks;
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", marks=" + marks + ", name=" + name + "]";
	}
	
	

}
