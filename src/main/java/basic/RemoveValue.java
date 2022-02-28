package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveValue {

	public static void main(String[] args) throws InterruptedException {

		//SetupDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//settingUp the browser
		driver.get("https://www.facebook.com/");
		//entering value	
		driver.findElement(By.id("email")).sendKeys("Arun");
		Thread.sleep(2000);

		String value = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println("Value present inside the text box is : "+value);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("againEnteredArun");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		//this line will actually delete the value if there is no space in the text entered
		// if there is a space between two words in the username field, we have to use the below lines of code
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a") ; 
		driver.findElement(By.id("email")).sendKeys(Keys.DELETE); 
		Thread.sleep(2000);

	}

}
