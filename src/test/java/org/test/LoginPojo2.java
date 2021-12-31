package org.test;

import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo2 extends Baseclass {
	
	public LoginPojo2() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="email")
private WebElement userName;

@FindBy(id="pass")
private WebElement paswrd;

@FindBy(name="login")
private WebElement ClkLogin;

}


