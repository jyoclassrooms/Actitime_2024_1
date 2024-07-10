package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
   WebDriver driver;
   
   @FindBy(name = "username")
   private WebElement username;
	
   @FindBy (name="pwd")
   private WebElement password;
	
   
   @FindBy(id="LoginButton")
   private WebElement login;
   
   public WebElement getUsername()
   {
	   return username;
   }
   
   public WebElement getpassword()
   {
	   return password;
   }
   
   public WebElement getLogin()
   {
	   return login;
   }
   
   public Loginpage(WebDriver driver) 
   {
	this.driver=driver;   
	PageFactory.initElements(driver, this);
   }
   
   
	
}
