package org.testing;

import java.io.IOException;
import java.util.Date;

import org.junit.Before;
import org.test.Baseclass;
import org.test.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg extends Baseclass {
@Test
private void test1() throws IOException {
	url("https://en-gb.facebook.com/");
	LoginPojo l = new LoginPojo();
	sendValue(l.getUserName(), getData(1, 0, "Sheet3", "wise"));
	sendValue(l.getPaswrd(), getData(1, 1, "Sheet3", "wise"));
}
@Test
private void test2() throws IOException {
	url("https://en-gb.facebook.com/");
	LoginPojo l = new LoginPojo();
	sendValue(l.getUserName(), getData(2, 0, "Sheet3", "wise"));
	sendValue(l.getPaswrd(), getData(1, 1, "Sheet3", "wise"));
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
