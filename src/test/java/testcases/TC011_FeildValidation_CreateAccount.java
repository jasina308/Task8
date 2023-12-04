package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC011_FeildValidation_CreateAccount extends ProjectSpecification {
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC011_CreateAccount_Negative";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	@Test(dataProvider ="NewData" )
	public void feildValidations(String firstname,String msg1,String name,String msg3,String email,String msg4,String pass,String msg5,
			String pass1,String pass2,String msg6,String phone,String msg7) throws InterruptedException, IOException {
		
		//Create Account Page methods called to validate the fields and error message  in create account page 
		new HomePage(driver)
		.enterAccountDetails()
		.clickCreateAcc()
		.firstNameFeild(firstname, msg1)
		.notAcceptNumbers(name, msg3)
		.emailFeild(email, msg4)
		.enterStrongPassword(pass, msg5)
		.passwordDoNotMatch(pass1, pass2, msg6)
		.phoneFeild(phone, msg7)
		.getScreenshot("TC011_CreateAccount_Negative");

}
	
	
}
