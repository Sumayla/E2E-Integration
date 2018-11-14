package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC003 {

WebDriver driver;
	
	@Test
	public void testCase01() {
		driver= new FirefoxDriver ();
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.13.0\\geckodriver.exe");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Adnan");
		driver.findElement(By.id("pass")).sendKeys("Ziddi");
		
		
	}

}
