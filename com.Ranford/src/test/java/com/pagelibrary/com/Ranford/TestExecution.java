package com.pagelibrary.com.Ranford;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Excel.excel_utility;

public class TestExecution extends Repository{
	@Parameters({"browser"})
    @BeforeTest
	public void verifyLaunch(String browser)
	{
		launch(browser);
	}
	@Test(priority=1)
	public void verifylogin()
	{
		login();
	}
	@Test(priority=2)
	public void newBranch()
	{
	
		click_branch();
	
	}
	
	/*@Test(priority=3, dataProvider="branch")
	public void createNewBranch(String bname, String address, String zipcode, String country, String state, String city)
	{
	
		createBranch(bname,address,zipcode,country,state,city);		
	}
	
	@DataProvider(name="branch")
	public Object[][] verify_excelContent() throws IOException
	{
		return  excelcontent("Excelfile.xls", "Sheet1");
		
	}*/
	
	@Test(priority=3)
	public void verify_content() throws IOException
	{
		excel_utility.excelConnection("Excelfile.xls", "Sheet1");
		
		excel_utility.outputexcelconnection("Excelfile.xls", "output.xls", "Sheet1");
		
		int j=excel_utility.ccount();
		
		for(int i=1;i<excel_utility.rcount();i++)
		{
			//String bname=Excel_class.readdata(0, i);
			createBranch(excel_utility.readdata(0, i), excel_utility.readdata(1, i), excel_utility.readdata(2, i), excel_utility.readdata(3, i), excel_utility.readdata(4, i), excel_utility.readdata(5, i));
			
			String txt = driver.switchTo().alert().getText();
			
			driver.switchTo().alert().accept();
			
			if(txt.contains("created Sucessfully"))
			{
				excel_utility.writedata(j++, i, "Record created:Displayed:"+txt);
				j--;
			}
			else if(txt.contains("already Exist"))
			{
				excel_utility.writedata(j++, i, "Record exists:Displayed:"+txt);
				j--;
			}
			else
			{
				excel_utility.writedata(j++, i, "alert is n/a");
				j--;
			}
			
			
			
		}
		excel_utility.saveworkbook();
	}

}
 
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	

	
