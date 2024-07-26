package Annotation;

import org.testng.annotations.Test;

public class LearnAttributes {
	@Test(priority=2)
	public void classA()
	{
		System.out.println("Class A testcase");
	}
	@Test(priority=0)
	public void classN()
	{
		System.out.println("Class N testcase");
	}
	@Test(priority=2)
	public void classY()
	{
		System.out.println("Class Y testcase");
	}
	@Test(priority=-1)
	public void classD()
	{
		System.out.println("Class D testcase");
	}@Test(enabled=false)
	public void classM()
	{
		System.out.println("Class M testcase");
	}
}
