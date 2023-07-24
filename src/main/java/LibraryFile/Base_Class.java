package LibraryFile;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base_Class 
{
   public WebDriver driver; 
	public void initializeBrowser() throws IOException
     {
//    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\SwagLabs1\\Browser\\chromedriver.exe");
    	 
       driver = new ChromeDriver();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.manage().window().maximize();
    	
    	driver.get(Utility_Class.getPFData("URL"));
    	 
    	
     }
}
