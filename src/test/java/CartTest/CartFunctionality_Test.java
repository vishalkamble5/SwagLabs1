package CartTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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

public class CartFunctionality_Test extends Base_Class
{
	PageClass_Login Login;
	Page_Home Home;
	Page_Cart Cart;
	Page_Menu Menu;
	 @BeforeClass
		public void openBrowser() throws IOException
	   {
		    initializeBrowser();
		  
		    Login = new PageClass_Login(driver);
			Home = new Page_Home(driver);
			Menu = new Page_Menu(driver);
			Cart = new Page_Cart(driver);
	    }
	   @BeforeMethod
	   public void loginToApp() throws IOException, InterruptedException
	   {
		  Login.inpEnterUserID(Utility_Class.getPFData("Username"));
	      Login.inpEnterPassword(Utility_Class.getPFData("Password"));
	      Login.clickOnSubmit();
	          Thread.sleep(2000);
	      Home.clickOnCart1();
	      Home.clickOnContainer();
	   }
	   
	   @Test
	   public void varifyCartText() throws EncryptedDocumentException, IOException
	   {
		   String actText=Cart.getText();
		   System.out.println(actText);
		   String expText=Utility_Class.getTD(0, 3);
		   Assert.assertEquals(actText, expText,"failed:Both results are different");
	  }
	   @AfterMethod
	   public void logOutApp() throws InterruptedException
	   {
		  Thread.sleep(2000);
		  Home.clickOnMenu();
		  Menu.clickOnLogout();
	   }
	   @AfterClass
	   public void closeBrowser() throws InterruptedException
	   {
		   Thread.sleep(2000);
		   driver.close();
	   }
}
