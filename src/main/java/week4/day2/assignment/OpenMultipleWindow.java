package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenMultipleWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://www.leafground.com/window.xhtml");		 
		driver.manage().window().maximize();				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windowHandles);
		System.out.println("size of all window "  +windowHandles.size());
		driver.switchTo().window(list.get(2));
		System.out.println("title of the window"  +driver.getTitle());
		driver.switchTo().window(list.get(1));
		driver.close();
		driver.switchTo().window(list.get(0));
		driver.close();
		

	}

}
