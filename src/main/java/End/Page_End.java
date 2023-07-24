package End;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_End 
{
	 @FindBy(xpath="//h2[text()='Thank you for your order!']")private WebElement ThankYou;
	  @FindBy(xpath="//button[text()='Back Home']")private WebElement BackHome;
	 
	 
	  
	  public Page_End  (WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  
	  public String getThanksText()
	  {
		  String text=ThankYou.getText();
		  return text;
	  }
	  public void clickOnBackHome()
	  {
		 BackHome.click();
	  }
	
	 
}
