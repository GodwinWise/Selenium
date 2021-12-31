package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Admin\\eclipse\\MavenProject\\File\\wise.xlsx");
		
		FileInputStream read = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(read);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		System.out.println(cell);
		
		Row row2 = sheet.getRow(2);
		Cell cell2 = row2.getCell(2);
		System.out.println(cell2);
		
		int i = sheet.getPhysicalNumberOfRows();
		System.out.println("\nNumber of Rows: "+i);
		
		int j = row.getPhysicalNumberOfCells();
		System.out.println("Number of Cells "+j);
		

		
		}
		
	}

