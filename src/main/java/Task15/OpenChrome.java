package Task15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		//webdriver interface is used to create reference for chromedriver class
		WebDriver driver=new ChromeDriver();
		//load URL in driver
		driver.get("https://www.google.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		// locate the search bar using id and pass the search input 
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Drivers");
		
		// locate the search button and perform click operation 
		driver.findElement(By.xpath("(//input[@class=\"gNO89b\"])[2]")).click();
		
		
	}

}
