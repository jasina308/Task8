package Task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signIn_Guvi {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//load URL
		driver.get("https://www.guvi.in/register/");
		
		//maximize browser
		driver.manage().window().maximize();
		
		//wait till browser responds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//locate first name  element field and enter first name 
		driver.findElement(By.id("firstName")).sendKeys("joes");
		
		////locate last name  element field and enter last name
		driver.findElement(By.id("lastName")).sendKeys("peter");
		
		//locate email id field and enter email id
		driver.findElement(By.id("emailInput")).sendKeys("peterjoe@test.com");
		//driver.findElement(By.className("form-control is-invalid")).sendKeys("testuser@test.com");
		
		//locate password field and enter password 
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("peter@1234");
		
		// mobile number feild located by name attribute
		driver.findElement(By.name("mobileNumberInput")).sendKeys("9090687756");
		
		//sign in button located by tagname 
		driver.findElement(By.tagName("button")).click();
		
			
		//driver.close();

	}

}
