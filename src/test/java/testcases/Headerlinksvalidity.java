package testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import resources.BaseClass;

public class Headerlinksvalidity extends BaseClass {
	@Test
	public void HeaderLinks () throws IOException {
	
		List<WebElement>links=driver.findElements(By.xpath("//ul[@class='list-inline']//a"));
		SoftAssert a =new SoftAssert(); 

        for(WebElement link : links)
        {
            String url= link.getAttribute("href");
            HttpURLConnection  conn= (HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode);
           a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);
        }
       a.assertAll();
       driver.quit();
  }
	
	}


