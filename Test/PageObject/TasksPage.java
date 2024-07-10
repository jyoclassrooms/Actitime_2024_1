package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage 
{
	 WebDriver driver;
	  
	  @FindBy(xpath = "//a[normalize-space()='Projects & Customers']")
	  private WebElement project_customer;
	  
	  @FindBy(xpath = "//input[@value='Create New Customer']")
	  private WebElement create_new_customer;
	  
	  @FindBy(name = "name")
	  private WebElement name;
	  
	  @FindBy (name="description")
	  private WebElement description;
	  
	  @FindBy (name="createCustomerSubmit")
	  private WebElement create_cust_btn;
	  
	  
	  public WebElement getname()
	  {
		  return name;
	  }
	  
	  public WebElement getdescription()
	  {
		  return description;
	  }
	  
	  public WebElement getcreatecustomer_btn()
	  {
		  return create_cust_btn;
	  }
	  
	  public WebElement getproject_customer()
	  {
		  return project_customer;
	  }
	  
	  public WebElement get_create_new_customer()
	  {
		  return create_new_customer;
	  }
	  
	  public TasksPage(WebDriver driver) 
	  {
		this.driver=driver;   
		PageFactory.initElements(driver, this);
	  }
	
	
}
