package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class Menu extends ProjectSpecification {
	
	//Web Element are located by @Find by annotation 	
	@FindBy(xpath="//a[text()='Holiday Deals']")
	WebElement holidaydeals;
	
	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement topdeals;
	
	@FindBy(xpath="//a[text()='Deal of the Day']")
	WebElement dealofday;
	
	@FindBy(xpath="(//a[text()='My Best Buy Memberships'])[1]")
	WebElement membership;
	
	@FindBy(xpath="//a[text()='Credit Cards']")
	WebElement cards;
	
	@FindBy(xpath="(//a[text()='Gift Cards'])[1]")
	WebElement giftcard;
	
	@FindBy(xpath="(//a[text()='Gift Ideas'])[1]")
	WebElement giftideas;
	
	
	@FindBy(xpath="//button[@class='c-button-unstyled plButton d-flex justify-content-center align-items-center']")
	WebElement more;
	
	@FindBy(xpath="//span[text()='More']")
	WebElement more1;
	
	@FindBy(xpath="(//a[text()='Yes, Best Buy Sells That'])[2]")
	WebElement link1;
	
	@FindBy(xpath="(//a[text()='Donate to St. Jude'])[2]")
	WebElement link2;
	
	@FindBy(xpath="(//a[text()='Best Buy Outlet'])[2]")
	WebElement link3;
	
	@FindBy(xpath="(//a[text()='Best Buy Business'])[2]")
	WebElement link4;
	
	
//	constructor initialization
	public Menu(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Method to click Holiday deals  click in Menu and validate the title of the page 
public Menu clickHolidayDeals(String excepted) {
	
		
		click(holidaydeals);
		validationOfTitle(excepted);
		back();
		return this;
	}
//Method to click Top deals link in Menu and validate the title of the page 
public Menu clickTopDeals(String excepted) {
	
	
	click(topdeals);
	validationOfTitle(excepted);
	back();
	return this;
}

//Method to click Deal of Day link in Menu and validate the title of the page 
	public Menu clickDealOfDay(String excepted) {
		
		
		click(dealofday);
		validationOfTitle(excepted);
		back();
		return this;
		
	}
	
	// Method to click Membership link in Menu and validate the title of the page 
public Menu clickMembership(String excepted) {
		
		click(membership);
		validationOfTitle(excepted);
		back();
		return this;
		
	}
//Method to click Credit card link in Menu and validate the title of the page 
public Menu clickCreditCard(String excepted) {
	
	click(cards);
	validationOfTitle(excepted);
	back();

	return this;
	
}
//Method to click Gift cards link in Menu and validate the title of the page 
public Menu clickGiftCards(String excepted)  {
	
	click(giftcard);
	validationOfTitle(excepted);
	return this;
	
}
//Method to click Gift ideas link in Menu and validate the title of the page 
public Menu clickGiftIdeas() {
	
	click(giftideas);
	back();
	return this;
	
}

//Method to click more link in Menu and validate the title of the page 
public Menu clickMore() throws InterruptedException {
	WaitForVisibility(more);
	click(more);
	return this;
	
}

//Method to click first link under more in Menu and validate the title of the page 
public Menu clickMoreLink1(String excepted) throws InterruptedException {
	
	sleep();
	click(more1);
	click(link1);
	validationOfTitle(excepted);
	return this;
	
}

//Method to click second link under more in Menu and validate the title of the page 
public Menu clickMoreLink2(String excepted) throws InterruptedException {
	
	sleep();
	click(more1);
	click(link2);
	validationOfTitle(excepted);
	return this;
	
}

//Method to click third link under more in Menu and validate the title of the page 
public Menu clickMoreLink3(String excepted) throws InterruptedException {
	
	sleep();
	click(more1);
	click(link3);
	validationOfTitle(excepted);
	return this;
	
}

//Method to click fourth link under more in Menu and validate the title of the page 
public Menu clickMoreLink4(String excepted) throws InterruptedException {
	
	sleep();
	click(more1);
	click(link4);
	validationOfTitle(excepted);
	return this;
	
}




}
