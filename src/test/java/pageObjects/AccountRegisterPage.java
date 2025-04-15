package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountRegisterPage extends BasePage {
	
    public AccountRegisterPage(WebDriver driver) {
        super(driver); // properly initializes the driver from BasePage
    }
 
 
    By username = By.xpath("//input[@name='firstname']");
    By lastname = By.xpath("//input[@name='lastname']");
    By email = By.xpath("//input[@name='email']");
    By telephone = By.xpath("//input[@name='telephone']");
    By password = By.xpath("//input[@name='password']");
    By confirmPassword = By.xpath("//input[@name='confirm']");
    By checkbox = By.xpath("//input[@name='agree']");
    By submitButton = By.xpath("//input[@value='Continue']");
     By confimation=By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
     By successmessge=By.xpath("//h1[text()=\"Your Account Has Been Created!\"]");
     

    public void setUsername(String usernameParam) {
        driver.findElement(username).sendKeys(usernameParam);
    }

    public void setLastname(String lastnameParam) {
        driver.findElement(lastname).sendKeys(lastnameParam);
    }

    public void setEmail(String emailParam) {
        driver.findElement(email).sendKeys(emailParam);
    }

    public void setTelephone(String phoneParam) {
        driver.findElement(telephone).sendKeys(phoneParam);
    }

    public void setPassword(String passwordParam) {
        driver.findElement(password).sendKeys(passwordParam);
    }

    public void setConfirmPassword(String confirmPasswordParam) {
        driver.findElement(confirmPassword).sendKeys(confirmPasswordParam);
    }

    public void selectCheckbox() {
        driver.findElement(checkbox).click();;
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }
    public String success() {
		String text= driver.findElement(successmessge).getText();
		System.out.println(text);
    	return text;
    	
    	
    }
 
    }

