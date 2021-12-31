package org.test;

import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoFindBys extends Baseclass {
	
	public PojoFindBys() {
		PageFactory.initElements(driver, this);
	}

		
		@FindBys({
			@FindBy(id="email"),
			@FindBy(xpath="//input[@placeholder='Email address or phone number']"),
		})
		
		private WebElement allUsername;
		
		public WebElement getAllUsername() {
			return allUsername;
		}
		
		@FindBys({
			@FindBy(id="pass"),
			@FindBy(xpath="//input[@placeholder='Password']"),
		})

		private WebElement allpaswrd;
		
		@FindAll({
			
			@FindBy(xpath="//button[text()='Log In']"),
		})
		private WebElement allClk;
		
		
		public WebElement getAllClk() {
			return allClk;
		}

		public WebElement getAllpaswrd() {
			return allpaswrd;
		}

}