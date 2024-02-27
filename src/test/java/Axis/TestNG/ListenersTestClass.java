package Axis.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass.class)
public class ListenersTestClass {
  @Test
	public void invokechrome() {
		
		
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91630\\Documents\\NewChromeDriver\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}
		
		
		
	}
	
	
	



