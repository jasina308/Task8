package task21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesProgram3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		//load URL
		driver.navigate().to("http://the-internet.herokuapp.com/nested_frames");
		
		//maximize browser
		driver.manage().window().maximize();
		
		//wait till browser responds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Total number of frames in the page
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
	      System.out.println("Total number of frames in page " + frames.size());

		
			//Top frame which is parent frame 
		WebElement top=driver.findElement(By.xpath("//frame[@name='frame-top']"));
		
			//switch to parent frame
		driver.switchTo().frame(top);
		
		//Total Number of frames inside top 
		List<WebElement> frames1 = driver.findElements(By.tagName("frame"));
	      System.out.println("Total number of frames inside Top " + frames1.size());

		//Left frame located
		WebElement left=driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(left);
		//text in left frame is stored 
		String text_left=driver.findElement(By.xpath("//body")).getText();
		String Acutal_left="LEFT";
		//Verification
		if(Acutal_left.contains(text_left))
			System.out.println("Entered inside LEFT frame :"+text_left);
		else
			System.out.println("Not inside the LEFT frame");
		driver.switchTo().defaultContent();
		//Middle frame located
		driver.switchTo().frame(top);
		WebElement middle=driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(middle);
		String text_mid=driver.findElement(By.xpath("//body")).getText();
		String Acutal_mid="MIDDLE";
		//Verification
		if(Acutal_mid.contains(text_mid))
			System.out.println("Entered inside MIDDLE frame :"+text_mid);
		else
			System.out.println("Not inside the MIDDLE frame");
		
		driver.switchTo().defaultContent();
		//Right frame located
		driver.switchTo().frame(top);
		WebElement right=driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(right);
		String text_right=driver.findElement(By.xpath("//body")).getText();
		String Acutal_right="RIGHT";
		//Verification
		if(Acutal_right.contains(text_right))
		System.out.println("Entered inside RIGHT frame :"+text_right);
		else
			System.out.println("Not inside the RIGHT frame");
		driver.switchTo().defaultContent();
		//Bottom frame located
				WebElement bottom=driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
				driver.switchTo().frame(bottom); 
				String text_bottom=driver.findElement(By.xpath("//body")).getText();
				String Acutal_bottom="BOTTOM";
				//Verification
				if(Acutal_bottom.contains(text_bottom))
				System.out.println("Entered inside BOTTOM frame :"+text_bottom);
				else
					System.out.println("Not inside the BOTTOM frame");

			      
	}
	

}
