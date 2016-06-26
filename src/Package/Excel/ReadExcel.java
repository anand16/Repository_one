package Package.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ReadExcel {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		FileInputStream fin=new FileInputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\ExcelData.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fin);
		XSSFSheet ws=wb.getSheet("sheet1");
		
		int rowscount=ws.getLastRowNum();
		for(int i=0;i<=rowscount;i++)
		{
			XSSFRow r= ws.getRow(i);
			
			int colcount=r.getLastCellNum();
			for(int j=0;j<colcount;j++)
			{
				XSSFCell c= r.getCell(j);
				System.out.println(c.getStringCellValue()+ "");
				
			}
			
			System.out.println();
			
		}
		
		
	}

}
