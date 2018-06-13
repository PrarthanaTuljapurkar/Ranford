package com.pagelibrary.com.Ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Employees {
	public static WebElement Employee_button(WebDriver driver)
	{
		return driver.findElement(By.xpath(load2("\"//img[contains(@src,'emp')]\"")));
	}
	public static WebElement Newemployer_Btnnew(WebDriver driver)
	{
		return driver.findElement(By.id(load2("BtnNew")));
	}
	private static String load2(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public static WebElement Employername_txtUname(WebDriver driver)
	{
		return driver.findElement(By.id(load2("txtUname")));
	}
	public static WebElement Loginpassword_txtLpwd(WebDriver driver)
	{
		return driver.findElement(By.name("txtLpwd"));
	}
	public static WebElement Submit_BtnSubmit(WebDriver driver)
	{
		return driver.findElement(By.id(load2("BtnSubmit")));
	}
	public static WebElement Reset_btnreset(WebDriver driver)
	{
		return driver.findElement(By.id(load2("btnreset")));
	}
	public static WebElement Cancel_btnCancel(WebDriver driver)
	{
		return driver.findElement(By.id(load2("btnCancel")));
	}
	
	}









