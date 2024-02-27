package Axis.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void testCase1() {
	  System.out.println("Testcase1 is executed");
  }
  @Test
  public void testCase2() {
	  System.out.println("Testcase2 is executed");
  }
  @Test
  public void testCase3() {
	  System.out.println("Testcase3 is executed");
  }
  @Test
  public void testCase4() {
	  System.out.println("Testcase4 is executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Launch Browser");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Close Browser");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Open DB Connection");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("Close DB Connection");
  }
}
