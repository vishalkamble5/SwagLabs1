package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageClass_Login 
{
    @FindBy(xpath="//div[text()='Swag Labs']")private WebElement SwagLab;
    @FindBy(xpath="//input[@placeholder='Username']")private WebElement UserID;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement PWD;	
	@FindBy(xpath="//input[@type='submit']")private WebElement SubmitBtn;
	
     public PageClass_Login(WebDriver driver)
      {
    	PageFactory.initElements(driver, this);
       }
     
	 public String getText()
	   {
	      String text = SwagLab.getText();
	      return text;
	   }
	 public void inpEnterUserID(String userID)
	   {
	       UserID.sendKeys(userID);  //"standard_user"
	   }

	 public void inpEnterPassword(String password)
	   {
	       PWD.sendKeys(password);    //"secret_sauce"
	   }
	 public void clickOnSubmit()
	   {
	       SubmitBtn.click();
	   }
	       

   }

