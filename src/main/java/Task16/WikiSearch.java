package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiSearch {

	public static void main(String[] args) {
		
		//Driver initialization for Chrome browser
		WebDriver driver=new ChromeDriver();
		
		//load URL
		driver.get("https://www.wikipedia.org/");
		
		//maximize browser
		driver.manage().window().maximize();

		WebElement s=driver.findElement(By.id("searchInput"));
				s.sendKeys(" Artificial intelligence");
		
				s.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.className("pure-button pure-button-primary-progressive")).click();
		
				//Locator to locate the History link
		WebElement History =driver.findElement(By.xpath("//li[@id='toc-History']//div[1]"));
		History.click();
		
		String actualTitle=driver.getTitle();
		
		System.out.println(actualTitle);
		
		
		
	}

}

