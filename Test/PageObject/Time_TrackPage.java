package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Time_TrackPage
{
  WebDriver driver;
  
  @FindBy(xpath = "//a[@class='content tasks']//img[@class='sizer']")
  private WebElement task;
  
  @FindBy(className = "logout")
  private WebElement logout;
  
  public WebElement getlogout()
  {
	  return logout;
  }
  
  public WebElement gettask()
  {
	  return task;
  }
  
  public Time_TrackPage(WebDriver driver) 
  {
	this.driver=driver;   
	PageFactory.initElements(driver, this);
  }
	
	
}
