package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC004_CreateAccount extends ProjectSpecification{
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC004_CreateAccount";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	@Test(dataProvider ="NewData",priority=1 )
	public void create_account(String firstname,String lastname,String email,String pass,String pass1,String phone) throws InterruptedException, IOException {
		
		//home page class is called and create account page methods are called as home page extends project specification class
		//Account details are entered to create an account 
		new HomePage(driver)
		.enterAccountDetails()
		.clickCreateAcc()
		.enterFirstname(firstname)
		.enterLastname(lastname)
		.enterEmail(email)
		.enterPassword(pass)
		//.showPassword()
		.reEnterPassword(pass1)
		.enterPhone(phone)
		//.clickCheckbox()
		.clickSubmit()
		.getScreenshot("TC004_CreateAccount");

}
}
