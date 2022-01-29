package com.mvn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {

	public static void read_Particular_Data() throws Throwable {

		File f = new File("C:\\Users\\Vekshana\\eclipse-workspace\\Maven_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(0);

		Cell cell = row.getCell(0);

		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {
			String value = cell.getStringCellValue();

			System.out.println(value);
		}

		else if (cellType.equals(cellType.NUMERIC)) {
			double value = cell.getNumericCellValue();

			int num = (int) value;

			System.out.println(num);

		}

	}

	public static void read_all_data() throws Throwable {

		File f = new File("C:\\Users\\Vekshana\\eclipse-workspace\\Maven_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		//iterate row
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {
					String value = cell.getStringCellValue();

					System.out.println(value);
				}

				else if (cellType.equals(cellType.NUMERIC)) {
					double value = cell.getNumericCellValue();

					int num = (int) value;

					System.out.println(num);

			}
			
			}}}
	
	public static void read_particular_row() throws Throwable {
		
		File f = new File("C:\\Users\\Vekshana\\eclipse-workspace\\Maven_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		Row row = sheetAt.getRow(0);
		
		int numberOfCells = row.getPhysicalNumberOfCells();
		
		for (int i = 0; i < numberOfCells; i++) {
		
			Cell cell = row.getCell(i);
			
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();

				System.out.println(value);
			}

			else if (cellType.equals(cellType.NUMERIC)) {
				double value = cell.getNumericCellValue();

				int num = (int) value;

				System.out.println("\n"+num);


		}
		
		}

	}
	
	public static void read_particular_column() throws Throwable {
		File f = new File("C:\\Users\\Vekshana\\eclipse-workspace\\Maven_Project\\Book1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			Cell cell = row.getCell(1);
			
			CellType cellType = cell.getCellType();
	
			if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();

				System.out.println(value);
			}

			else if (cellType.equals(cellType.NUMERIC)) {
				double value = cell.getNumericCellValue();

				int num = (int) value;

				System.out.println("\n"+num);


		}
		

		}
		

	}
	public static void main(String[] args) throws Throwable {

//		read_Particular_Data();
		
//		read_all_data();
		
		System.out.println("read_particular_row");
		
		read_particular_row();
		
		System.out.println("read_particluar_column");
		
		read_particular_column();
	}
	

}
