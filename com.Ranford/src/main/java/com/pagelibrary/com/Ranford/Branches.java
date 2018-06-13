package com.pagelibrary.com.Ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class Branches extends BaseClass
{
	public static WebElement Newbranch_button(WebDriver driver)
	{
		return driver.findElement(getlocator("newBranch_id"));
		
	}

	public static WebElement Search_button(WebDriver driver)
	{
		return driver.findElement(getlocator("search_id"));
		
	}
	private static String load2(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static WebElement clear_btn(WebDriver driver)
	{
		return driver.findElement(getlocator("clear_id"));
	}
	public static WebElement Branchname_txtbox(WebDriver driver)
	{
		return driver.findElement(getlocator("Branchname_id"));
	}
	public static WebElement Adress1_txtbox(WebDriver driver) 
	{
		return driver.findElement(getlocator("Address1_id"));
	
		
	}
	
		public static WebElement Adress2_txtbox(WebDriver driver)
		{
		return driver.findElement(getlocator("Adress2_id"));
	}
		public static WebElement Adress3_txtbox(WebDriver driver)
		{
			return driver.findElement(getlocator("Address3_id"));
		}
			public static WebElement Area_textbox(WebDriver driver)
			{
				return driver.findElement(getlocator("Area_id"));
			}
	public static WebElement Zipcode_txtbox(WebDriver driver)
	{
		return driver.findElement(getlocator("Zip_Code_id"));
	}
		public static WebElement Country_id(WebDriver driver)
		{
			return driver.findElement(getlocator("Country_id"));
		}
		public static WebElement State_id(WebDriver driver)
		{
			return driver.findElement(getlocator("State_id"));
		}
		public static WebElement City_id(WebDriver driver)
		{
			return driver.findElement(getlocator("City_id"));
		}

	public static WebElement Submit_button(WebDriver driver)
	{
		return driver.findElement(getlocator("Submit_button"));
	}
	public static WebElement Reset_button(WebDriver driver)
	{
		return driver.findElement(getlocator("Insert_button"));
	}
	public static WebElement Cancel_button(WebDriver driver) 
	{
		return driver.findElement(getlocator("Btn_cancel"));
	}
	public static void Newroles_button(WebDriver driver)
	{
		driver.findElement(By.id(load2("")));
	}
	public static void Rolename_txtbox(WebDriver driver)
	{
		driver.findElement(By.name(""));
	}
	public static void Roledesc_txtbox(WebDriver driver)
	{
		driver.findElement(By.name(""));
	}
	public static void Submit_button1(WebDriver driver)
	{
		driver.findElement(By.name(""));
	}
	public static void Reset_button1(WebDriver driver)
	{
		driver.findElement(By.name(""));
	}
	public static void Cancel_button1(WebDriver driver)
	{
		driver.findElement(By.name(""));
	}
	public static void Customername_txtbox(WebDriver driver)
	{
		driver.findElement(By.name(""));
	}
	public static void Username_txtbox(WebDriver driver)
	{
		driver.findElement(By.name(""));
	}
		public static void Loginpassword_txtbox(WebDriver driver)
		{
			driver.findElement(By.name(""));
		}
		public static void Transactionpassword_txtbox(WebDriver driver)
		{
			driver.findElement(By.name(""));
		}
		public static void Submit_button2(WebDriver driver)
		{
			driver.findElement(By.name(""));
		}
		public static void Reset_button2(WebDriver driver)
		{
			driver.findElement(By.name(""));
		}
		public static void Cancel_button2(WebDriver driver)
		{
			driver.findElement(By.name(""));
		}
		public static void Newemployer_Btnnew(WebDriver driver)
		{
			driver.findElement(By.name(""));
		}
		public static void Employername_txtUname(WebDriver driver)
		{
			driver.findElement(By.name(""));
		}
		public static void Loginpassword_txtLpwd(WebDriver driver)
		{
			driver.findElement(By.name(""));
		}
		public static void Submit_BtnSubmit(WebDriver driver)
		{
			driver.findElement(By.name(""));
		}
		public static void Reset_btnreset(WebDriver driver)
		{
			driver.findElement(By.name(""));
		}
		public static void Cancel_btnCancel(WebDriver driver)
		{
			driver.findElement(By.name(""));
		}

		/*public static WebElement address1_TextBox(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}
		*/
		}
	

	
	
	

