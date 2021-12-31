package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) throws IOException {
		
		File f = new File ("C:\\Users\\Admin\\eclipse\\MavenProject\\File\\WorkBook.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet cs = w.getSheet("Godwin2");
		cs.createRow(0);
		cs.getRow(0).createCell(0).setCellValue("sl.no");
		cs.getRow(0).createCell(1).setCellValue("Name");
		cs.getRow(0).createCell(2).setCellValue("UserName");
		cs.getRow(0).createCell(3).setCellValue("Password");
		
		cs.createRow(1);
		cs.getRow(1).createCell(0).setCellValue("1");
		cs.getRow(1).createCell(1).setCellValue("Sachin");
		cs.getRow(1).createCell(2).setCellValue("Sachin10@gmail.com");
		cs.getRow(1).createCell(3).setCellValue("1234567890");
		
		cs.createRow(2);
		cs.getRow(2).createCell(0).setCellValue("2");
		cs.getRow(2).createCell(1).setCellValue("Dhoni");
		cs.getRow(2).createCell(2).setCellValue("dhoni007@gmail.com");
		cs.getRow(2).createCell(3).setCellValue("2136545698");
		
		cs.createRow(3);
		cs.getRow(3).createCell(0).setCellValue("3");
		cs.getRow(3).createCell(1).setCellValue("Kholi");
		cs.getRow(3).createCell(2).setCellValue("virat100@gmail.com");
		cs.getRow(3).createCell(3).setCellValue("2257896548");
		
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		System.out.println("done");
	}
}