package com.codePractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelConnections {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"/ExFol/test.xlsx");
	
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s=(Sheet) wb.getSheet("Sheet1");
		String c = s.getRow(1).getCell(3).getStringCellValue();
		//System.out.println(c);		
		
		for(int i=0;i<=s.getLastRowNum(); i++) {
				String col = s.getRow(i).getCell(1).getStringCellValue();
				//System.out.println(col);			
		}
	}
}
