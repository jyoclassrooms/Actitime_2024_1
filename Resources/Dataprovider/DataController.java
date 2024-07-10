package Dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataController
{
	static File f;
	static FileInputStream fi;
	static Workbook wb;
	static Sheet sh;
	static Cell c;
	static FileOutputStream fo;
	
	
	public Object[][] get_data(String xl,String sheet) throws IOException
	{
		f=new File("./Resources/TestData/"+xl+".xlsx");
		fi=new FileInputStream(f);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(sheet);

		Object[][] obj=new Object[sh.getRow(0).getLastCellNum()][sh.getRow(0).getLastCellNum()];
		for(int i=0;i<=sh.getLastRowNum()-1;i++)
		{
			for(int j=0;j<=sh.getRow(0).getLastCellNum()-1;j++)
			{
				obj[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
						
			}			
		}
		
		return obj;
	}
	
	
}
