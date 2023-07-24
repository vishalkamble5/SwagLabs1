package Cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Cart 
{
  @FindBy(xpath="//button[text()='Checkout']")private WebElement Checkout;
  @FindBy(xpath="//button[text()='Remove']")private WebElement Remove;
  @FindBy(xpath="//button[text()='Continue Shopping']")private WebElement Shopping;
  @FindBy(xpath="//div[text()='Sauce Labs Backpack']")private WebElement Product;
  
  public Page_Cart (WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  
  public void clickCheckOut()
  {
	  Checkout.click();
  }
  public void clickOnRemove()
  {
	  Remove.click();
  }
  public void clickOnShopping()
  {
	  Shopping.click();
  }
  public String getText()
  {
	  String text = Product.getText();
	  return text;
  }
}
