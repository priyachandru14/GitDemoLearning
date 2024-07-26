package week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RowReordered {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize(); 				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		WebElement row1 = driver.findElement(By.xpath("//tr[text()='Blue T-Shirt']"));
		WebElement row2 = driver.findElement(By.xpath("//tr[text()='Blue Band']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(row1, row2).perform();
		WebElement rowMsg = driver.findElement(By.xpath("//span[text()='Row moved']"));
		String text = rowMsg.getText();
		if(text.contains("moved"))
		{
			System.out.println("Row moved");
		}
		else
		{
			System.out.println("row not moved");
		}
		//resize of image
		WebElement reSize = driver.findElement(By.xpath("//img[@class='shadow-1 ui-resizable']"));
		act.dragAndDropBy(reSize, 30, 40).perform();
		act.scrollByAmount(230, 450).perform();
		
		

	}

}
