package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();		 
		ChromeDriver driver=new ChromeDriver();		 
		driver.get("https://www.leafground.com/table.xhtml");		 
		driver.manage().window().maximize(); 				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id=\"form:j_idt89:globalFilter\"]")).sendKeys("India");
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[2]/td[3]")).getText();
		System.out.println(text);
		System.out.println("**********************************");
		List<WebElement> rowelement = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr"));
		int rsize = rowelement.size();
		System.out.println(rsize);
		System.out.println("**********************************");		
		List<WebElement> columnelement = driver.findElements(By.xpath("//thead[@id='form:j_idt89_head']/tr/th"));
		int csize = columnelement.size();
		System.out.println(csize);
		System.out.println("**********************************");
		//to get particular column value
		for(int i=1;i<=rsize;i++) {
            String firstColValues = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td[1]")).getText();
            System.out.println(firstColValues);
		}
            //to get the particular row value
            for(int i=1;i<=csize;i++) {
                String firstRowValues = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[1]/td["+i+"]")).getText();
                System.out.println(firstRowValues);
	}
		System.out.println("**********************************");
		for(int i=1;i<=rsize;i++)
		{
			for (int j=1;j<=csize;j++)
{
	String allVal = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td["+j+"]")).getText();
	System.out.println(allVal);
}
		}
	}
}
