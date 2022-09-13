package resources;

import org.testng.asserts.SoftAssert;

public class CommonUtilities {
public static void HandleAssertions(String actual,String expected, String actual1, String expected1, String actualpagetitle, String expectedpagetitle) {
	SoftAssert assertion=new SoftAssert();
	assertion.assertEquals(actual, expected);
	assertion.assertEquals(actual1, expected1);
	assertion.assertEquals(actualpagetitle, expectedpagetitle);
	assertion.assertAll();
}
public static void HandleAssertions1(String actualwarningtext,String expectedwarningtext, String actualTitle, String expectedTitle) {
	SoftAssert assertion=new SoftAssert();
	assertion.assertEquals(actualwarningtext, expectedwarningtext);
	assertion.assertEquals(actualTitle, expectedTitle);
	assertion.assertAll();
}

}
