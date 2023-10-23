package facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpFuntionality {

	public static void main(String[] args)  {
		
WebDriver driver=new ChromeDriver();
		
		//load URL
		driver.get("https://www.facebook.com/");
		
		//maximize browser
		driver.manage().window().maximize();
		
		//wait until page loads
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		// click CREATE ACCOUNT button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
	
		// Enter values in First Name field
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		
		
		
		// Enter values in Surname field
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User");
		
		
		
		//Enter values in Email id or mobile number field
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("testuser@test.com");
		
		// Enter values in Re-enter Email id field
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("testuser@test.com");
		
		//Enter values in Password field
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Test@123");
		
		
		//To select day option from dropdown
	
				
       Select options= new Select(driver.findElement(By.xpath("//select[@id='day']")));
		
		options.selectByVisibleText("11");
		//To select month option from drop down
		
		Select options1= new Select(driver.findElement(By.xpath("//select[@id='month']")));
		
		options1.selectByVisibleText("May");
		//To select year from the dropdown
		
		 Select options2= new Select(driver.findElement(By.xpath("//select[@id='year']")));
		
		options2.selectByVisibleText("1985");
		// To select the Male option 
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		// click SignUp button 
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}

}
