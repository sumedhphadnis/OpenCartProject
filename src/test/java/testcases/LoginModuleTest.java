package testcases;




import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginModuleTestObject;
import pageObjectModel.RegisterAccountPageModel;
import resources.BaseClass;
import resources.CommonUtilities;
import resources.TestCaseData;

public class LoginModuleTest extends BaseClass {
	@Test
	public void LoginModule()throws IOException, InterruptedException {
		
		RegisterAccountPageModel rpo=new RegisterAccountPageModel(driver);
		rpo.MyAccountButton().click();
		rpo.RegisterButton().click();
		LoginModuleTestObject lmo=new LoginModuleTestObject(driver);
		lmo.LoginModuleButon().click();
		System.out.println(driver.getTitle());
		lmo.Enteremail().sendKeys("JohnP@gmail.com");
		lmo.Password().sendKeys("1234abc");
		lmo.Login().click();
		
		WebElement c=lmo.Alert();
		System.out.println("Warning text displayed on Login Page :"+c.getText());
		String expectedwarningtext=TestCaseData.expectedwarningtext;
		String actualwarningtext=c.getText();
		String actualTitle=driver.getTitle();
		String expectedTitle=TestCaseData.ExpectedTitle;
		CommonUtilities.HandleAssertions1(actualwarningtext, expectedwarningtext, actualTitle,expectedTitle);
		 driver.quit();
	
		
		
				
		
		
		

}
}