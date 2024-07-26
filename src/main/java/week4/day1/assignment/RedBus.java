package week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize(); 				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Madiwala,Bangalore");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Koyambedu,Chennai");
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		WebElement date = driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tr[7]/td[5]"));
		
		date.click();
		
		String title = driver.findElement(By.xpath("//a[@class='home-redirect redbus-logo']")).getText();
		System.out.println(title);
		
		
		
		
		
			
	}

}
