package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
//step1: connect with the browserDriver(exe.file) 
		WebDriverManager.chromedriver().setup();
//step2:to launch the browser
		ChromeDriver driver=new ChromeDriver();
//step3:load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
//step4:to maximize the browser
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//step5:enter the username
		 driver.findElement(By.id("username")).sendKeys("demosalesManager");
 //step6:enter the password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
 //step7:click on the submit
		 driver.findElement(By.className("decorativeSubmit")).click();
 //step8:click on the CRMSFA
		 driver.findElement(By.linkText("CRM/SFA")).click(); 
 //step9:click on the leads
		 driver.findElement(By.linkText("Leads")).click();
// step10:
		String title=driver.getTitle();
		
		System.out.println(title);
//step10: close the browser
	   driver.close();
		 
		 
	}

}
