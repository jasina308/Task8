package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification {
	
	//Find by annotation to locate the elements
		@FindBy(id="account-menu-account-button")
		WebElement account;
						
		@FindBy(xpath="(//button[@type='button'])[2]")
		WebElement menu;
		
		@FindBy(id="gh-search-input")
		WebElement search;
		
		@FindBy(xpath="(//a[@class='us-link'])[1]")
		WebElement us;
		
		@FindBy(xpath="//a[text()='Forgot your password?']")
		WebElement forgot_password;
		
		@FindBy(linkText="Sign In")
		WebElement sign_in;
		
		//constructor initialisation
		public HomePage(WebDriver driver) {
			
			this.driver = driver; 
			PageFactory.initElements(driver, this);
			
		}
		
		//Method to click account button and constructor chaining done to return to account page 
		public AccountPage clickAccount() throws InterruptedException {
			
			
			sleep();
			sleep();
			click(account);
		
			return new AccountPage(driver);
			
		}
		//Method for constructor chaining done to return to Menu page			
public Menu menuLinks() {
		
			
			return new Menu(driver);
			
		}

//Method to click account button and constructor chaining done to return to create  account page 
 
public CreateAccountPage enterAccountDetails() throws InterruptedException {
	
	sleep();
	click(account);
	return new CreateAccountPage(driver);
}


//Method to click account and constructor chaining done to return to signin page 
public SignInPage signInAccount() throws InterruptedException {
	
	
	sleep();
	click(account);
	return new SignInPage(driver);
}

//Method for constructor chaining done to return to Bottomlink page 
public BottomLinks clickBottomLink() {
	
	return new BottomLinks(driver);
	
}

////Method for constructor chaining done to return to Addanitem  page 
public AddAnItem addItemToCart() {
	
	
	return new AddAnItem(driver);
	
}
//Method to click account and constructor chaining done to return to Forgot password page 
public  ForgotPasswordPage clickForgotPassword() throws InterruptedException {
	
	sleep();
	click(account);
	click(sign_in);
	
	click(forgot_password);
	
	return new ForgotPasswordPage(driver);
}


}
