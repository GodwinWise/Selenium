package org.junit;

import java.io.IOException;
import java.util.Date;

import org.test.Baseclass;
import org.test.LoginPojo;

public class UnitTest extends Baseclass {
	
@Test
public void testCase3() throws IOException {
	url("https://en-gb.facebook.com/");
	String url = currentUrl();
	Assert.assertTrue("Check your Currrent url", url.contains("facebook"));
	LoginPojo l = new LoginPojo();
	sendValue(l.getUserName(), getData(1, 0, "Sheet3", "wise"));
	sendValue(l.getPaswrd(), getData(1, 1, "Sheet3", "wise"));
}
@Test
public void testCase2() throws IOException {
	url("https://en-gb.facebook.com/");
	LoginPojo l = new LoginPojo();
	String url = currentUrl();
	Assert.assertEquals("Check your url", url.contains("facebook"), url.contains("facebook"));
	sendValue(l.getUserName(), getData(2, 0, "Sheet3", "wise"));
	sendValue(l.getPaswrd(), getData(2, 1, "Sheet3", "wise"));
}
@Test
public void testCase1() {
	url("https://www.snapdeal.com/");
	String a = getUrl();
	System.out.println(a);
}

@Before
public void startTime() {
	Date d = new Date();
	System.out.println(d);
}
@After
public void endTime() {
	Date d = new Date();
	System.out.println(d);
}
	
@BeforeClass
public static void OpenBrowser() {
	launchbrowser();
}
@AfterClass
public static void CloseBrowser() {
	System.out.println("\nCloseBrowser");
	

}
	
}