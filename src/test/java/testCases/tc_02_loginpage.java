package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class tc_02_loginpage extends Baseclass {
	
	
	
  @Test
  public void mytc02() throws IOException {
	//  driver.navigate().to("http://localhost/index.php?route=account/login");
	  logger.info("test case 02 startyed");
	  LoginPage hp=new LoginPage(driver);
	  hp.setEmail(p.getProperty("email"));
	  hp.setPassword(p.getProperty("password"));
	  hp.button();
	  logger.info("innnn");
	  String actualMessage = hp.message();
	  AssertJUnit.assertEquals(actualMessage, "My Account");
	  
	  
  }
	
 
 
    }

 

