package Axis.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEg {
	@Test
	  public void testhardassert() throws InterruptedException {
		  
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91630\\Documents\\NewChromeDriver\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  String actualtittle = driver.getTitle();
		  String expectedtitle = "Orange";
		  
		
		  Assert.assertEquals(actualtittle, expectedtitle);
		  
		  Thread.sleep(500);
		  
		  driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
		  driver.close();
	}
}
