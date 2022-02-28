package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.google.com");
		
		Thread.sleep(2000);
		
		//WebElement testBox = driver.findElement(By.name("q"));
		
		//WebElement searchButton = driver.findElement(By.name("btnK"));
		
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'ಕನ್ನಡ')]"));
		
		link.click();
		
		//testBox.sendKeys("Automation");
		
		//searchButton.click();

	}

}
