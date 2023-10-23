package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppableOperation {

	public static void main(String[] args) {
		
		//Driver initialization for Chrome browser
		WebDriver driver= new ChromeDriver();
		
		//load URL
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		//maximize browser
		driver.manage().window().maximize();
		
		// Initialize webelement to store frame 
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		// switchTo method is used to switch into the specified frame
		driver.switchTo().frame(frame);
		
		// webelemet initialized to store the source element
		WebElement src=driver.findElement(By.id("draggable"));
		
		//webelement initialized to store the destination element 
		WebElement dest=driver.findElement(By.id("droppable"));
		
		// Actions class is declared to perform mouse hover operations 
		Actions builder = new Actions(driver);
		
		//drag and drop method is used to perform the operation
		builder.dragAndDrop(src, dest).perform();
		
		//getCSSValue is used to print the CSS value of the desired webelement
		System.out.println(dest.getCssValue("background-color"));
		
		String text="Dropped!";
		
		// To check whether excepted text is displayed correctly
		if(text.equals(dest.getText()))
			
				System.out.println("Text is changed to Dropped");
		else
			System.out.println("Text is not changed to Dropped");

		
	}

}
