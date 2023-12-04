package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC015_FilterAnItem extends ProjectSpecification{
	
	
	
	@Test
	public void filterAnItem() throws InterruptedException, IOException {
		
		//AddAnItem class method are called to perform filter operation and add an item to cart 
		new HomePage(driver)
		.addItemToCart()
		.clickMenu()
		.clickBybrand()
		.clickBrandName()
		.clickHeadPhone()
		.clickDiscount()
		.clickClear()
		.enterPriceMin("50")
		.enterPriceMax("150")
		.clickPrice()
		.selectItem4()
		.selectColour()
		.addItem3Cart()
		.clickCart()
		.getScreenshot("TC015_FilterAnItem");
		

}
	
	
}

