package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	By login=By.xpath("//input[@name=\"email\"]");
	By password=By.xpath("//input[@name=\"password\"]");
	By clickbutton=By.xpath("//input[@value=\"Login\"]");
	By SuccesMessage=By.xpath("//h2[text()=\"My Account\"]");
	
	
	public void setEmail(String email) {
		driver.findElement(login);
		
	}
	public void setPassword(String pass) {
		driver.findElement(password);
	}
	public void button() {
		driver.findElement(clickbutton).click();
	}
	public String message() {
		return driver.findElement(SuccesMessage).getText();
	}

	
}
