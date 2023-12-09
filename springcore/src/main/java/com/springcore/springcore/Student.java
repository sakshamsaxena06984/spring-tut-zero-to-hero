package com.springcore.springcore;

public class Student {
	private String studentName;
	private int studentRoll;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int studentRoll) {
		super();
		this.studentName = studentName;
		this.studentRoll = studentRoll;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRoll=" + studentRoll + "]";
	}
	

}
