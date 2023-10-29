package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		//load URL
		driver.navigate().to("https://jqueryui.com/datepicker/");
		
		//maximize browser
		driver.manage().window().maximize();
		
		//wait till browser responds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		// switchTo method is used to switch into the specified frame
				driver.switchTo().frame(0);
				// date textbox located using id
		WebElement date=driver.findElement(By.id("datepicker"));
		date.click();
		
		//left arrow of the calender located using link text
		WebElement previous=driver.findElement(By.linkText("Prev"));
		
		// right arrow of the calender located using link text
		WebElement next=driver.findElement(By.linkText("Next"));
		
		// right arrow clicked to select next month
		//previous.click();
		next.click();
		
		String Excepted ="November";
		
		WebElement month =driver.findElement(By.className("ui-datepicker-title"));
		String acutal= month.getText();
		
		
		driver.findElement(By.linkText("22")).click();
		
		//System.out.println(date.getText());
		
	if(acutal.contains(Excepted))
		
		System.out.println("Date Selected"+date.getText());
			else
				System.out.println("Date not selected");
				
		//driver.close();
	}

}
