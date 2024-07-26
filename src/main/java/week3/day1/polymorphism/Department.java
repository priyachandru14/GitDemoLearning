package week3.day1.polymorphism;

public class Department extends Students {
	public void getStudentInfo(int id)
	{	super.getStudentInfo();
		System.out.println("student id " +id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("student id and Name :" +id+ " and "  +name);
	}
	public void getStudentInfo(String email,long phoneno)
	{
		System.out.println("student mail and phone no:" +email+ " and " +phoneno);
	}
}
