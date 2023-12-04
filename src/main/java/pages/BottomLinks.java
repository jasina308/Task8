package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class BottomLinks extends ProjectSpecification {

	//Web Element are located by @Find by annotation 
	
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement terms;
	
//	constructor initialization
public BottomLinks(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}

//Method to click Terms and conditions click in footer 
public BottomLinks navigateTobottom() {
	
	moveToElement(terms);
	click(terms);
	return this;
}

//Method to verify the title of the page 
public BottomLinks verifyTermsAndConditions(String excepted) {
	
	validationOfTitle(excepted);
	return this;
}

}
