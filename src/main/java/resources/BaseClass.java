package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public WebDriver browserlaunch() throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop=new Properties();
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		browsername.equalsIgnoreCase("chrome");
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 return driver;
	} 
	@BeforeMethod
	public void launchbrowser() throws IOException {
		browserlaunch();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}

}
