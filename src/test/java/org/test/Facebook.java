package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Facebook extends Baseclass{
	
	public static void main(String[] args) throws IOException {
		launchbrowser();
		url("https://en-gb.facebook.com/");
		maximize();
		WebElement userName = driver.findElement(By.id("email"));
		sendValue(userName, getData(1,0,"Sheet3", "wise"));
		WebElement paswrd = driver.findElement(By.id("pass"));
		sendValue(paswrd, getData(1, 1,"Sheet3", "wise"));
		WebElement clk = driver.findElement(By.name("login"));
		click(clk);
		}
	}