package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC001_LaunchURL_US extends ProjectSpecification{
	
	
		@Test
		public void usLink( ) throws InterruptedException, IOException {
			
			//US page launched 
			new HomePage(driver)
			.getScreenshot("TC001_LaunchURL_US");
			
		

		}
}
