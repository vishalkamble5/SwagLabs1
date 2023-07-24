package Payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Payment 
{
	  @FindBy(xpath="//div[text()='Sauce Labs Backpack']")private WebElement Product;
	  @FindBy(xpath="//div[text()='Price Total']")private WebElement TPrice;
	  @FindBy(xpath="//div[text()='Item total: $']")private WebElement TItem;
	  @FindBy(xpath="//button[text()='Finish']")private WebElement Finish;
	  @FindBy(xpath="//button[@id='cancel']")private WebElement Cancel;
	 
	  
	  public Page_Payment  (WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public String getProductText()
	  {
		  String text=Product.getText();
		  return text;
	  }
	  
	  public String getPriceText()
	  {
		  String text1=TPrice.getText();
		  return text1;
	  }
	  public String getTotalItemText()
	  {
		  String text2=TItem.getText();
		  return text2;
	  }
	  public void clickOnFinish()
	  {
		 Finish.click();
	  }
	  public void clickOnCancelBtn()
	  {
		  Cancel.click();
	  }
	 
}
