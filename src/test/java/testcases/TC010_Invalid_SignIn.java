package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC010_Invalid_SignIn extends ProjectSpecification {
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC010_SignIn_Negative";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	@Test(dataProvider ="NewData" )
	public void signIn(String email,String pass,String title) throws InterruptedException, IOException
	{
		//SignIn Page methods called to sign in with invalid credentials 
		new HomePage(driver)
		.signInAccount()
		.clickSignIn()
		.enterEmail(email)
		.enterPassword(pass)
		.showPassword()
		.clickSubmit()
		//.verifyMsg(title)
		.getScreenshot("TC010_SignIn_Negative");
		
	}

}
