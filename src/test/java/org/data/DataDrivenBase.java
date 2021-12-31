package org.data;

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

public class DataDrivenBase {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Admin\\eclipse\\MavenProject2\\File\\wise.xlsx");
		
		FileInputStream read = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(read);
		Sheet sheet = w.getSheet("Sheet2");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row r = sheet.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c= r.getCell(j);
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
			System.out.println(value);
		}
		}
			
		}
		
		
		
		
		
		
		
		
		
	}

