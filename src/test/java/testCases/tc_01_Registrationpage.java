package testCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc_01_Registrationpage extends Baseclass {


 

    @Test
    public void testcase() throws InterruptedException {
 logger.info("starting the test cases");
 
 try {
        registerPage.setUsername("hello brother");
        logger.info("enrtered firstname");
        registerPage.setLastname("welcome");
     
      String emailid=RandomString()+"@gmail.com";
        		System.out.println(emailid);
        registerPage.setEmail(emailid);
        Thread.sleep(2000);
        registerPage.setTelephone("9654788891");
        registerPage.setPassword("voilatile");
        registerPage.setConfirmPassword("voilatile");
        registerPage.selectCheckbox();
        Thread.sleep(2000);
        registerPage.clickSubmitButton();
        logger.info("submit button clicked");
        
        String expectedMessage = "Your Account Has Been Created!";
        String actualMessage = registerPage.success();  // assuming registerPage is already initialized
        AssertJUnit.assertEquals(actualMessage, expectedMessage);
 }catch (Exception e) {
	// TODO: handle exception
	 logger.error("test class failed ");
	
	 Assert.fail();
}
 logger.info("finished");
    }

 
}
