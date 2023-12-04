package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ForgotPasswordPage extends ProjectSpecification {
	
	//Web Element are located by @Find by annotation 
	@FindBy(xpath="//input[@class='tb-input']")
	WebElement email;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement continue_button;
	
//	constructor initialization
public ForgotPasswordPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

//Method to enter email id in email field 
public ForgotPasswordPage enterEmail(String mail)
{
	sendKeys(email,mail);
	return this;
}

//Method to click continue button
public ForgotPasswordPage clickContinue() {
	
	click(continue_button);
	return this;
}

	
}
