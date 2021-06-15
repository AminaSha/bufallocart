package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot {
	WebDriver driver;
	public void screenshott(WebDriver driver,String tname) throws IOException 
	  {
		  TakesScreenshot scrShot = ((TakesScreenshot)driver);
	      File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	      File DestFile=new File(System.getProperty("user.dir")+ "/Screenshot/"+tname+".jpg");
	      System.out.println(DestFile);
	      Files.copy(SrcFile, DestFile);
	      System.out.println("Screenshot taken");
	     
	  }
}
