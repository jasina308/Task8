package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC0014_SaveAnItem extends ProjectSpecification {
	
	
	@Test
	public void saveAnItem() throws InterruptedException, IOException {
		
		//Home page methods called to save an item to cart and title and message are verified
		new HomePage(driver)
		.addItemToCart()
		.clickMenu()
		.clickBybrand()
		.clickBrandName()
		.clickHeadPhone()
		.clickSave()
		.verifySavedItem("Saved to My Saved Items")
		.clickMySaved("Saved Items - Best Buy")
		.getScreenshot("TC0014_SaveAnItem")
		;
		
		
	}

}
