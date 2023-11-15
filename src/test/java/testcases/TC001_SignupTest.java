package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC001_SignupTest extends ProjectSpecification {
	//excel file name is given in @before test to fetch the test data 
	@BeforeTest
	public void setup() {
		
		excelfile="testdata_signup";
		
	}
	//dataprovider annotation given to take the data from excel sheet 
	@Test(dataProvider ="NewData" )
	public void signupTest(String username,String password) throws InterruptedException {
		
		//home page class is called and signup page methods are called as home page extends project specification class
		new HomePage(driver)
		.clickSignUp()
		.username_sign(username)
		.password_sign(password)
		.signButtonClick()
		.acceptAlertIfPresent();
		
		
		
		
	}
}


