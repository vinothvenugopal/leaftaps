package working;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		ReadExcel excel = new ReadExcel();
		excel.readData();
	}
		public String[][] readData() throws IOException {

			XSSFWorkbook wbook = new XSSFWorkbook("./data/EditLeads.xlsx");
			XSSFSheet wsheet = wbook.getSheet("Edit");
			int lastRowNum = wsheet.getLastRowNum();
			short lastColNum = wsheet.getRow(0).getLastCellNum();
			String[][] dataArray = new String[lastRowNum][lastColNum];
			for (int i = 1; i <= lastRowNum; i++) 
			{
				XSSFRow row = wsheet.getRow(i);
				for (int j = 0; j < lastColNum; j++) 
				{
					String excelValue = row.getCell(j).getStringCellValue();
					dataArray[i-1][j]=excelValue;
				}

			}
			wbook.close();
			for (int i = 0; i < lastRowNum; i++) 
			{
				XSSFRow row = wsheet.getRow(i);
				for (int j = 0; j < lastColNum; j++) 
				{
					System.out.println(dataArray[i][j]);
				}

				
			}
			return dataArray;
		}
	}


