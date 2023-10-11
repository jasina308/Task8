import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexcelfile {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		//creating a new excel workbook
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Sheet1");//creating new sheet in excel workbook
		
		//Declaring a 2D array with object wrapper class to get the data 
		Object [][] data = { 
				{"Name","Age","Email"},
				{"John Doe",30,"john@test.com"},
				{"Jane Doe",28,"Jane@test.com"},
				{"Bob Smith",35,"jacky@example.com"},
				{"Swapnil",37,"joe@example.com"}
		};
		
		int rowCount = 0;
		for(Object[] row1 :data )
		{
			//creating first row 
			XSSFRow row = sheet.createRow(rowCount++);
			
			int columnCount =0;
			// writing data to first cell
			for(Object col : row1)
			{
				XSSFCell cell = row.createCell(columnCount++);
				if(col instanceof String) {
					cell.setCellValue((String) col);
				} else if (col instanceof Integer) {
					cell.setCellValue((Integer)col);
				}
				
			}
			
		}
		//Try block to throw exception if file not found
		try(FileOutputStream output = new FileOutputStream("Newexcel.xlsx"))
		{
			book.write(output);
			
		}

	}

	}


