package listerners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(listerners.TestNGListeners.class)
public class TestMultiBrowsers {

	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("Browser Nmae is: " + browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().arch64().setup();
			driver = new InternetExplorerDriver();
		}
		
	}
	
	@Test
	public void browserTest() throws InterruptedException
	{
		driver.get("http://google.com");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Test Completed");
	}
}
