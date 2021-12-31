package org.testing;

import org.test.Baseclass;
import org.test.LoginPojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters extends Baseclass {
	@Parameters({"username","password"})
	@Test
	private void tc10(String User, String passw) {
	url("https://en-gb.facebook.com/");
	LoginPojo l = new LoginPojo();
	sendValue(l.getUserName(),User);
	sendValue(l.getPaswrd(), passw);
	}
	@Parameters({"user","pass"})
	@Test
private void tc11(String User, String passw) {
	url("https://en-gb.facebook.com/");
	LoginPojo l = new LoginPojo();
	sendValue(l.getUserName(),User);
	sendValue(l.getPaswrd(), passw);
	}
	
@BeforeClass
private void Launch() {
	launchbrowser();

}


}
