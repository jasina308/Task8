package task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesProgram1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		//load URL
		driver.navigate().to("https://the-internet.herokuapp.com/iframe");
		
		//maximize browser
		driver.manage().window().maximize();
		
		//wait till browser responds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//frame stored as webelement
		WebElement frame=driver.findElement(By.xpath("//div//iframe[@id='mce_0_ifr']"));
		
		// switchTo method is used to switch into the specified frame
				driver.switchTo().frame(frame);
				
				//textbox in the frame is located 
		WebElement textbox=driver.findElement(By.xpath("//body[@id='tinymce']"));
				textbox.clear();//textbox is cleared.
				textbox.sendKeys("Hello People.");
				
			
				//Verification for textbox inside frame
				String Acutal="Hello People.";
				String Excepted=textbox.getText();
				System.out.println(Excepted);
				if(Acutal.contains(Excepted))
				
					System.out.println("Text entered correctly");
					else
						System.out.println("Text not entered");
				
		
				//driver.close();
				
	}

}
