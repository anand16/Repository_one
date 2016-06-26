package Package.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelDropdownlist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFRow r=null;
		XSSFCell c=null;
FirefoxDriver driver= new FirefoxDriver();
driver.get("http://newtours.demoaut.com");
driver.findElement(By.linkText("REGISTER")).click();

FileInputStream fin= new FileInputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\DDLWrite.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fin);
XSSFSheet ws=wb.getSheet("Sheet1");
System.out.println("Hello");


WebElement ddlist= driver.findElement(By.name("country"));
List<WebElement> ctrys=ddlist.findElements(By.tagName("option"));
for(int i=0;i<ctrys.size();i++)
{
String CountryName=ctrys.get(i).getText();
ctrys.get(i).click();

if(ctrys.get(i).isSelected())
{
 r= ws.createRow(i);
 c= r.createCell(0);
c.setCellValue(CountryName);

c=r.createCell(1);
c.setCellValue("Pass");
}

else
{
	c.setCellValue("Fail");

}


}

FileOutputStream fout= new FileOutputStream("C:\\Users\\anand\\Desktop\\DoubleClick\\DDLWrite.xlsx");
wb.write(fout);


	}

}
