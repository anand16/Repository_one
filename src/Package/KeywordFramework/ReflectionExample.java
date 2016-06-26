package Package.KeywordFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReflectionExample {

	static KeyWords keys=new KeyWords();
	static Method[]  mymethods=keys.getClass().getMethods();
	
	public static void main(String[] args) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		FileInputStream f=new FileInputStream("C:\\Users\\anand\\Desktop\\Documents\\LoginKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rowCount=ws.getLastRowNum();
		System.out.println(rowCount);
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow r=ws.getRow(i);
			String runMode=r.getCell(4).getStringCellValue();
			if(runMode.equals("Y"))
			{
				String keywrd=r.getCell(3).getStringCellValue();
				System.out.println(keywrd);
				executeMethods(keywrd);
			}
		}
		
		
		

	

}

	private static void executeMethods(String keywrd) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		for(int i=0;i<mymethods.length;i++)
		{
			
			if(keywrd.equals(mymethods[i].getName()))
			{
				mymethods[i].invoke(keys);
			}
		}
	}

}