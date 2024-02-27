package Axis.TestNG;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass.class)
public class InvokeEdge {
  @Test
  public void test() {
	  System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91630\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/"); 

	}
  }

