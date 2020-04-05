package utils;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {


	public static String[][] readData(String fileName, String sheetName) throws IOException {


		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+fileName);
		XSSFSheet wsheet = wbook.getSheet(sheetName);
		int lastRowNum = wsheet.getLastRowNum();
		short lastColNum = wsheet.getRow(0).getLastCellNum();
		String[][] dataArray = new String[lastRowNum][lastColNum];
		for (int i = 1; i <= lastRowNum; i++) 
		{
			XSSFRow row = wsheet.getRow(i);
			for (int j = 0; j < lastColNum; j++) 
			{
				if(row.getCell(j).getStringCellValue()!=null)
				{
					String excelValue = row.getCell(j).getStringCellValue();
					dataArray[i-1][j]=excelValue;
				}
				else
				{
					dataArray[i-1][j]= "";
				}
			}

		}
		wbook.close();
		return dataArray;
	}
}


