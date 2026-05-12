package com.example.javacode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

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
		XSSFSheet sh = wb.getSheet("Sheet2");
		
		
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
