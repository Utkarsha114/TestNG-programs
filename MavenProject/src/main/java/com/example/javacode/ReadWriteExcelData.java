package com.example.javacode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelData {
	static File f1;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static FileOutputStream fout;
	
	public static void getExcel(String filePath, String sheetName) throws IOException {
		
		f1 = new File(filePath);
		fis = new FileInputStream(f1);
		
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(sheetName);
		
		
	}

	public static int getRowCount() {
		// TODO Auto-generated method stub
		return sh.getLastRowNum();
	}
	
	public static String getData (int row, int col) {
		return sh.getRow(row).getCell(col).getStringCellValue();
	}
	
	public static void setData (int row, int col, String value) throws IOException {
		sh.getRow(row).createCell(col).setCellValue(value);
		
		fout = new FileOutputStream(f1);
		wb.write(fout);
	}
}
