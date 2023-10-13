package com.Opencart.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	
	
	

	public String readData(int sheet_index,int row_num,int cell_num) throws IOException
	{
		String path = "C:\\Users\\ks\\eclipse-workspace\\05MarchOpencart\\Resources\\TestData.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFCell cell = wb.getSheetAt(sheet_index).getRow(row_num).getCell(cell_num);

		DataFormatter df = new DataFormatter();
		String data = df.formatCellValue(cell);                   //THIS METHOD CONVERTS DATA FORMAT INTO STRING FORMAT 


		//String data = cell.getStringCellValue();
		//wb.close();
		return data;
	}
}
	

	
	
	

