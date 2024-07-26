package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("http://leaftaps.com/opentaps/control/main");		 
		driver.manage().window().maximize();				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TCS");
		driver.findElement(By.xpath("(//input[@id='createLeadForm_firstName'])")).sendKeys("Priya");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("C");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
