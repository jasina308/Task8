package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SignInPage extends ProjectSpecification {
	
	//Find by annotation to locate the elements
	@FindBy(linkText="Sign In")
	WebElement sign_in;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement showpassword;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement submit;
	
	@FindBy(xpath="//button[@class='c-button-link cia-cancel']")
	WebElement skip;
	
	@FindBy(xpath="//div[@class='c-alert-content rounded-r-100 flex-fill v-bg-pure-white p-200 pl-none']")
	WebElement message;
	
	@FindBy(xpath="//p[text()='Please enter your password.']")
	WebElement password_message;
	
	@FindBy(xpath="//p[text()='Please enter a valid email address.']")
	WebElement email_message;
	
	//Constructor initialization 
public SignInPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//Method to click sign in button 
public SignInPage clickSignIn() {
	click(sign_in);
	return this;
}

//method to enter email id 
public SignInPage enterEmail(String mail) {
	sendKeys(email, mail);
	return this;
}

//Method to enter password 
public SignInPage enterPassword(String pass) {
	sendKeys(password, pass);
	return this;
}

//Method to click show password 
public SignInPage showPassword() {
	click(showpassword);
	return this;
}
//Method to click submit button 
public SignInPage clickSubmit() throws InterruptedException {
	sleep();
	click(submit);
	return this;
}

//Method to verify message 
public SignInPage verifyMsg(String title) throws InterruptedException {
	WaitForVisibility(message);
	validationOfText(message,title);
	return this;
}

//Method to click skipfornow link 
public SignInPage skipForNow() {
	click(skip);
	return this;
}

//Method to verify error message of password field 
public SignInPage verifyPasswordMessage(String message)  {
		WaitForVisibility(password_message);
		validationOfText(password_message,message);
		return this;
}

//Method to verify error message of email field 
public SignInPage verifyEmailMessage(String message)  {
	WaitForVisibility(email_message);
	validationOfText(email_message,message);
	return this;
}

}
