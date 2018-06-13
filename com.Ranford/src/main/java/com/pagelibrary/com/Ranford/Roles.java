package com.pagelibrary.com.Ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Roles {
	public static WebElement Roles_button(WebDriver driver)
	{
		return driver.findElement(By.xpath("//img[contains(@src,'Roles')]"));
	}
	public static WebElement Newroles_button(WebDriver driver)
	{
		return driver.findElement(By.id(load2("btnRoles")));
	}
	
	private static String load2(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public static WebElement Rolename_txtbox(WebDriver driver)
	{
		return driver.findElement(By.id(load2("txtRname")));
	}
	public static WebElement Roledesc_txtbox(WebDriver driver)
	{
		return driver.findElement(By.id(load2("txtRDesc")));
	}
	public static WebElement Submit_button1(WebDriver driver)
	{
		return driver.findElement(By.id(load2("btninsert")));
	}
	public static WebElement Reset_button1(WebDriver driver)
	{
		return driver.findElement(By.id(load2("Btn_Reset")));
	}
	public static WebElement Cancel_button1(WebDriver driver)
	{
		return driver.findElement(By.id(load2("Btn_cancel")));
}

}