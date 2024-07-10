package customer;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.util.TimeUtils.Task;

import Base.WebBase;
import Dataprovider.CustomerDP;
import PageObject.TasksPage;
import PageObject.Time_TrackPage;
import Utility.Screenshot;
import Utility.WaitUtility;

public class CreateCustomer  extends WebBase
{

	@Test(dataProvider ="createcustomer" ,dataProviderClass =CustomerDP.class)
	public void createcustomer(String custname,String custdescription) throws IOException
	{
		WaitUtility utility=new WaitUtility();
		Screenshot sh=new Screenshot();
		Time_TrackPage time_track=new Time_TrackPage(driver);
		time_track.gettask().click();
		TasksPage task=new TasksPage(driver);
		task.getproject_customer().click();
		utility.getexplicitwaitforelement(10,task.get_create_new_customer() );
		task.get_create_new_customer().click();
		utility.getexplicitwaitforelement(10,task.getname());
		task.getname().sendKeys(custname);
		task.getdescription().sendKeys(custdescription);
		task.getcreatecustomer_btn().click();
		sh.getScreenshot(custname);
		utility.getimplicitwait(10);
				
	}
	
	
}
