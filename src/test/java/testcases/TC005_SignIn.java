package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC005_SignIn extends ProjectSpecification {
	
	//@Before Test is declared to make data connection with excel
	@BeforeTest
	public void setup() {
		
		excelfile="TC005_SigIn";
		
	}
	//@Test annotation with data provider parameter to fetch the data from excel 
	@Test(dataProvider ="NewData" )
	public void signIn(String email,String pass) throws InterruptedException, IOException
	{
		//Home page class is called and  signin page methods are called to sign in to an account 
		new HomePage(driver)
		.signInAccount()
		.clickSignIn()
		.enterEmail(email)
		.enterPassword(pass)
		.showPassword()
		.clickSubmit()
		.getScreenshot("TC005_SigIn");
		
	}
}
