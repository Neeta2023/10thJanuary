package testLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;


public class Parent {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		
		Process batch=Runtime.getRuntime().exec("C:\\Users\\mohan\\eclipse-workspace\\SeleniumPractice19Dec\\test-output\\testng-failed.xml");
		batch.waitFor();
		
		
	}
	
	@Test(groups="smoke")
	public void test1() {
		
		System.out.println("test1 method");
		Assert.assertEquals("neeta", "rout");
	}
	
	@Test(groups="smoke")
	@Parameters("name")
	public void test2(String name) {
		
		System.out.println("test2 method"+ name);
	}
	
	@Test(groups="regression")
	public void test3() {
		
		System.out.println("test3 method");
	}
	
	@Test(groups="smoke")
	public void test4() throws AWTException {
		
		System.out.println("test4 method");
		Actions action=new Actions(driver);
		action.keyDown(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		
		Robot robo=new Robot();
		
		WebDriverWait wait=new WebDriverWait(driver, null);
		
		
	}

}
