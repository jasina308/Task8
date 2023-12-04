package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class CreateAccountPage extends ProjectSpecification {
	
	//Web Element are located by @Find by annotation 
	
	@FindBy(linkText="Create Account")
	WebElement create_account;
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement password;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement confpass;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement show_pass;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement checkbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//p[text()='Please enter your first name.']")
	WebElement first_msg;
	
		
	@FindBy(xpath="//p[text()='Please enter a valid email address.']")
	WebElement email_msg;
	
	@FindBy(xpath="//p[text()='Please enter a strong password.']")
	WebElement strong_msg;
	
	@FindBy(xpath="//p[text()='Passwords do not match.']")
	WebElement confpass_msg;
	
	@FindBy(xpath="//p[text()='Please enter a valid mobile phone number.']")
	WebElement phone_msg;
	
	@FindBy(xpath="//p[text()='Too many numeric characters.']")
	WebElement numbers_msg;
	
//	constructor initialization
public CreateAccountPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
//Method to click create account page 
public CreateAccountPage clickCreateAcc() {
	
	click(create_account);
	return this;
	
}

//Method to enter first name in the field 
public CreateAccountPage enterFirstname(String first_name) {
		
		sendKeys(firstname, first_name);
		return this;
		
	}
	// Method to validate error message  firstname field 
public CreateAccountPage firstNameFeild(String first_name,String e) {
		
		sendKeys(firstname, first_name);
		clear(firstname);
		click(lastname);
		validationOfText(first_msg,e);
		refresh();
		return this;
		
	}
//Method to enter last name in the field	
	public CreateAccountPage enterLastname(String last_name) {
		
		sendKeys(lastname, last_name);
		return this;
		
	}
	// Method to validate error message  lastname  field 
public CreateAccountPage notAcceptNumbers(String name,String e) {
	
	
	sendKeys(lastname, name);
	click(email);
	validationOfText(numbers_msg,e);
	
	refresh();
	return this;
	
}


//Method to enter email name in the field
public CreateAccountPage enterEmail(String mail) {
		
		sendKeys(email, mail);
		
		return this;
		
	}
//Method to validate error message  email  field 
public CreateAccountPage emailFeild(String mail,String e) {
	
	sendKeys(email, mail);
	click(password);
	validationOfText(email_msg,e);
	refresh();
	return this;
	
}

//Method to enter password in password field 
public CreateAccountPage enterPassword(String pass) {
	
	sendKeys(password, pass);
	return this;
	
}

//Method to enter re password in Confirm password field
public CreateAccountPage reEnterPassword(String pass1) {
	
	sendKeys(confpass, pass1);
	return this;
	
}
//Method to validate error message in password field 
public CreateAccountPage enterStrongPassword(String pass,String e) {
	
	sendKeys(password, pass);
	click(confpass);
	validationOfText(strong_msg,e);
	refresh();
	return this;
	
}

//method to validate error message in confirm password field
public CreateAccountPage passwordDoNotMatch(String pass,String pass1,String e) {
	
	sendKeys(password, pass);
	sendKeys(confpass, pass1);
	click(phone);
	validationOfText(confpass_msg,e);
	refresh();
	return this;
	
}

//Method to enter phone number in mobile field 
public CreateAccountPage enterPhone(String mob) {
	
	sendKeys(phone, mob);
	return this;
	
}

//method to validate error message in phone field
public CreateAccountPage phoneFeild(String ph,String e) {
	
	sendKeys(phone, ph);
	click(confpass);
	validationOfText(phone_msg,e);
	refresh();
	return this;
	
}

//Method to click show password check box
public CreateAccountPage showPassword() {
	
	click(show_pass);
	return this;
	
}


//Method to click check box 
public CreateAccountPage clickCheckbox() {
	
	click(checkbox);
	return this;
	
}

//Method to click submit button 
public CreateAccountPage clickSubmit() throws InterruptedException {
	
	click(submit);
	
	sleep();
	return this;
	
}


	


}
