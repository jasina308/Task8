package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC003_ClickAccount extends ProjectSpecification{
		
		
		@Test
		public void click_account() throws InterruptedException {
			
			//home page class is called and account button is clicked
			new HomePage(driver)
			
			.clickAccount()
			.clickCreateAccount();
			
			
		}
		
}

			
