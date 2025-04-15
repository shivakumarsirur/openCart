package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homapge extends BasePage {

	public Homapge(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
By myaccount=By.xpath("//span[text()='My Account']");

By register=By.xpath("//a[text()=\"Register\"]");
By Login=By.xpath("//a[text()=\"Login\"]");


public void myaccoutview() {
	driver.findElement(myaccount).click();
	driver.findElement(register).click();
}

public void register() {
	driver.findElement(register).click();
}
public void login() {
	driver.findElement(Login).click();
}
}
