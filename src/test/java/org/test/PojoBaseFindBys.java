package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PojoBaseFindBys extends Baseclass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		launchbrowser();
		url("https://en-gb.facebook.com/");
		maximize();
		PojoFindBys l = new PojoFindBys();
		
		WebElement a = l.getAllUsername();
		WebElement b = l.getAllpaswrd();
		
		sendValue(a, getData(1, 0,"Sheet3" , "wise"));
		sendValue(b, getData(1, 1, "Sheet3", "wise"));
		Thread.sleep(3000);
		
		
		driver.navigate().refresh();
		
		
		sendValue(a, getData(2, 0,"Sheet3" , "wise"));
		sendValue(b, getData(2, 1, "Sheet3", "wise"));
		
		
		}
	
	
	}