package Task20;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Register_guvi {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
		

		String full_name="John Hugges";
		String pwd="johnhu@123";
		String email_id="johnhug@test.com";
		String mobile_no="9980776859";
		//load URL
		driver.get("https://www.guvi.in/register/");
		
		//maximize browser
		driver.manage().window().maximize();
		
		//wait till browser responds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//get the title of register page 
		String register_page=driver.getTitle();
		
		//locate first name  element field and enter first name 
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(full_name);
		
		
		//locate email id field and enter email id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email_id);
		
		//locate password field and enter password 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		
		// mobile number feild located by name attribute
		driver.findElement(By.id("mobileNumber")).sendKeys(mobile_no);
		
		Thread.sleep(2000);
		// signin button located 
		driver.findElement(By.id("signup-btn")).click();
		// may be later link
		driver.findElement(By.id("laterBtn")).click();
		
		
		Thread.sleep(3000);

		//Sign in verification
		String sign_in_message="Almost Done!";
		String title=driver.getTitle();
		System.out.println(register_page);
		System.out.println(title);
		
		String acutal_sign_in=driver.findElement(By.xpath("//div//h1[text()='Almost Done! Check Your Inbox!']")).getText();
		
		if(acutal_sign_in.contains(sign_in_message))
				System.out.println("Sign in Successfully:"+acutal_sign_in);
		else
			System.out.println("Unable to sign in");
		
		
		//login functionality
	/*	Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Proceed to Sign-in']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("login_email")).sendKeys(email_id);
		driver.findElement(By.id("login_password")).sendKeys(pwd);
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(2000);
		//login verification
		String msg=driver.findElement(By.xpath("//h4[@id='title']")).getText();
		
		String Acutal="Activation";
		if(Acutal.contains(msg))
		System.out.println("User Logged in successfully");
		else
			System.out.println("User not able to login");*/

		//driver.close();
	}

}
