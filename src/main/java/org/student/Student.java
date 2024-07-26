package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println(" Student Name:Priyadharshini C");
	}
	public void studentDept()
	{
		System.out.println("Department : Computer Science");
	}
	public void studentId()
	{
		System.out.println("Student ID : 12144");
	}
public static void main(String[] args) {
	Student object=new Student();
	object.studentName();
	object.studentDept();
	object.studentId();
	object.deptName();
	object.collegeName();
	object.collegeCode();
	object.collegeRank();
}
}
