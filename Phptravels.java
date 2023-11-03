package task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Phptravels {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		//load URL
		driver.get("https://phptravels.com/demo/");
		
		//maximize browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	
		//first name last name feilds are located and sendkey values passed.
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Joey");
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Trii");
		
		
		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("Joey Bing");
		
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("Joey@test.com");
		
		// sum verification numbers are located and text is obtained 
		String num1=driver.findElement(By.xpath("//span[@id='numb1']")).getText();
		
		String num2=driver.findElement(By.xpath("//span[@id='numb2']")).getText();
		//System.out.println(num1);
		//System.out.println(num2);
		
		//coverting text to integer to perform addition operation 
		int a=Integer.parseInt(num1);
		
		int b=Integer.parseInt(num2);
		
		int res=a+b;
		//result again coverted to string to pass in sendkeys of result field 
		String s=String.valueOf(res);
		
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys(s);
		
		Thread.sleep(1000);
		//click submit button 
		
		driver.findElement(By.xpath("//button[@id='demo']")).click();
		
		//message after login 
		String Excepted=driver.findElement(By.xpath("//strong[text()=' Thank you!']")).getText();
		
		String Actual= "Thank You!";
		
		//verification 
		if(Actual.contains(Excepted))
			
			System.out.println("User logged Successfully");
		else
			System.out.println("User unable to login");
		
		//Take Screenshot 
		/*WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='F A Q']"));
		Actions builder= new Actions(driver);
		Thread.sleep(2000);
		builder.moveToElement(ele).perform();*/
		
		Thread.sleep(1000);
		
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("ThankYoumsg.png");
		
		FileUtils.copyFile(src,dest);
		
		//driver.close();
	}

}
