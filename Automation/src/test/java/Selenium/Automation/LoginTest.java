package Selenium.Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest {
  @Test
  public void f() {
	 System.out.println("hi");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("hhhh");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("ghjkh");
  }

}
