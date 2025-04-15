package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pageObjects.AccountRegisterPage;
import pageObjects.Homapge;

public class Baseclass {
WebDriver driver;
public Logger logger;
public Properties p;
AccountRegisterPage registerPage;
	   @BeforeClass
	   @Parameters({"browser"})
	    public void setup(String br) throws IOException {
	        // Update this path if needed
		   
		   
		//loading config properties
		   FileReader file=new FileReader("/home/shiv/eclipse-workspace/openCart/src/test/resources/config.properties");
		   p=new Properties();
		   p.load(file);
	       
		   logger = LogManager.getLogger(this.getClass());
		   if (br.equalsIgnoreCase("chrome")) {
		        driver = new ChromeDriver();
		    }
	        //String appurl = p.getProperty("appurl");

	       
	        driver.get(p.getProperty("appurl"));
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        Homapge hpg=new Homapge(driver);
	        hpg.myaccoutview();
	        registerPage = new AccountRegisterPage(driver);
	     
	    }
	  @AfterClass
	    public void teardown() {
	        driver.quit();
	    }
	    public String RandomString() {
	    	
	    String generatedstring=	RandomStringUtils.randomAlphabetic(8);
			return generatedstring;
	    	
	    }
}
