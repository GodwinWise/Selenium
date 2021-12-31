package org.Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRevision {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse\\MavenProject2\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys("godwinwise");
	driver.findElement(By.id("pass")).sendKeys("12345");
	driver.findElement(By.xpath("//button[text()='Log In']")).click();
	
	driver.findElement(By.id("pass")).sendKeys("254316");
	driver.close();
}
}