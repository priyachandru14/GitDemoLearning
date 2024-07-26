package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnClicks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://leafground.com/menu.xhtml");
		driver.manage().window().maximize(); 				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement cus = driver.findElement(By.xpath("//span[text()='Customers']"));
		Actions act=new Actions(driver);
		act.click(cus).contextClick(cus).perform();
		
		

	}

}
