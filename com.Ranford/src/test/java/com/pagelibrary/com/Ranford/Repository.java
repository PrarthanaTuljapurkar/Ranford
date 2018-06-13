package com.pagelibrary.com.Ranford;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

import Base.BaseClass;
import Excel.excel_utility;
import Utility.Validation;



public class Repository extends BaseClass{
	
	WebDriver driver;
	
	public void launch(String browser)
	{
		if(browser.equalsIgnoreCase("Firefox")) {
			
		driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\BSSW5\\Automation\\exefiles\\chromedriver_win32_new\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(config("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	public void login()
	{
		Homepage.un_text(driver).sendKeys(config("username"));
		Homepage.pwd_text(driver).sendKeys(config("password"));
		Homepage.submit_btn(driver).click();
		if(Validation.IsTittlePresent(driver, "KEXIM BANK"))
		{
			Reporter.log("Test is passed");
		}
		else
		{
			Reporter.log("Test is failed");
		}
		
	}
	
	public void click_branch() {
		
		Admin.Branches_button(driver).click();
	}
	
	public void createBranch(String bname, String address, String zipcode, String country, String state, String city)
	{
		
		Branches.Newbranch_button(driver).click();
		Branches.Branchname_txtbox(driver).sendKeys(bname);	
		Branches.Adress1_txtbox(driver).sendKeys(address);
		Branches.Zipcode_txtbox(driver).sendKeys(zipcode);
					
		GenericPage.dropDownSelection(driver, getlocator("Country_id")).selectByVisibleText(country);
		GenericPage.dropDownSelection(driver, getlocator("State_id")).selectByVisibleText(state);
		GenericPage.dropDownSelection(driver, getlocator("City_id")).selectByVisibleText(city);
		Branches.Submit_button(driver).click();
		
		
	}
		
		
			public Object[][] excelcontent(String filename,String sheetname) throws IOException
			{
				excel_utility.excelConnection(filename, sheetname);
				int rc=excel_utility.rcount();
				int cc=excel_utility.ccount();
						String[][] data=new String[rc-1][cc];
				for(int r=1;r<rc;r++) {
					for(int c=0;c<cc;c++)
					{
						data[r-1][c]=excel_utility.readdata(c,r);
					}
				}
				return data;
			}
}

			
	
