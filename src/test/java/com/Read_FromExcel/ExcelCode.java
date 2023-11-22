package com.Read_FromExcel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jxls.common.CellData.CellType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelCode {
	public static FileInputStream ip; // we need to validate the path to get the excel file 
	public static XSSFWorkbook workbook; // created it to handle properties file this class is responsible to load 
	                                      // data from xlsx file 
	public static XSSFSheet sheet;   // created to handle individual sheet
	
	// Because we have to manage rows and columns 
	 // that's why we need to create @DataProvider because it returns 2_D Object Array
	
	
		
	
	
	@DataProvider(name = "TNLogin")
	public Object[][] getTNExcelLoginData() throws Exception {
		Object[][] data = ExcelCode.readFromExcelSheetTNLogin("LoginTN");
		return data;
	}
	public static Object [][] readFromExcelSheetTNLogin(String sheetName) throws Exception {
		ip =  new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\test\\\\java\\\\com\\\\Read_FromExcel\\\\ExcelData.xlsx");
		workbook = new XSSFWorkbook(ip);
		sheet = workbook.getSheet(sheetName);
		
		int rows =sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		Object [][] data = new Object [rows][cols];
		for (int i =0 ; i<rows ; i++);
		XSSFRow row = sheet.getRow(i+1);
		
		for (int j=0 ; j<cols ; j++) {
			XSSFCell cell = row.getCell(j);
			CellType celltype = cell.getCellType();
			switch (celltype ) {
			case STRING:
				     data[i][j] = cell.getStringCellValue();
				     break;
			case NUMERIC:
			     data[i][j] = Integer.toString(int)cell.getNumericCellValue());
			     break;
			case BOOLEAN:
			     data[i][j] = cell.getBooleanCellValue();
			     break;
				     
			}
			
			
			
		
		
		
		
	}

	}
	
	
	
	

}
