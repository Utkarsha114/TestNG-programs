package com.example.javacode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("D:\\Training\\Test.xlsx");
		
		//excel read
		FileInputStream fis = new FileInputStream(f1);
		
		//to read excel sheet data we need librarires. here we use Apache Poi 
		//XSSF = XML Style sheet format (used today)  or HSSF (for older version)
	
		// to read and write files, we add packages of apache poi and poi-ooxml
		XSSFWorkbook  wb = new XSSFWorkbook(fis);
		
		// access the 1st sheet in the Test.xlsx file
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		
		// to access each cell in the excel sheet
		/*
		XSSFRow r = sh.getRow(0);
		
		XSSFCell c1 = r.getCell(0);
		
		XSSFCell c2 = r.getCell(1);
		
		System.out.println(c1);
		System.out.println(c2);
		
		XSSFRow r1 = sh.getRow(1);
		
		XSSFCell c3 = r1.getCell(0);
		
		XSSFCell c4 = r1.getCell(1);
		
		System.out.println(c3);
		System.out.println(c4);
		
		XSSFRow r2 = sh.getRow(2);
		
		XSSFCell c5 = r2.getCell(0);
		
		XSSFCell c6 = r2.getCell(1);
		
		XSSFCell c7 = r2.getCell(2);
		
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		
		XSSFRow r3 = sh.getRow(3);
		
		XSSFCell c8 = r3.getCell(0);
		
		System.out.println(c8);
		*/
		
		
		// to access all rows together (for big data)
		
		int rowSize = sh.getLastRowNum();  //last row in which data is present
		for (int i=0; i<=rowSize; i++) { // i=0, j=0
			int colSize = sh.getRow(i).getLastCellNum();
			
			for(int j =0;j<colSize;j++) { //i=0, j=1, 
				System.out.print(sh.getRow(i).getCell(j) + " ");
			}
			System.out.println(); //to print data on next line for a new row
		}
		
sh.getRow(0).createCell(2).setCellValue("Status");
		
		//write in excelsheet
		
		FileOutputStream fout = new FileOutputStream(f1);
		wb.write(fout);
		
		System.out.println("data write successfully");
		
	}

}
