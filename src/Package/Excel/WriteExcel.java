package Package.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\ExcelData.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fin);
		XSSFSheet ws=wb.getSheet("sheet1");
		
		XSSFRow r = ws.getRow(0);
		XSSFCell c=r.getCell(1);
		c.setCellValue("Updated");
		
		r=ws.getRow(1);
		c= r.createCell(3);
		c.setCellValue("NewInput");
		
		r=ws.createRow(3);
		c=r.createCell(0);
		c.setCellValue("NewRow");
		
		FileOutputStream fout= new FileOutputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\ExcelDataUpdate.xlsx");
		wb.write(fout);
		
				
		
		
	}

}
