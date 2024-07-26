package Annotation;

import org.testng.annotations.Test;

public class LearnAttribute2 {
	@Test(invocationCount=5,threadPoolSize=3)
	public void createLead()
	{
		System.out.println(Thread.currentThread().getId());
		System.out.println("create the lead");
	}
	@Test
	public void deleteLead()
	{
		System.out.println("delete the lead");
	}
	@Test
	public void editLead()
	{
		System.out.println("updated the lead");
	}
	@Test
	public void mergeLead()
	{
		System.out.println("leads are merged");
	}
	@Test
	public void login()
	{
		System.out.println("logged in sucessfully");
	}

}
