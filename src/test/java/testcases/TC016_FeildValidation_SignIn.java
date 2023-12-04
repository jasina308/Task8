package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC016_FeildValidation_SignIn  extends ProjectSpecification{
	
	
	//@Before Test is declared to make data connection with excel
		@BeforeTest
		public void setup() {
			
			excelfile="TC016_FeildValidation_SignIn";
			
		}
		//@Test annotation with data provider parameter to fetch the data from excel 
		@Test(dataProvider ="NewData" )
		public void verifyPasswordFeild(String email,String title) throws InterruptedException, IOException
		{
			//SignIn Page methods called to validate password feild
			new HomePage(driver)
			.signInAccount()
			.clickSignIn()
			.enterEmail(email)
			.clickSubmit()
			.verifyPasswordMessage(title)
			.getScreenshot("TC016_FeildValidation_SignIn");

}
		
}
