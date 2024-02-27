package Axis.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
  @Test
  @Parameters("browser")
  public void parameterizedtest(String browser) {
	  if (browser.equals("chrome")) {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91630\\Documents\\NewChromeDriver\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}else {
	  
  
	  System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91630\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/"); 

 }
	  
  }

}