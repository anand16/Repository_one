package Package.KeywordFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUsingReflection {
	KeyWords kys=new KeyWords();
	Method[]  mymethods=kys.getClass().getMethods();
	@Test
	public void loginTest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
	
	
	FileInputStream f=new FileInputStream("C:\\Users\\anand\\Desktop\\Documents\\LoginKeywords.xlsx");
	//FileInputStream fin=new FileInputStream("C:\\Users\\anand\\Desktop\\Documents\\KeywordDrivenFramework\\LoginKeywords.xlsx");
//	C:\Users\anand\Desktop\Documents\KeywordDrivenFramework
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
			String keyword=r.getCell(3).getStringCellValue();
			System.out.println(keyword);
			executeMethods(keyword);
		}
	}
			
	}
	
	public void executeMethods(String keyword) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		for(int i=0;i<mymethods.length;i++)
		{
			System.out.println(i);
			if(keyword.equals(mymethods[i].getName()))
			{
				mymethods[i].invoke(kys);
			}
		}
		// TODO Auto-generated method stub
		
	}
		}