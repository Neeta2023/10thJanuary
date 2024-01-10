package screenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class screenShotCapture {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();	
		driver.get("https://www.amazon.ca/");
   
			}
	
	
	  public static void CapturescreenShot(String filename) throws IOException {
		  File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	
	    	FileUtils.copyFile(srcfile, new File("C:\\Users\\mohan\\eclipse-workspace\\SeleniumPractice19Dec\\src\\test\\java\\screenShot"+filename+".jpg"));
		  
		  
	  }
   
    
}
