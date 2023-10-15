package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) {
		//Driver initialization for Firefox browser
		WebDriver driver=new FirefoxDriver();
		
		//load URL
		driver.get("https://www.google.com/");
		
		//maximize browser
		driver.manage().window().maximize();
		
		// close the browser
		driver.close();
		
				
	}

}
