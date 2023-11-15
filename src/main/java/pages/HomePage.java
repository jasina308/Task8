package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification {
	
	//Find by annotation to locate the elements
	@FindBy(xpath="//a[text()='Sign up']")
	WebElement signup;
	
	@FindBy(xpath="//a[text()='Log in']")
	WebElement login;
	
	//constructor initialisation
	public HomePage(WebDriver driver) {
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	//method to click signup link
	public SignUp clickSignUp() {
		
		click(signup);
		return new SignUp(driver);
		
	}
	//method to click login link 
	public LoginPage clickLogin() {
		
		click(login);
		return new LoginPage(driver);
	
	}


}
