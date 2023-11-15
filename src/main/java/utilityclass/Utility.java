package utilityclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Utility {

	public  WebDriver driver;
	public  String excelfile;
	public  Alert alert;
	public void launchBroswer(String browser, String url) {
		  
		  // To launch the browser
		  
		  	ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			if(browser.equalsIgnoreCase("chrome")) {
				
			driver = new ChromeDriver(options);
			
			} else if (browser.equalsIgnoreCase("edge")) {
				
				driver = new EdgeDriver();
				
			} else if (browser.equalsIgnoreCase("firefox")) {
				
				driver= new FirefoxDriver();
				
			} else {
				
				driver = new ChromeDriver(options);
				
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
	  }
	//Method to close the browser
	
	public void close() {
		driver.close();
	}
	//Method to take data from excel file 
	
	public static String[][] readExcel(String excelfile) throws IOException {
		  
		  XSSFWorkbook book=new XSSFWorkbook("./data/"+excelfile+".xlsx");  // open work book
			XSSFSheet sheet = book.getSheetAt(0);
			int rowcount = sheet.getLastRowNum(); 
			short columnCount = sheet.getRow(0).getLastCellNum(); 
			
			String [][] data= new String[rowcount][columnCount]; 
			for (int i = 1; i <= rowcount; i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < columnCount; j++) {
					XSSFCell cell = row.getCell(j);
					//System.out.println(cell.getStringCellValue());
					data[i-1][j]=cell.getStringCellValue();   
					
				}
			}
			book.close();
			return data;
	  }
	//Method to click any webelement 
	public void click(WebElement element) {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	//Method to enter values to any webelement 
	public void sendKeys(WebElement ele, String value) {
		
		ele.sendKeys(value);
	}
	// Method to take screenshot 
	public String getScreenshot(String testmethodname) throws IOException 
	{
		String path="./snap/"+testmethodname+".png";
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(path);
		
		FileUtils.copyFile(src,dest);
		return path;
	}
	//Method to handle alert 
	public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
	//Method to wait for an alert 
	public void waitforalert() {
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(25));
			wait.until(ExpectedConditions.alertIsPresent());
	}
	//Method to accept any alert 
	public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
