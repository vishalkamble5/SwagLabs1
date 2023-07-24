package Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Menu 
{
	 @FindBy(xpath="(//a[text()='All Items']")private WebElement AllItems;
	 @FindBy(xpath="//a[text()='About']")private WebElement About;
	 @FindBy(xpath="//a[text()='Logout']")private WebElement Logout;
	 @FindBy(xpath="//a[text()='Reset App State']")private WebElement Reset;
	 @FindBy(xpath="//button[text()='Close Menu']")private WebElement Close;
	 
	    public Page_Menu   (WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	     
		  
		 public void clickOnItems()
		   {
		      AllItems.click();
		   }
		 public void clickOnAbout()
		   {
		      About.click();
		   }
		 public void clickOnLogout()
		   {
		      Logout.click();
		   }
		 public void clickOnReset()
		   {
		     Reset.click();
		   }
		 public void clickOnClose()
		   {
		     Close.click();
		   }
		
	}
