package Package.KeywordFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AccessKeywords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		KeyWords key=new KeyWords();
FileInputStream fin=new FileInputStream("C:\\Users\\anand\\Desktop\\Documents\\LoginKeywords.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fin);
XSSFSheet ws=wb.getSheet("Sheet1");
int rowscount=ws.getLastRowNum();
for(int i=0;i<=rowscount;i++)
{
XSSFRow r=ws.getRow(i);

String flag=r.getCell(4).getStringCellValue();
if (flag.equals("Y"))
{
	String method=r.getCell(3).getStringCellValue();
	if(method.equals("launchBrowser"))
	{
		key.launchbrowser();
		
	}
	
	else if(method.equals("navigate"))
	{
		key.navigate();
		
	}
	
	else if (method.equals("enterUsername"))
	{
		key.enterusername();
		
	}
}



}

	}

}
