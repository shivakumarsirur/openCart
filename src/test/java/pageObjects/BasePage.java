package pageObjects;

import org.openqa.selenium.WebDriver;

public class BasePage {

	   public WebDriver driver; // use protected so subclasses can access it

	    public BasePage(WebDriver driver) {
	        this.driver = driver;
	    }

	
}
