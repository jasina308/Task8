package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC009_ValidateBrokenLink extends ProjectSpecification  {
	
	
	@Test
	public void brokenLink() throws InterruptedException {
		
		//verify links method called to validate the link is broken or not 
		new HomePage(driver)
		.verifyLinks("https://www.bestbuy.com/");
	}

}
