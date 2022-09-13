package testcases;

import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjectModel.Homepageobjects;
import resources.BaseClass;
import resources.TestCaseData;

public class VerifyProductPrice extends BaseClass {
	@Test
	public void VerifyPrice() throws InterruptedException, IOException {
		
		Homepageobjects hpo=new Homepageobjects(driver);
		hpo.Entersearchdata().sendKeys(TestCaseData.device1);
		hpo.searchbutton().click();
        Thread.sleep(5000);
        List<WebElement> a=hpo.commonheaderxpath();
        
        String iphoneText = "";
        for(int i=0;i<a.size();i++) {
        String text=a.get(i).getText();
        if(text.equalsIgnoreCase(TestCaseData.device1)) { 
        iphoneText=driver.findElements(By.xpath("//p[@class='price']")).get(i).getText();
        break; 
         }
        }
        
           String words[]= iphoneText.split(" ");
           String FinalIphonePrice=words[0].replaceAll("[^\\d.]", "");
           double FinalIphonePriceInt= Double.parseDouble(FinalIphonePrice);
           
           List<WebElement> c=hpo.commonheaderxpath();
           for(int i=0;i<c.size();i++) {
           String text=c.get(i).getText();
           if(text.equalsIgnoreCase(TestCaseData.device1)) { 
           driver.findElements(By.xpath("//div[@class='button-group']/button//i[@class='fa fa-shopping-cart']")).get(i).click();
             break; 
            }
           }
           hpo.Entersearchdata().clear();
           hpo.Entersearchdata().sendKeys(TestCaseData.device2);
           hpo.searchbutton().click();
     
           List<WebElement> b=hpo.commonheaderxpath();
           String samusngText = "";
           for(int i=0;i<b.size();i++) {
           String text=b.get(i).getText();
           if(text.equalsIgnoreCase(TestCaseData.device2)) { 
           samusngText=driver.findElements(By.xpath("//p[@class='price']")).get(i).getText();
           break; 
            }
           }
            String wordsSamsung[]= samusngText.split(" ");
            String FinalSamsungPrice=wordsSamsung[0].replaceAll("[^\\d.]", "");
            double FinalSamsungPriceInt= Double.parseDouble(FinalSamsungPrice);
            
            List<WebElement> e=hpo.commonheaderxpath();
            for(int i=0;i<e.size();i++) {
            String text=e.get(i).getText();
            if(text.equalsIgnoreCase(TestCaseData.device2)) { 
            driver.findElements(By.xpath("//div[@class='button-group']/button//i[@class='fa fa-shopping-cart']")).get(i).click();
            break;  
             }
            }
           double totalPrice=FinalIphonePriceInt+FinalSamsungPriceInt;
           String totalPRiceWithDollar="$"+totalPrice;
           System.out.println(totalPRiceWithDollar);
           Thread.sleep(5000);
           
           hpo.OpenCartButton().click();
            
            Thread.sleep(2000);
            List<WebElement> k=hpo.CartDataElements();
            for (int i=0;i<k.size();i++) {
            String text=k.get(i).getText();
            if(text.equalsIgnoreCase(totalPRiceWithDollar)) {
            System.out.println(TestCaseData.confirmationtext);
            }
            }
            
            
            driver.quit();
          }
	     }