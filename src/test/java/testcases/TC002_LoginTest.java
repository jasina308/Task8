package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC002_LoginTest extends ProjectSpecification {
	
	@BeforeTest
	//excel file name is given in @before test to fetch the test data 
	public void setup() {
		
		excelfile="testdata_login";
		
	}
	//dataprovider annotation given to take the data from excel sheet 
	@Test(dataProvider ="NewData" )
	public void loginTest(String username, String password) {
		
		//home page class is called and login page methods are called as home page extends project specification class
		new HomePage(driver)
		.clickLogin()
		.username_login(username)
		.password_login(password)
		.loginButtonClick();
		
		
		
		
	}

}
