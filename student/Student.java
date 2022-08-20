package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name is : Mano");
		
	}
	public void studentDept() {
		System.out.println("Student Department is :E&I");
	}
	public void studentId() {
		System.out.println("Student ID is: 12345");
	}

	public static void main(String[] args) {
		Student Dept = new Student();
		Dept.collegeCode();
		Dept.collegeName();
		Dept.collegeRank();
		Dept.deptName();
		Dept.studentName();
		Dept.studentDept();
		Dept.studentId();
		// TODO Auto-generated method stub

	}

}
