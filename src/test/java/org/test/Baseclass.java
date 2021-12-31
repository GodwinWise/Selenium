package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	
	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	public String currentUrl() {
		String a = driver.getCurrentUrl();
		System.out.println(a);
		return a;
	}
	
	public static void url(String url) {
		driver.get(url);
	}
	public static String getUrl() {
		return driver.getCurrentUrl();
		
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void sendValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}
	
		
	public static String getData(int rowNumber,int cellNumber, String sheetName,String fileName) throws IOException {
	
	File f = new File("C:\\Users\\Admin\\eclipse\\MavenProject\\File\\"+fileName+".xlsx");
	//C:\Users\Admin\eclipse\MavenProject\File\wise.xlsx
	FileInputStream read = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(read);
	Sheet sheet = w.getSheet(sheetName);
	
	Row r = sheet.getRow(rowNumber);
		Cell c= r.getCell(cellNumber);
		
		String value = "";
		int k = c.getCellType();
	if (k==1) {
		 value = c.getStringCellValue();
	}else if (DateUtil.isCellDateFormatted(c)) {
			
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yyyy");
			 value = sim.format(d);
			
		} else {
			double d = c.getNumericCellValue();
			
			long l = (long)d;
		    value = String.valueOf(l);
		}
		return value;
		
}
}