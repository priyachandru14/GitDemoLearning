package week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draggableColumn {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize(); 				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement name = driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt95']"));
		WebElement quantity = driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt99']"));	
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(name, quantity).perform();
		WebElement msg = driver.findElement(By.xpath("//span[text()='Columns reordered']"));	
		String rowtext = msg.getText();
		if(rowtext.contains("Columns"))
		{
			System.out.println("Column reordered");
		}
		else {
			System.out.println("not ordered");
		}
		
		
		
		
		
		
		
		

	}

}
