package org.testing;

import java.io.IOException;
import java.util.Date;

import org.junit.Before;
import org.test.Baseclass;
import org.test.LoginPojo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviders extends Baseclass {
@DataProvider(name = "loginData")
private Object[][] getData() throws IOException {
	return new Object[][] {
//		{"godwin@gmail.com","god123"},
//		{"wise123@gmail.com","wise@123"},
//		{"godwinwise1@gmail.com","godwin125"},
//		{"wisegodwin@gmail.com", "wisgod125"},
		{getData(1, 0, "Sheet3", "wise"),getData(1, 1, "Sheet3", "wise")},
		{getData(2, 0, "Sheet3", "wise"),getData(2, 1, "Sheet3", "wise")},
		{getData(3, 0, "Sheet3", "wise"),getData(3, 1, "Sheet3", "wise")},
	};
}
@Test (dataProvider="loginData")
private void test1(String username, String paswrd) throws IOException, InterruptedException {
	url("https://en-gb.facebook.com/");
	String url = getUrl();
	Assert.assertTrue(url.contains("facebook"), "Check your url");
	LoginPojo l = new LoginPojo();
	sendValue(l.getUserName(), username);
	sendValue(l.getPaswrd(), paswrd);
	click(l.getClkLogin());
	Thread.sleep(2000);
}
@Test (dataProvider="loginData")
private void test12(String user, String pass) throws IOException {
	url("https://en-gb.facebook.com/");
	String url = getUrl();
	Assert.assertTrue(url.contains("facebook"), "Check your url");
	LoginPojo l = new LoginPojo();
	sendValue(l.getUserName(), user);
	sendValue(l.getPaswrd(), pass);
	click(l.getClkLogin());
}

@BeforeMethod
private void StartTime() {
	Date d = new Date();
	System.out.println(d);
}
@AfterMethod
private void EndTime() {
	Date d =new Date();
	System.out.println(d);
}
@BeforeClass
private void LaunchBrowser() {
	launchbrowser();
}
@AfterClass
private void CloseBrowser() {
	System.out.println("BrowserClose");

}
}
