package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://www.leafground.com/alert.xhtml");		 
		driver.manage().window().maximize(); 				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();		
		Alert alert = driver.switchTo().alert();		
		alert.sendKeys("Learning Alert");
		alert.accept();
		System.out.println(driver.findElement(By.id("confirm_result")).getText());
	 
		 
		
		
		 
	}

}
