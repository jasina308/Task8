package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC007_NavigationOfBottomLinks extends ProjectSpecification {
	
	
	
	@Test
	public void clickBottomLinks() throws InterruptedException {
		
		// BottomLinks class methods are called to click the bottom link and title is verified
		new HomePage(driver)
		.clickBottomLink()
		.navigateTobottom()
		.verifyTermsAndConditions("BestBuy.com Terms and Conditions");
		
		
		
	}
	

}
