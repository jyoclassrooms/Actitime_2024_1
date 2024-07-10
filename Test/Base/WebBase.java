package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import PageObject.Loginpage;
import PageObject.TasksPage;
import PageObject.Time_TrackPage;
import Utility.WaitUtility;

public class WebBase 
{
	public static WebDriver driver=null;
	
	@Parameters({"browser"})
	@BeforeClass
	public void launchbrowser(String browser)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		//options.addArguments("--ignore-certificate-errors");
		//options.addArguments("--disable-popup-blocking");
		options.addArguments("--incognito");
		
		
		switch(browser)
		{
		  case "chrome":
			  driver=new ChromeDriver(options);
		  break;
		 
		  case "firefox":
			  driver=new FirefoxDriver();
		  break;
		  
		  case "edge":
			  driver=new EdgeDriver();
			  break;
		  
		
		}
		
	}
	@Parameters("url")
	@BeforeMethod
	public void logintoapp(String url)
	{
		driver.get(url);
		Loginpage lg=new Loginpage(driver);
		lg.getUsername().sendKeys("admin");
		lg.getpassword().sendKeys("manager");
		lg.getLogin().click();
		
	}
	
	@AfterMethod
	public void logout()
	{
		WaitUtility utility=new WaitUtility();
		Time_TrackPage timetrack=new Time_TrackPage(driver);
		timetrack.getlogout().click();
		utility.getimplicitwait(10);
	
	}

}
