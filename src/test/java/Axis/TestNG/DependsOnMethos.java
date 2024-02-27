package Axis.TestNG;

import org.testng.annotations.Test;

public class DependsOnMethos {
  @Test
  public void testcase1() {
	  System.out.println("Testcase1 is successfully executed");
  }
  @Test(dependsOnMethods="testcase1")
  public void testcase2() {
	  System.out.println("Testcase2 is successfully executed");
  }
  @Test
  public void testcase3() {
	  System.out.println("Testcase3 is successfully executed");
  }
}
