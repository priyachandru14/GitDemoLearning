package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");		 
		driver.manage().window().maximize(); 				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("myFunction()")).click();
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.accept();
		driver.findElement(By.id("You pressed Cancel!")).getText();
		
	}

}
