package testLayer;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

public class Child {

	@Test
public  void test1() throws IOException {
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.ca/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
	
	List<WebElement> llist=driver.findElements(By.tagName("a"));
	System.out.println(llist.size());
	List<String> links=new ArrayList<String>();
	
	for(WebElement e:llist) {
		String s=e.getAttribute("href");
		if(s==null ||s.isEmpty()) {
			System.out.println(s+"  -----blank url");
		}
		else if(!s.startsWith("https")) {
			System.out.println(s+"  ____skip this");
	         }
		
		else {
		URL url;
		try {
			url = new URL(s);
			HttpURLConnection huc=(HttpURLConnection) url.openConnection();
			huc.connect();
			if(huc.getResponseCode()>=400) {
				System.out.println(url+"    **************broken"+huc.getResponseMessage());
				
				
			}
			else {
				System.out.println(url+"    **********not broken"+huc.getResponseMessage());
			}
		} 
		catch (IOException e1) {    
			
			e1.printStackTrace();
		}
		
		
	
	
	
	}
	
	}
	driver.quit();
	}
}


