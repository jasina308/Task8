package task21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesProgram2 {

	public static void main(String[] args) {
	
		
		WebDriver driver=new ChromeDriver();
		
		//load URL
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		
		//maximize browser
		driver.manage().window().maximize();
		
		//wait till browser responds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//click here link located by link text
		driver.findElement(By.linkText("Click Here")).click();
		//set created to get the windows 
		Set<String> windowhandles=driver.getWindowHandles();
		//converted to list to access the window
		List<String> first_window=new ArrayList<>(windowhandles);
		//switch to particular window using index
		driver.switchTo().window(first_window.get(1));
		
		//verification
		String Acutal="New Window";
		String Excepted= driver.getTitle();
		if(Acutal.contains(Excepted))
			
			System.out.println("Switched to New Window\n"+Excepted);
			else
				System.out.println("Unable to Switch to New Window");
		
		driver.close();
		//driver.quit();
		
	}

}
