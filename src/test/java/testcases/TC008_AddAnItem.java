package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC008_AddAnItem extends ProjectSpecification {

	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC008_AddAnItem";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	@Test(dataProvider ="NewData" )
	public void addItemToCart( String item,String title,String firstname,String lastname,String address,String city,String state,String zip)throws InterruptedException, IOException {
		
		// AddAn Item page class methods are called to perform the following actions
		//1. search for an item and add an item to cart
		//2. Shop by department and add an item to cart
		//3. shop by brand and add an item to cart 
		//4.Check out and enter contact details to place an order
		new HomePage(driver)
		.addItemToCart()
		.enterSearch(item)
		.clickSearch()
		.selectItem()
		.addItemToCart()
		.verifyItemAdded(title)
		.clickContinue()
		.clickMenu()
		.clickByDep()
		.clickTablets()
		.clickGalaxyTab()
		.clickGalaxyTabUltra()
		.selectTab()
		.addTabToCart()
		.clickContinue()
		.clickMenu()
		.clickBybrand()
		.clickBrandName()
		.clickHeadPhone()
		.selectItem2()
		.addItem3Cart()
		.clickGoToCart()
		.clickClose()
		.clickCheckOut()
		.clickCointueAsGuest()
		.clickSwitch()
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.enterAddress(address)
		.enterCity(city)
		.selectState(state)
		.enterzip(zip)
		.moveToSwitch()
		.getScreenshot("TC008_AddAnItem");
				
		
		
	}
	
	
}
