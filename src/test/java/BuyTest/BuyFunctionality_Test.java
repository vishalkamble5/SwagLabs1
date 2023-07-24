package BuyTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Cart.Page_Cart;
import Checkout.Page_Checkout;
import Home.Page_Home;
import LibraryFile.Base_Class;
import LibraryFile.Utility_Class;
import Login.PageClass_Login;
import Menu.Page_Menu;
import Payment.Page_Payment;

public class BuyFunctionality_Test extends Base_Class
{
	PageClass_Login Login;
	Page_Home Home;
	Page_Cart Cart;
	Page_Menu Menu;
	Page_Checkout checkout;
	Page_Payment Payment;
	
	@BeforeClass
	public void openBrowser() throws IOException
   {
	    initializeBrowser();
	  
	    Login = new PageClass_Login(driver);
		Home = new Page_Home(driver);
		Menu = new Page_Menu(driver);
		Cart = new Page_Cart(driver);
	    checkout = new Page_Checkout (driver);
	    Payment = new Page_Payment(driver);
    }
   @BeforeMethod
   public void loginToApp() throws IOException, InterruptedException
   {
	  Login.inpEnterUserID(Utility_Class.getPFData("Username"));
      Login.inpEnterPassword(Utility_Class.getPFData("Password"));
      Login.clickOnSubmit();
          Thread.sleep(2000);
      Home.clickOnCart1();
      Home.clickOnCart2();
      Home.clickOnContainer();
      Cart.clickCheckOut();
      checkout.inpEnterFirstName(Utility_Class.getTD(1, 0));
      checkout.inpEnterLastName(Utility_Class.getTD(1, 1));
      checkout.inpEnterPostalCode(Utility_Class.getTD(1, 2));
      checkout.clickContinueButton();
   }
   
   @Test
   public void varifyPaymentText() throws EncryptedDocumentException, IOException
   {
	   String actText=Payment.getPriceText();
	   System.out.println(actText);
	   String expText=Utility_Class.getTD(1, 3);
	   Assert.assertEquals(actText, expText,"failed:Both results are different");
  }
   @Test (dependsOnMethods ="varifyPaymentText")
   public void varifyPaymentText1() throws EncryptedDocumentException, IOException
   {
	   String actText=Payment.getTotalItemText();
	   System.out.println(actText);
	   String expText=Utility_Class.getTD(1, 4);
	   Assert.assertEquals(actText, expText,"failed:Both results are different");
  }
   @AfterMethod
   public void logOutApp() throws InterruptedException
   {
	  Thread.sleep(2000);
	  Payment.clickOnFinish();
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
