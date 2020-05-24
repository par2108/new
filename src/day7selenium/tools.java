package day7selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tools {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\scrollupdwn\\driver\\chromedriver.exe");
		
		//upcasting
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		
		//newDatatype varname=(newDatatype)oldvar;
		//downcasting
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement down = driver.findElement(By.xpath("//div[text()='Top Tutorials']"));
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		
		Thread.sleep(2000);
		
	
	
	
	
	}
	
	
	
	

}
