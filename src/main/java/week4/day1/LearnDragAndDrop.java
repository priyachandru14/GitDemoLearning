package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize(); 				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Point location = drag.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		WebElement targetEle = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement dropEle = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		WebElement scrollDown = driver.findElement(By.xpath("//img[@id='form:logo']"));
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag, x+20, y+30).perform();
		act.dragAndDrop(targetEle, dropEle).pause(300).perform();
		act.scrollToElement(scrollDown).perform();
		//or
		//act.scrollByAmount(250,350).perform();
		
		
		

	}

}
