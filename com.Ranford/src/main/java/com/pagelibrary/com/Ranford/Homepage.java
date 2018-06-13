package com.pagelibrary.com.Ranford;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class Homepage extends BaseClass{
	
	public static WebElement un_text(WebDriver driver)
	{
		return driver.findElement(getlocator("usernameTxt"));
		
	}

	public static WebElement pwd_text(WebDriver driver)
	{
		return driver.findElement(getlocator("passwordTxt_id"));
		
	}
	//private static String(String key) {
		// TODO Auto-generated method stub
		//return null;
	
	

	public static WebElement submit_btn(WebDriver driver)
	{
		return driver.findElement(getlocator("loginBtn_name"));
	}

}
