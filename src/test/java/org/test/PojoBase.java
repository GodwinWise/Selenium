package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PojoBase extends Baseclass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		launchbrowser();
		url("https://en-gb.facebook.com/");
		maximize();
		LoginPojo l = new LoginPojo();
		
		WebElement a = l.getUserName();
		WebElement b = l.getPaswrd();
		WebElement c = l.getClkLogin();

		sendValue(a, getData(1, 0,"Sheet3" , "wise"));
		sendValue(b, getData(1, 1, "Sheet3", "wise"));
		click(c);
		Thread.sleep(3000);
		
		
		driver.navigate().refresh();
		
		
		sendValue(a, getData(2, 0,"Sheet3" , "wise"));
		sendValue(b, getData(2, 1, "Sheet3", "wise"));
		click(c);
		
		
		}
	
	
	}