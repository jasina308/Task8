import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelfFile {
		
		public static void main(String[] args) throws IOException {
			
			//set up the path for excel
			XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\Jasina\\eclipse-workspace\\ExcelFileOperations\\Newexcel.xlsx");

			//Get into the sheet
			XSSFSheet sheet = wb.getSheet("Sheet1");
			
			//row count
			int rowcount = sheet.getLastRowNum();
			
			//column count
			int columnCount = sheet.getRow(0).getLastCellNum();
			
			//To pass data
			String[][] data = new String[rowcount][columnCount];  
			
			//Get into row
			for(int i=1; i<=rowcount;i++) {
				XSSFRow row = sheet.getRow(i);
				
			//Get into cell
			for(int j =0;j<columnCount;j++) {
				XSSFCell cell = row.getCell(j);
				
			//read the data from cell
				
				data[i-1][j] = cell.getStringCellValue(); 
			
				System.out.println(cell.getStringCellValue());
			
			}
			}
			
			
		

	}

}
