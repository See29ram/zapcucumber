package com.udemy.datadriven;

import java.io.File;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws Exception {

		File file = new File("D:\\NewFile.xlsx");
		FileOutputStream fos = new FileOutputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("data");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0, CellType.STRING);
		cell.setCellValue("flipkart");
		wb.write(fos);
		wb.close();
		fos.close();

	}

}
