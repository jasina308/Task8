package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class AccountPage extends ProjectSpecification {
	
	//Web Element are located by @Find by annotation 
	@FindBy(linkText="Create Account")
	WebElement create_account;
	
	@FindBy(linkText="Sign In")
	WebElement sign_in;
	
	//	constructor initialization
	public AccountPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Method to click sign in button 
	public AccountPage clickSignIn() {
		click(sign_in);
		
		return this;
		
	}
	
	//Method to click create account button
	public AccountPage clickCreateAccount() {
		click(create_account);
		
		return this;
		
	}



	
}
