package LibraryFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class 
{
     int TCID;

	public static String getTD(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
     {
    	FileInputStream file = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\SwagLabs1\\TestData\\Datasheet.xlsx");
    	Sheet sh= WorkbookFactory.create(file).getSheet("Sheet6");
    	String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
    	return value;
     }
     
     public static String getPFData(String key) throws IOException
     {
    	 FileInputStream file = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\SwagLabs1\\PropertyFile.properties"); 
    	 Properties p = new Properties();
    	 p.load(file);
    	 
    	String value1=p.getProperty(key);
		return value1;
     }
     
     public static void captureSS(WebDriver driver, int TCID) throws IOException
     {
    	File  src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File dest = new File("C:\\Users\\Hp\\eclipse-workspace\\SwagLabs1\\Screenshot\\"+TCID+".jpg");
    	FileHandler.copy(src, dest);
     }
}
