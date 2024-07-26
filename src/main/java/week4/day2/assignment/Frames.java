package week4.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://jqueryui.com/sortable/");		 
		driver.manage().window().maximize();				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(item6, item4).perform();
		System.out.println("Done");
		

	}	

}
