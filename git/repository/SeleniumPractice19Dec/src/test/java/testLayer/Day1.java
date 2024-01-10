package testLayer;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import screenShot.screenShotCapture;

public class Day1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//wait event
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		driver.get("https://www.amazon.ca/");
		boolean logo=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		System.out.println("logo displayed is  "+logo);
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Last Minute Deals")).click();
		
		
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	FileUtils.copyFile(srcfile, new File("C:\\Users\\mohan\\eclipse-workspace\\SeleniumPractice19Dec\\src\\test\\java\\screenShot\\lastdeals.jpg"));
		System.out.println("screenshot captured");
		 
		
		
		driver.quit();

	}

}
