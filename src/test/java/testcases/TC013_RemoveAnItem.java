package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC013_RemoveAnItem extends ProjectSpecification {

	
	@Test
	public void removeItem() throws InterruptedException, IOException {
		
		// AddAn Item page methods are called to add an item to cart and remove an item from cart 
		new HomePage(driver)
		.addItemToCart()
		.clickMenu()
		.clickBybrand()
		.clickBrandName()
		.clickHeadPhone()
		.selectItem2()
		.addItem3Cart()
		.clickGoToCart()
		.clickClose()
		.removeAnItem()
		.verifyTotal("$0.00")
		.getScreenshot("TC013_RemoveAnItem")
		;
		
		
	}
	
}
