package firsttask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourthday {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\scrollupdwn\\driver\\chromedriver.exe");
		
		//upcasting
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement btnclk = driver.findElement(By.xpath("//span[text()='Greens Technologys Overall Reviews']"));
		btnclk.click();
		
		TakesScreenshot pp=(TakesScreenshot)driver;
		File src = pp.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\welcome\\eclipse-workspace\\day7selenium\\firsttak\\screenshot\\output.jpeg");
		FileUtils.copyFile(src, dest);
	}

}
