package Dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class CustomerDP
{

	@DataProvider(name = "createcustomer")
	public Object[][] createcust_dp() throws IOException
	{
		
		
		return new DataController().get_data("CreateCustomer", "customer");
	}
	
	
}
