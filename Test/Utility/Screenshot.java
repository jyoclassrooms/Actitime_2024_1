package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import Base.WebBase;

public class Screenshot
{ 
	TakesScreenshot tk;
	File src,dest;
	
  public void getScreenshot(String name) throws IOException
   {
	   tk=(TakesScreenshot)WebBase.driver;
	   src= tk.getScreenshotAs(OutputType.FILE);
	   dest=new File("./Resources/Screenshot/"+name+".png");
	   Files.copy(src, dest);
	   
   }
	
	
}
