package testLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class Today {
	
	
	
	//getwindowhandle and getwindowhandles()
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
	driver.get("https://opensource-demo.orangehrmlive.com");
	String parentWindowID=driver.getWindowHandle();
	driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
	driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
	driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
	driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
	
	Thread.sleep(1000);
	Set<String> wnames=driver.getWindowHandles();
	List<String> wlist=new ArrayList<String>(wnames);
	
	for(String s:wlist) {
		String title=driver.switchTo().window(s).getTitle();
		System.out.println(title);
	}
	
	Iterator it=wnames.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	driver.quit();
       }

}
