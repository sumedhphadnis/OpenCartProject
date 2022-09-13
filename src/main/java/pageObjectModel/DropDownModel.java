package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownModel {
	public  WebDriver driver;
	By toggledropdown=By.xpath("(//button[@data-toggle='dropdown'])[1]");
	By EURentry=By.xpath("//button[@name='EUR']");
	By GBPentry=By.xpath("//button[@name='GBP']");
	By USDentry=By.xpath("//button[@name='USD']");
	
	
	public DropDownModel(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement DropdownToggle() {
		return driver.findElement(toggledropdown);
	}
	public WebElement EUR() {
		return driver.findElement(EURentry);
		
	}public WebElement GBP() {
		return driver.findElement(GBPentry);
	}
	public WebElement USD() {
		return driver.findElement(USDentry);
	}

}
