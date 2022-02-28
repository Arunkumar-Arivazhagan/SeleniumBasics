package listerners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(listerners.TestNGListeners.class)
public class TestNGListernersDemo {
	
	@Test
	public void test1()
	{
		System.out.println("This is test1");
	}
	
	@Test
	public void test2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		WebElement testBox = driver.findElement(By.name("abc"));
		testBox.sendKeys("Automation");
	}
	
	@Test
	public void test3()
	{
		System.out.println("This is test3");
		throw new SkipException("This is skipped");
	}
	
	@Test
	public void test4()
	{
		System.out.println("This is test4");
		Assert.assertTrue(false); //to fail a testcase
	}

}
