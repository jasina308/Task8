package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class SignUp extends ProjectSpecification {
	
	//FindBy annotation to locate elements
	@FindBy(id="sign-username")
	WebElement username1;
	
	@FindBy(id="sign-password")
	WebElement password1;
	
	@FindBy(xpath="//button[text()='Sign up']")
	WebElement button_signup;
	
	//constructor initialization 
			public SignUp(WebDriver driver) {
				
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			// Method to enter username 
			public SignUp username_sign(String un) {
				
				sendKeys(username1, un);
				return this;
				
			}
			// Method to enter password
			public SignUp password_sign(String pass) {
				
				sendKeys(password1, pass);
				return this;
				
			}
				//Method to click  sign up button 
				public SignUp signButtonClick() {
					
					click(button_signup);
					return this;
					
				}
		
				//Alert handled and alert text verified
		public SignUp acceptAlertIfPresent() {
	        if (isAlertPresent()) {
	        	acceptAlert();
	        	String acutal="Sign up successful.";
				String Excepted=alert.getText();
				Assert.assertEquals(acutal, Excepted);
				System.out.println("Sign up Success");
	        }
	        return this;
	    }

		

}
