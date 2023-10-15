package Task15;

import org.openqa.selenium.WebDriver;// webdriver interface is imported
import org.openqa.selenium.chrome.ChromeDriver;//chrome driver class is imported

public class SimpleScript {

	public static void main(String[] args) {
		
		//webdriver interface is used to create reference for chromedriver class
		WebDriver driver=new ChromeDriver();
		
		//load URL in driver website we need to open is loaded in get() method
		driver.get("https://www.guvi.in/");

		//Maximize the window
		driver.manage().window().maximize();
		
		//Close the browser
		driver.close();
	}

}
