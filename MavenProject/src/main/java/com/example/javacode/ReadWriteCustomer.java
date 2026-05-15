package com.example.javacode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadWriteCustomer {
	
	static File f1;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static FileOutputStream fout;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		
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
		
		
		public static String getData (int row, int col) throws IOException {
			XSSFCell c = sh.getRow(row).getCell(col);
			if(c.getCellType() == CellType.NUMERIC) {
				if(DateUtil.isCellDateFormatted(c)) {
					SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
					
					String date = sdf.format(c.getDateCellValue());
					return date;
				}
				
				else {
					long num = (long) c.getNumericCellValue();
					String mobile =String.valueOf(num);
					return mobile;
					
				}
			}
			else {
				return sh.getRow(row).getCell(col).getStringCellValue();
			}	
		}
		
		
		
		public static void setData (int row, int col, String value) throws IOException {
			sh.getRow(row).createCell(col).setCellValue(value);
			
			fout = new FileOutputStream(f1);
			wb.write(fout);
		}
		
		
		}
		
		

//		if(c.getCellType() == CellType.NUMERIC) {
//			
//			if(DateUtil.isCellDateFormatted(c)) {
//				SimpleDateFormat sdf = SimpleDateFormat("dd-mm-yyyy");
//				
//				String date = sdf.format(c.getDteCellValue);
//				return date;
//			}
//		}
//		
//		else if(c.getCellType() == CellType.STRING) {
//			return sh.getRow(row).getCell(col).getStringCellValue();
//		}
//		else {
//		
//		}
//	}
//

