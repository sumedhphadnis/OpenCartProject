package testcases;


import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjectModel.DropDownModel;
import pageObjectModel.Homepageobjects;
import resources.BaseClass;
import resources.TestCaseData;

public class StaticDropDownhandle extends BaseClass {
	@Test
	public void StaticDrophandle()  throws IOException, InterruptedException {
	
	DropDownModel ddm=new DropDownModel(driver);
	Thread.sleep(5000);
	ddm.DropdownToggle().click();
	//ddm.EUR().click();
	//ddm.GBP().click();
	ddm.USD().click();
	
	Homepageobjects hpo=new Homepageobjects(driver);
	 List<WebElement> a=hpo.commonheaderxpath();
	
     for(int i=0;i<a.size();i++) {
     String allPricesText=driver.findElements(By.xpath("//p[@class='price']")).get(i).getText();
     System.out.println(allPricesText);
     if (allPricesText.contains("£")) {
    	 System.out.println(TestCaseData.CurrencyTextError);
     }
     else {
    	 System.out.println(TestCaseData.CurrencyUnitsMatch);
     }
      
     }
     driver.quit();
	

}
}