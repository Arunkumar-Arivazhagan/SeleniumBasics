package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchTest1 {

	public static void main(String[] args) throws InterruptedException {
		
	googleSearch();	

	}

	private static void googleSearch() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("http://google.com");
		
		searchPageObj.setTextInSearchBox("Automation");
		
		Thread.sleep(2000);
		
		searchPageObj.clickSearchButton();
		
	}

}
