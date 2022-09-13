package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterAccountPageModel{
	public  WebDriver driver;
	By MyAccount=By.linkText("My Account");
	By Register=By.linkText("Register");
	By EnterFirstName=By.xpath("//input[@id='input-firstname']");
	By EnterLastName=By.xpath("//input[@id='input-lastname']");
	By EnterEmail=By.xpath("//input[@id='input-email']");
	By Telephone=By.xpath("//input[@id='input-telephone']");
	By Enterpassword=By.xpath("//input[@id='input-password']");
	By Confirmpassword=By.xpath("//input[@id='input-confirm']");
	By Continuebutton=By.xpath("//input[@value='Continue']");
	By alert1=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	By alert2=By.xpath("//div[@class='text-danger']");
	
	public RegisterAccountPageModel(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement MyAccountButton() {
		return driver.findElement(MyAccount);
	}
	public WebElement RegisterButton() {
		return driver.findElement(Register);
	}
	public WebElement EnterFirstname() {
		return driver.findElement(EnterFirstName);
	}
	public WebElement EnterLastname() {
		return driver.findElement(EnterLastName);
	}
	public WebElement EnterEmail() {
		return driver.findElement(EnterEmail);
	}
	public WebElement EnterTelephone() {
		return driver.findElement(Telephone);
	}
	public WebElement EnterPassword() {
		return driver.findElement(Enterpassword);
	}
	public WebElement ConfirmPassword() {
		return driver.findElement(Confirmpassword);
	}
	public WebElement ContinueButton() {
		return driver.findElement(Continuebutton);
	}
	public WebElement GetAlert1() {
		return driver.findElement(alert1);
	}
	public WebElement GetAlert2() {
		return driver.findElement(alert2);
	}
}
