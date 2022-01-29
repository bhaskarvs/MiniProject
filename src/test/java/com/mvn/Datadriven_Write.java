package com.mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {
	
	public static void data_write() throws IOException {
		// TODO Auto-generated method stub

	
	
	File f = new File("C:\\Users\\Vekshana\\eclipse-workspace\\Maven_Project\\Book1.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fis);
	
	Sheet createSheet = w.createSheet("demo");
	
	Row row = createSheet.createRow(0);
	
	Cell cell = row.createCell(0);
	
	cell.setCellValue("name");
	
	w.getSheet("demo").getRow(0).createCell(1).setCellValue("course");
	
	w.getSheet("demo").getRow(0).createCell(2).setCellValue("area_of_interest");
	
	w.getSheet("demo").getRow(0).createCell(3).setCellValue("passed_out");
	
	w.getSheet("demo").createRow(1).createCell(0).setCellValue("bhaskar");
	
	w.getSheet("demo").getRow(1).createCell(1).setCellValue("bachelor_of_engineering");
	
	w.getSheet("demo").getRow(1).createCell(2).setCellValue("aeronautical");
	
	w.getSheet("demo").getRow(1).createCell(3).setCellValue("2017");
	
    FileOutputStream fos= new FileOutputStream(f);
    
    w.write(fos);
    w.close();
	}
    public static void main(String[] args) throws Throwable {
    	
    	data_write();
		
	
}}
	
	
	
	
	
	
	
	
	


