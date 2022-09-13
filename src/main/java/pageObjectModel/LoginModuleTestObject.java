package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginModuleTestObject {
	public  WebDriver driver;
	By LoginmoduleButton=By.linkText("Login");
	By EnterEmail=By.xpath("//input[@id='input-email']");
	By EnterPassword=By.xpath("//input[@id='input-password']");
	By LoginButton=By.xpath("//input[@value='Login']");
	By alertmessage=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	

	 public LoginModuleTestObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement LoginModuleButon() {
		return driver.findElement(LoginmoduleButton);
    }
	public WebElement Enteremail() {
		return driver.findElement(EnterEmail);
}
	public WebElement Password() {
		return driver.findElement(EnterPassword);
}
	public WebElement Login() {
		return driver.findElement(LoginButton);
	}
	public WebElement Alert() {
		return driver.findElement(alertmessage);
}
}