package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://en-gb.facebook.com/");		 
		driver.manage().window().maximize();				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yalini");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("L");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9789828437");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("XXXX");
		//driver.findElement(By.xpath("//select[@name='birthday_day']")).
	}

}
