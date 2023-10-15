package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {

		//Driver initialization for Chrome browser
				WebDriver driver=new ChromeDriver();
				
				//load URL
				driver.get("https://www.demoblaze.com/");
				
				//maximize browser
				driver.manage().window().maximize();
				
				//To get the title of the webpage
				String actualTitle=driver.getTitle();
				
				String exceptedTitle="STORE";
				
				//Compare the acutal and excepted title strings
				if(actualTitle.contains(exceptedTitle))
				{
					System.out.println("Page landed on correct Website");
				}
				else
				{
					System.out.println("Page not landed on correct Website");
				}
				
				driver.close();
	}

}
