package marathon.program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) {	
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://in.bookmyshow.com/");		 
		driver.manage().window().maximize();				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad",Keys.ENTER);
	    driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
	    WebElement movieName = driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']"));
	    movieName.sendKeys("Sita Ramam (U)");
	    movieName.click();
	    
	    
	    
	    
		 
		
		
		

	}

}
