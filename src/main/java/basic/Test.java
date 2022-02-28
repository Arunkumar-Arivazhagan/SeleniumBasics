package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.google.com");
		
		driver.navigate().to("http://www.google.com");
		
		Thread.sleep(2000);
		
		//driver.get("http://www.facebook.com");
		
		driver.navigate().to("http://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.quit();

	}

}
