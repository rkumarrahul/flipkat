package com.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{

	public String readDatafromExcel(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(AutoConstant.ExcelFile_path);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		wb.close();
		return row.getCell(cellNum).getStringCellValue();
	}
	
	
	public void setDatafromExcel(String sheetName, int rowNum, int cellNum, String value) throws IOException
	{
		FileInputStream fis=new FileInputStream(AutoConstant.ExcelFile_path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(value);
		FileOutputStream fos=new FileOutputStream(AutoConstant.ExcelFile_path);
		wb.write(fos);
	    fos.flush();
	    wb.close();
	}
}
