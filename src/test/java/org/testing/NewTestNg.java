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

public class NewTestNg extends Baseclass {
@Parameters({"emailfield","passwordfield"})
@Test
private void test1(String username, String paswrd) throws IOException {
	url("https://en-gb.facebook.com/");
	LoginPojo l = new LoginPojo();
	sendValue(l.getUserName(), username);
	sendValue(l.getPaswrd(), paswrd);
}
@Parameters({"email", "pass"})
@Test
private void test2(String name, String Pass) throws IOException {
	url("https://en-gb.facebook.com/");
	LoginPojo l = new LoginPojo();
	sendValue(l.getUserName(), name);
	sendValue(l.getPaswrd(), Pass);
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
