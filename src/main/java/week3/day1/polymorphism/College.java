package week3.day1.polymorphism;

public class College extends Department {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College clg=new College();
	
		clg.getStudentInfo(121);
		clg.getStudentInfo(121, "Priya");
		clg.getStudentInfo("xxx@gmail.com", 3286486418l);
		
	}

}
