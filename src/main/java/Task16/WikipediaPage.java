package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WikipediaPage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchInput")).sendKeys("Artifical intelligence");
		
		Actions actions = new Actions(driver);
		
		WebElement searchButton= driver.findElement(By.className("sprite svg-search-icon"));
		searchButton.click();
		

	}

}
