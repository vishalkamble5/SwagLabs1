package Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Home 
{
	
	 @FindBy(xpath="(//button[text()='Add to cart'])[1]")private WebElement Cart1;
	 @FindBy(xpath="(//button[text()='Add to cart'])[2]")private WebElement Cart2;
	 @FindBy(xpath="(//button[text()='Add to cart'])[3]")private WebElement Cart3;
	 @FindBy(xpath="(//button[text()='Add to cart'])[4]")private WebElement Cart4;
	 @FindBy(xpath="(//button[text()='Add to cart'])[5]")private WebElement Cart5;
	 @FindBy(xpath="(//button[text()='Add to cart'])[6]")private WebElement Cart6;
	 @FindBy(xpath="//div[@id='shopping_cart_container']")private WebElement Container;	
	 @FindBy(xpath="//span[text()='Products']")private WebElement Products;
	 @FindBy(xpath="//div[@class='bm-burger-button']")private WebElement Menu;
	 
	    public Page_Home  (WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	     
		  
		 public void clickOnCart1()
		   {
		      Cart1.click();
		   }
		 public void clickOnCart2()
		   {
		      Cart2.click();
		   }
		 public void clickOnCart3()
		   {
		      Cart3.click();
		   }
		 public void clickOnCart4()
		   {
		      Cart4.click();
		   }
		 public void clickOnCart5()
		   {
		      Cart5.click();
		   }
		 public void clickOnCart6()
		   {
		      Cart6.click();
		   }
	
		 public void clickOnContainer()
		   {
		      Container.click();
		   }
		 public String getText()
		   {
		     String text = Products.getText();
		     return text;
		   }
		 public void clickOnMenu()
		   {
		      Menu.click();
		   }
		  
		   
      }

