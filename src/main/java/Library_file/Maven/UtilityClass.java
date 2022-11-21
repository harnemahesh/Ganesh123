package Library_file.Maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class UtilityClass
{
   @Test
   public static String Credential(String Key) throws IOException
   {
	FileInputStream file=new FileInputStream("C:\\Users\\Roshan\\eclipse-workspace\\MAHESH_JAVA_SELENIUM_MAVEN_TestNG\\Maven\\Amazon.properties");
	
	Properties pro=new Properties();
	
	           pro.load(file);
	           
	          String Value1=pro.getProperty(Key);
	           
	          return Value1;
	           
  }
   
   @Test
   public static String Excelsheet(int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException
   {
	 FileInputStream file=new FileInputStream("C:\\Users\\Roshan\\eclipse-workspace\\MAHESH_JAVA_SELENIUM_MAVEN_TestNG\\Maven\\target\\MAHESHXL.xlsx");
	 
	Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet13");
     String	Value2=Sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
	
	      return Value2;
	
   }
   
  
   
}