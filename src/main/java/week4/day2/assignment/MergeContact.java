package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("http://leaftaps.com/opentaps/control/login");		 
		driver.manage().window().maximize();				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeContactsForm']")).click();
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
	 
		//using window handling
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> windowHandles1=driver.getWindowHandles();
		List<String> list1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(list1.get(1));
		driver.findElement(By.xpath("//a[text()='FrenchCustomer']")).click();
		driver.switchTo().window(list1.get(0));
		driver.findElement(By.xpath(" //a[@class='buttonDangerous']")).click();
		//switch to alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println("title of the page"   +driver.getTitle());
		driver.quit();
		
		
		
		
		
		

	}

}
