package day7selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screensht {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\scrollupdwn\\driver\\chromedriver.exe");
		
		//upcasting
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("java");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("selenium");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\welcome\\eclipse-workspace\\day7selenium\\screenshot\\output.jpeg");
		 FileUtils.copyFile(src, dest);
		
		
		
		

	}

}
