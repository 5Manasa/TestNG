package Axis.TestNG;

import org.testng.annotations.Test;

public class EnableFalse {
	  @Test
	  public void testcase1() {
	  System.out.println("Testcase1 executed succesffully");
	  }
	  @Test
	  public void testcase2() {
		  System.out.println("Testcase2 executed succesffully");
	  }
	  @Test(enabled=false)
	  public void testcase3() {
		  System.out.println("Testcase3 executed succesffully");
		  
	  }
	}
