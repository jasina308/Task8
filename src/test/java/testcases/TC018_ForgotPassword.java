package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC018_ForgotPassword extends ProjectSpecification {
	
	//@Before Test is declared to make data connection with excel
			@BeforeTest
			public void setup() {
				
				excelfile="TC016_FeildValidation_SignIn";
				
			}
			//@Test annotation with data provider parameter to fetch the data from excel 
			@Test(dataProvider ="NewData" )
			public void forgotPassword(String email,String title) throws InterruptedException, IOException
			{
				//ForgotPassword page methods called to click forgot password link and input email 
				new HomePage(driver)
				.clickForgotPassword()
				.enterEmail(email)
				.clickContinue()
				.getScreenshot("TC018_ForgotPassword");

	}

}
