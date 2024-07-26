package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("http://leaftaps.com/opentaps/control/main");		 
		driver.manage().window().maximize();				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		 
		driver.findElement(By.id("username")).sendKeys("demosalesManager");		
		driver.findElement(By.id("password")).sendKeys("crmsfa");		  
		driver.findElement(By.className("decorativeSubmit")).click();		  
		driver.findElement(By.linkText("CRM/SFA")).click(); 		  
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyadharshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("C");
		
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select option1=new Select(industry);
		option1.selectByIndex(3);
		
		
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select option2=new Select(ownership);
		option2.selectByVisibleText("Partnership");
		Thread.sleep(2000);
		option2.selectByVisibleText("Sole Proprietorship");
		
		WebElement Preferredcurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select option3=new Select(Preferredcurrency);	
		option3.selectByValue("INR");
				
	}
}
