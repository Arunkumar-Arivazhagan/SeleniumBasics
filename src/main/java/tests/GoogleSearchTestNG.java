package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchTestNG {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	private void googleSearch() throws InterruptedException {
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("http://google.com");
		
		searchPageObj.setTextInSearchBox("Automation");
		
		Thread.sleep(2000);
		
		searchPageObj.clickSearchButton();
		
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}

}
