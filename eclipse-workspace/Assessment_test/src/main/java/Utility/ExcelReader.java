package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class ExcelReader {
	
	public static void main(String args[]) throws Exception{
		FileInputStream file = new FileInputStream("./src/test/Resources/TestData/TestData.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		
		String First_name= st.getCell(2,1).getContents();
	System.out.println(First_name);


	
	}
	public static String getuserdata(int coulmnnumber) {
		String value=null;
		try {
		FileInputStream file = new FileInputStream("./src/test/Resources/TestData/TestData.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		
		 value= st.getCell(coulmnnumber,1).getContents();
	System.out.println(value);
	
	}
		catch(Exception e) {
		e.printStackTrace();
	}
		return value;
	}
	
	/*public Object[][] testData() throws IOException {
		String sheet_Name= "Create_User_Data";
		
		FileInputStream fileInputStream = new FileInputStream("./src/test/Resources/TestData/TestData.xls"); 
		DataFormatter formatter = new DataFormatter();
		Workbook workbook;
		Sheet worksheet;

		workbook = new HSSFWorkbook(fileInputStream); 
		worksheet = workbook.getSheet(sheet_Name);
		Row row = worksheet.getRow(0); 

		int RowNum = worksheet.getPhysicalNumberOfRows();
		int ColNum = row.getLastCellNum(); 

		Object Data[][] = new Object[RowNum - 1][ColNum]; 
 
		for (int i = 0; i < RowNum - 1; i++) 
		{
			Row cuurentrow = worksheet.getRow(i + 1);

			for (int j = 0; j < ColNum; j++) 
			{
				if (cuurentrow == null)
					Data[i][j] = "";
				else {
					HSSFCell cell = (HSSFCell) cuurentrow.getCell(j);
					if (cell == null)
						Data[i][j] = ""; 
					else {
						String value = formatter.formatCellValue(cuurentrow.getCell(j));
						Data[i][j] = value; 
					}
				}
			}
		}
		
		return Data;}*/
}
