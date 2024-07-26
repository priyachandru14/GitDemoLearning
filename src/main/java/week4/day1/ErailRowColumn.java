package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailRowColumn {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://erail.in/");		 
		driver.manage().window().maximize(); 				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		WebElement from = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		from.clear();
		from.sendKeys("MAS",Keys.ENTER);		 
	 
		WebElement to = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		to.clear();
		to.sendKeys("TP",Keys.ENTER);
		 
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		//identified the table
		driver.findElement(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']"));
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//tr"));
		int rsize = rowCount.size();
		System.out.println("Train Names");
		for(int i=1;i<=rsize;i++) {
			
		 String text = driver.findElement(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//tr[" +i+"]/td[2]")).getText();
		System.out.println(text);

	}

}}
