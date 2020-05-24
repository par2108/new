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

public class greens1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\day7selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/index.html");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//a[text()='HOME']"));
		user.click();
		
		TakesScreenshot st=(TakesScreenshot)driver;
		File srcc = st.getScreenshotAs(OutputType.FILE);
		File desst = new File("C:\\Users\\welcome\\eclipse-workspace\\day7selenium\\screenshot\\output.jpeg");
		FileUtils.copyFile(srcc, desst);

	}

}
