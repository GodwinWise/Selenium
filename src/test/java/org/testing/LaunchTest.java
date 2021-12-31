package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTest {
	WebDriver driver;
	@Parameters({"Browser"})
	@Test
	private void tc1 (String BrowserName) {
		if (BrowserName.contains("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}

}
