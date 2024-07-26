package testcase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{
	
	@Test(dataProvider="testData")
	public void runCreate(String cname,String fname,String lname)
	{
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();	
}
	@DataProvider
	public String[][] testData()
	{
		String[][] data=new String[2][3];
		data[0][0]="TestLeaf";
		data[0][1]="Priya";
		data[0][2]="C";
		
		data[1][0]="Amazon";
		data[1][1]="Lokesh";
		data[1][2]="C";
		return data;	
		
	}
}






