package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");

		//driver.findElement(By.name("q")).sendKeys("Automation");
		GoogleSearchPage.testbox_search(driver).sendKeys("Automation");
		
		Thread.sleep(2000);
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//GoogleSearchPage.languageLink(driver).click();
		
		//driver.close();
	}
}
