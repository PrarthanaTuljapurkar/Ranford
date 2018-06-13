package com.pagelibrary.com.Ranford;

//import java.sql.Driver;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseClass;


public class Admin extends BaseClass
{
	public static WebElement Branches_button(WebDriver driver)
	{
		return driver.findElement(getlocator("branches_xpath"));
	}
	/*public static WebElement Roles_button(WebDriver driver)
	{
		driver.findElement
	}
	public static WebElement Users_button(WebDriver driver)
	{
		driver.findElement(By.xpath("//img[contains(@src,'Users')]"));
	}
	public static WebElement Employees_button(WebDriver driver)
	{
		driver.findElement(By.xpath("//img[contains(@src,'emp')]"));
	}*/
	
	


}
