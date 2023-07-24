package LoginTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Cart.Page_Cart;
import Home.Page_Home;
import LibraryFile.Base_Class;
import LibraryFile.Utility_Class;
import Login.PageClass_Login;
import Menu.Page_Menu;
import Payment.Page_Payment;

public class SwabLabs_Login extends Base_Class
{
	
	PageClass_Login Login;
	@BeforeClass
	public void openBrowser() throws IOException
    {
		initializeBrowser();
		Login = new PageClass_Login(driver);
//		Page_Home Home = new Page_Home(driver);
//		Page_Menu Menu = new Page_Menu(driver);
//		Page_Payment Payment = new Page_Payment(driver);
//		Page_Cart Cart = new Page_Cart(driver);
    	
    }
	
	@Test
	public void varifyText() throws EncryptedDocumentException, IOException
    {
		String actText=Login.getText();
    	String expText=Utility_Class.getTD(0, 5);
    	Assert.assertEquals(actText, expText,"Failed:Both results are different");
    }
	
	@AfterClass
	public void closeBrowser()
    {
    	driver.close();
    }
}
