package com.pagelibrary.com.Ranford;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;


public class GenericPage extends BaseClass{
	
	
	public static Select dropDownSelection(WebDriver driver, By prop)
	{
		System.out.println("java is simple");
		Select x = new Select(driver.findElement(prop));
		return x;	
		
	}
	
	public static Select ComparedropDownValues(WebDriver driver, By prop, String expectedVal)
	{
		Select x = new Select(driver.findElement(prop));
		
		List<WebElement> allOptions = x.getOptions();
		
		for(WebElement option:allOptions)
		{
			String actualVal = option.getText();
			
			if(actualVal.contains(expectedVal))
			{
				x.selectByVisibleText(expectedVal);
				break;
			}
		}
		return x;		
		
	}

}
