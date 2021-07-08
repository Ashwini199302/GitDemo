package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Snapshots {

	
	
	public static void Takingsanpshots(WebDriver driver,String snapshotsname) {
		
		
	   try {
		   TakesScreenshot TS= (TakesScreenshot)driver;
		    File Source=TS.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Source, new File("./Screenshots/"+snapshotsname+".png"));
		
		System.out.println("ScreenShot taken");
	} 
	   catch (IOException e) {
		System.out.println("Exception throwing while taking snapshots"+e);
		e.printStackTrace();
	}
	}

	
}
