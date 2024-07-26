package Annotation;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {
	@Test(dependsOnMethods="login",alwaysRun=true)
	public void createLead()
	{		
		System.out.println("create the lead");
	}
	@Test(dependsOnMethods={"login","createLead"})
	public void deleteLead()
	{
		System.out.println("delete the lead");
	}
	//packagename.classname.methodname
	@Test(dependsOnMethods="Annotation.LearnAnnotation.Test1")
	public void editLead()
	{
		System.out.println("updated the lead");
	}
	@Test
	public void mergeLead()
	{
		System.out.println("leads are merged");
	}
	@Test(timeOut=1000)
	public void login() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("logged in sucessfully");
	}

}
