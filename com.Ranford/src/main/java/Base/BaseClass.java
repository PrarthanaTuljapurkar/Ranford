package Base;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;

public class BaseClass {
	
	
      static Properties p;
	
	public static void loadproperty()
	{
		
			try {
				System.out.println("Prarthana is great");
				File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\config.properties");
				//	File f=new File(D:\BSSW5\com.Ranford\src\main\java\configuration\config.properties)
				FileReader fr=new FileReader(f);
				
				p=new Properties();
				p.load(fr);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
			public static String config(String key)
			{
				loadproperty();
				String x = p.getProperty(key);
				return x;
				
				
			}
			
			public static void loadproperty2()
			{
				
					try {
						File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\OR.properties");
						//	File f=new File(D:\BSSW5\com.Ranford\src\main\java\configuration\config.properties)
						FileReader 
						fr=new FileReader(f);
						
						p=new Properties();
						p.load(fr);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
					public static By getlocator(String key)
					{
						loadproperty2();
						
						By loc = null;
						String elename = p.getProperty(key);
						 
						String loctype=elename.split(":")[0];
						
						String locval=elename.split(":")[1];
						
						switch(loctype)
						{
						case "id":
							
							loc=By.id(locval);
							break;
						case "name":
							
							loc=By.name(locval);
							
							break;
						case "xpath":
							
							loc=By.xpath(locval);
							
							break;						
						
							
							
							
						}
						return loc;
						
						
					}
					
	}
	
