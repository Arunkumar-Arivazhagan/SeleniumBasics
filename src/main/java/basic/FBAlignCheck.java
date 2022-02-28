package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBAlignCheck {

	public static void main(String[] args) {
		
		//SetupDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//settingUp the browser
		driver.get("https://www.facebook.com/");
		
		//finding the elements 
		WebElement unTB = driver.findElement(By.id("email"));
		// get the y-coordinate of username field
		int username_Ycordinate = unTB.getLocation().getX();
		System.out.println(username_Ycordinate);
		
		WebElement pwdTB = driver.findElement(By.name("pass"));
		// get the y-coordinate of password field
		int password_Ycordinate = pwdTB.getLocation().getX();
		System.out.println(password_Ycordinate);
		
		//check whether the Y-coordinate of username and password field are same
		if (username_Ycordinate==password_Ycordinate) {
		System.out.println("Both username and password fields are displayed in the same row");
		}
		else
		{
		System.out.println("username and password fields are NOT aligned in the same row");
		}
		}
	}
