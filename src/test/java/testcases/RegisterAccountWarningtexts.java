package testcases;


import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.RegisterAccountPageModel;
import resources.BaseClass;
import resources.CommonUtilities;
import resources.TestCaseData;

public class RegisterAccountWarningtexts extends BaseClass {
	@Test
	public void RegAccountWarningtexts() throws IOException, InterruptedException {
		
		RegisterAccountPageModel rpo=new RegisterAccountPageModel(driver);
		rpo.MyAccountButton().click();
		rpo.RegisterButton().click();
		System.out.println(driver.getTitle());
		rpo.EnterFirstname().sendKeys(TestCaseData.firstname);
		rpo.EnterLastname().sendKeys(TestCaseData.lastname);
		rpo.EnterEmail().sendKeys(TestCaseData.email);
		rpo.EnterTelephone().sendKeys(TestCaseData.telephonenumber);
		rpo.EnterPassword().sendKeys(TestCaseData.password);
		rpo.ConfirmPassword().sendKeys(TestCaseData.confirmpassword);
		rpo.ContinueButton().click();
		Thread.sleep(5000);
		WebElement a=rpo.GetAlert1();
		System.out.println("Warning text displayed on Register Account Page :"+a.getText());
		WebElement b=rpo.GetAlert2();
		System.out.println("Warning text displayed on Register Account Page :"+b.getText());
		
		String expected=TestCaseData.alertmessage1;
		String actual=a.getText();
		String expected1=TestCaseData.alertmessage2;
		String actual1=b.getText();
		String actualpagetitle=driver.getTitle();
		String expectedpagetitle="Register Account";
		CommonUtilities.HandleAssertions(actual, expected, actual1, expected1,actualpagetitle, expectedpagetitle );
		 driver.quit();
	
	}

}
