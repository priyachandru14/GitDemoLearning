package Annotation;

import org.testng.annotations.Test;

public class LearnAttribute3 {
	@Test(invocationCount=2,invocationTimeOut=1000)
	public void createLead()
	{
		System.out.println("create the lead");
	}
	@Test(invocationCount=3,invocationTimeOut=1000)
	public void deleteLead() throws InterruptedException
	{	
		Thread.sleep(2000);
		System.out.println("delete the lead");
	}
	@Test(invocationCount=2,invocationTimeOut=2000)
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
