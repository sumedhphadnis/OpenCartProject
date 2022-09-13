package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepageobjects {
	public  WebDriver driver;
	By searchenter=By.xpath("//input[@name='search']");
	By searchbutton=By.xpath("//i[@class='fa fa-search']");
	By commonxpathforheader=By.xpath("//h4");
	By pricetextfordevice=By.xpath("//p[@class='price']");
	By deviceaddtocart=By.xpath("//div[@class='button-group']/button//i[@class='fa fa-shopping-cart']");
	By searchbar=By.xpath("//input[@name='search']");
	By opencartbuton=By.xpath("//div[@id='cart']/button");
	By carttabledataelements=By.xpath("//td[@class='text-right']");
	
	
	 public Homepageobjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement Entersearchdata() {
		return driver.findElement(searchenter);
	}
	public WebElement searchbutton() {
		return driver.findElement(searchbutton);
	}
	public List<WebElement> commonheaderxpath() {
		return driver.findElements(commonxpathforheader);
	}
	public WebElement deviceprice() {
		return driver.findElement(pricetextfordevice);
	}
	public WebElement OpenCartButton() {
		return driver.findElement(opencartbuton);
    }
	public List<WebElement> CartDataElements() {
		return driver.findElements(carttabledataelements);
	}
	public WebElement SearchBar() {
		return driver.findElement(searchbar);
	}
	public WebElement adddevicetocart() {
		return driver.findElement(deviceaddtocart);
	}
	
	
}
	
	
