package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC006_NavigationOfMenu  extends ProjectSpecification{

	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC006_NavigationOfMenu";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	@Test(dataProvider ="NewData")
	public void navigationMenu(String title1,String title2,String title3,String title4,String title5,String title6,String title7,
			String title8,String title9,String title10) throws InterruptedException
	{
		
		//Home Page class is called and links under menu page are clicked and titles are verified
		new HomePage(driver)
		.menuLinks()
		.clickHolidayDeals(title1)
		.clickTopDeals(title10)
		.clickDealOfDay(title2)
		.clickMembership(title3)
		.clickCreditCard(title4)
		
		.clickMoreLink1(title6)
		//.clickGiftCards(title5)
		.clickMoreLink2(title7)
		
		.clickMoreLink3(title8)
		.clickMoreLink4(title9);
		
}

}