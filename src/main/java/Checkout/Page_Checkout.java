package Checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Checkout 
{
   @FindBy(xpath="//input[@id='first-name']")private WebElement Fname;
   @FindBy(xpath="//input[@id='last-name']")private WebElement Lname;
   @FindBy(xpath="//input[@id='postal-code']")private WebElement PCode;
   @FindBy(xpath="//input[@id='continue']")private WebElement Continue;
   @FindBy(xpath="//button[text()='Cancel']")private WebElement Cancel;
 
   
   public Page_Checkout(WebDriver driver)
   {
	  PageFactory.initElements(driver, this); 
   }
   
   public void inpEnterFirstName(String FN)
   {
	   Fname.sendKeys(FN);  //"Ramesh"
   }
   public void inpEnterLastName(String LN)
   {
	   Lname.sendKeys(LN);   //"Sharma"
   }
   public void inpEnterPostalCode(String PC)
   {
	   PCode.sendKeys(PC);   //"442001"
   }
   public void clickContinueButton()
   {
	   Continue.click();
   }
   public void clickCancelButton()
   {
	   Cancel.click();
   }
   
}
