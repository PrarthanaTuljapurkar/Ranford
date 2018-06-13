package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class WebTable {
	
	
	static boolean status=false;
	//public static void webTable(WebDriver driver,By prop,String operation,String id)
	public static void webTable(WebDriver driver,String operation,String id)
	{
		try {
			
			boolean flag=false;
			WebElement table=driver.findElement(By.id("DG_bankdetails"));
			
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			
			String[] pagelinks=rows.get(rows.size()-1).getText().split(" ");
			
			for(int l=1;l<pagelinks.length;l++)
			{
				
				table=driver.findElement(By.id("DG_bankdetails"));
				rows=table.findElements(By.tagName("tr"));
				
				for(WebElement r:rows)
				{
					List<WebElement> columns=r.findElements(By.tagName("td"));
					for(WebElement c:columns)
					{
						if(c.getText().matches(id))
						{
							if(operation.equalsIgnoreCase("edit"))
							{
								columns.get(columns.size()-2).findElement(By.tagName("a")).click();
								
							}
							else if(operation.equalsIgnoreCase("delete"))
							{
								columns.get(columns.size()-1).findElement(By.tagName("a")).click();
							}
							else
							{
								Reporter.log("operation is failed");
							}
							flag=true;
							break;
						}
					}
					if(flag==true)
					{
						break;
					}
				}
				
				if(flag==true)
				{
					break;
				}
				
				try {
					if(pagelinks[l].contains("...") && status==true)
					{
						driver.findElement(By.xpath("//a[text()='...'][2]")).click();
					}
					else
					{
						table.findElement(By.linkText(pagelinks[l])).click();
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(pagelinks[l].contains("..."))
				{
					status=true;
					
					webTable(driver,operation, id);
										
				}
				
			
				 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
