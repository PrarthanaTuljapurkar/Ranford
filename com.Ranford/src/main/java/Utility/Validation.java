package Utility;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validation {
	
	
	public static boolean   IsTextPresent(WebDriver driver,String exp)
	{
		return driver.findElement(By.tagName("tbody")).getText().contains(exp);
	}
	public static boolean   IsTittlePresent(WebDriver driver,String exp)
	{
		return driver.getTitle().contains(exp);
	}

	public static String CaptureScreenShot(String functionalityName)
	{
		try{
			Robot robotClassObject = new Robot();
			Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage tmp = robotClassObject.createScreenCapture(screenSize); 
            String path=System.getProperty("user.dir")+"/ScreenShots/"+functionalityName+System.currentTimeMillis()+".png";
            ImageIO.write(tmp, "png",new File(path)); 
            return path;
            
		}catch(Exception e)
		{
			System.out.println("Some exception occured." + e.getMessage());
			return "";
		}
}
}
