package com.udemy.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataStepDefn {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\User.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("TestCases");
		for (int i = sheet.getFirstRowNum(); i < sheet.getLastRowNum(); i++) {

			XSSFRow row = sheet.getRow(i);

			for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {

				XSSFCell cell = row.getCell(j);
				switch (cell.getCellType()) {

				case BLANK:
					System.out.println("");
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				default:
					System.out.println("Cell Type Not found");

				}

			}

		}
		wb.close();
		fis.close();

	}

}
