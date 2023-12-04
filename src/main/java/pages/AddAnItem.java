package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class AddAnItem extends ProjectSpecification {

	//Web Element are located by @Find by annotation
	@FindBy(id="gh-search-input")
	WebElement search;
	
	@FindBy(xpath="//button[@class='header-search-button']")
	WebElement search_button;
	
	@FindBy(xpath="//a[text()='Apple Watch SE 2nd Generation (GPS) 40mm Starlight Aluminum Case with Starlight Sport Band - S/M - Starlight']")
	WebElement selectitem;
	
	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	WebElement addtocart;
	
	@FindBy(xpath="//button[@class='c-button-link continue-shopping']")
	WebElement continue_shopping;

	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement menu;
	
	@FindBy(xpath="(//button[@type='button'])[8]")
	WebElement computers;
	
	@FindBy(xpath="//button[text()='Tablets']")
	WebElement tablet;
	
	@FindBy(xpath="//a[text()='Samsung Galaxy Tablets']")
	WebElement galaxy;
	
	@FindBy(xpath="(//a[text()='Samsung Galaxy Tab S9'])[1]")
	WebElement ultra;
	
	@FindBy(xpath="//a[contains(text(),' 128GB - Wi-Fi - with S-Pen - Graphite')]")
	WebElement selectitem1;
	
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	WebElement brands;
	
	@FindBy(xpath="//a[text()='Sony']")
	WebElement sony;
	
	
	@FindBy(xpath="//a[text()='Sony headphones']")
	WebElement headphones;
	
			
	@FindBy(xpath="//a[text()='Sony - WH1000XM4 Wireless Noise-Cancelling Over-the-Ear Headphones - Black']")
	WebElement selectitem2;
	
	@FindBy(xpath="//span[@class='added-to-cart']")
	WebElement itemadded;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement gotocart;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement continue_guest;
	
	@FindBy(id="user.emailAddress")
	WebElement email;
	
	@FindBy(id="user.phone")
	WebElement phone;
	
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	WebElement continue_payment;
	
	@FindBy(xpath="//input[@id='number']")
	WebElement card;
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='street']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@id='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement zip;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement placeorder;
	
	@FindBy(xpath="//button[@class='c-button-link card-call-to-action-button']")
	WebElement switch_ship;
	
	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-md ']")
	WebElement enteraddress;
	
	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-md new-address-form__button']")
	WebElement apply;
	
	@FindBy(xpath="//button[@class='c-button-link cart-item__remove']")
	WebElement remove;
	
	
	@FindBy(xpath="//h1[@class='heading-5 page-heading__title']")
	WebElement cartisempty;
	
	@FindBy(xpath="//div[text()='$0.00']")
	WebElement total;
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement save_button;
	
	@FindBy(xpath="//a[text()='My Saved Items']")
	WebElement mysaved_link;
	
	@FindBy(xpath="//div[@class='pb-150']")
	WebElement saved_msg;
	
	@FindBy(xpath="(//a[text()='Black Friday Deals'])[3]")
	WebElement blackfriday;
	
	@FindBy(xpath="//a[text()='50% Off or More']")
	WebElement discount;
	
	@FindBy(xpath="(//input[@class='tb-input range-control form-control'])[1]")
	WebElement price_min;
	
	@FindBy(xpath="(//input[@class='tb-input range-control form-control'])[2]")
	WebElement price_max;
	
	@FindBy(xpath="//button[@class='c-button-link range-submit']")
	WebElement price_submit;
	
	@FindBy(xpath="//a[text()='4 & Up']")
	WebElement rating;
	
	@FindBy(xpath="//button[@class='c-button-link clear-all']")
	WebElement clear;
	

	@FindBy(xpath="//img[@alt='Desert Sand']")
	WebElement colour;
	
	@FindBy(xpath="//a[text()='Sony - WF-C700N Truly Wireless Noise Canceling In-Ear Headphones - Black']")
	WebElement selectitem3;
	
	@FindBy(xpath="//a[text()='Sony - LinkBuds S True Wireless Noise Canceling Earbuds - Black']")
	WebElement selectitem4;

	@FindBy(xpath="//button[@class='c-close-icon c-modal-close-icon']")
	WebElement close;
	
	@FindBy(xpath="//button[@class='c-button-link card-call-to-action-button']")
	WebElement switch_shipping;
	
	@FindBy(xpath="//span[text()='Cart']")
	WebElement  cart;
	
	
	//Constructor Initialization 
public AddAnItem(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	
//Method to enter the item name  in search bar
public AddAnItem enterSearch( String item) {
	
	
	sendKeys(search, item);
	return this;
	
}

//Method to click search button of search bar 
public AddAnItem clickSearch() {
	
	
	click(search_button);
	return this;
	
}

//Method to  move to the desired item link and click item  
public AddAnItem selectItem() {
	
	moveToElement(selectitem);
	actionClick(selectitem);
	return this;
	
}

//Method to click addtocart button 
public AddAnItem addItemToCart() {
	
	moveToElement(addtocart);
	click(addtocart);
	return this;
	
}
//Method to verify whether message displayed after item added to cart
public AddAnItem verifyItemAdded(String excepted) {
	
	WaitForVisibility(itemadded);

	validationOfText(itemadded,excepted);
	return this;
}

//method to click continue shopping link 
public AddAnItem clickContinue() {
	
	click(continue_shopping);
	return this;
}

//Method to click menu button 
public AddAnItem clickMenu() {
	
	click(menu);
	return this;
}

//Method to click Departments link 
public AddAnItem clickByDep() {
	
	click(computers);
	return this;
}

//Method to click desired department
public AddAnItem clickTablets() {
	
	click(tablet);
	return this;
}

//Method to click desired product under department 
public AddAnItem clickGalaxyTab() {
	
	click(galaxy);
	return this;
}
//Method to click desired product under department 
public AddAnItem clickGalaxyTabUltra() {
	
	click(ultra);
	return this;
}
//Method to  move to the desired item link and click item  
public AddAnItem selectTab() {
	
	click(selectitem1);
	return this;
	
}

//Method to click addtocart button 
public AddAnItem addTabToCart() {
	
	moveToElement(addtocart);
	click(addtocart);
	return this;
	
}

//Method to click Brand link 
public AddAnItem clickBybrand() {
	
	click(brands);
	return this;
}

//Method to click a desired brand name 
public AddAnItem clickBrandName() {
	
	click(sony);
	return this;
}

//Method to click the desired product under the brand
public AddAnItem clickHeadPhone() {
	
	moveToElement(headphones);
	click(headphones);
	return this;
}

//Method to  move to the desired item link and click item  
public AddAnItem selectItem2() {
	
	moveToElement(selectitem2);
	click(selectitem2);
	return this;
}

//Method to click addtocart button 

public AddAnItem addItem3Cart() {
	
	moveToElement(addtocart);
	click(addtocart);
	return this;
	
}

//Method to click got to cart button 
public AddAnItem clickGoToCart() throws InterruptedException {
	
	sleep();
	WaitForVisibility(gotocart);
	click(gotocart);
	return this;
}

//Method to click checkout button 
public AddAnItem clickCheckOut() {
	click(checkout);
	return this;
	
}

//Method to click continue as guest button 
public AddAnItem clickCointueAsGuest() {
	click(continue_guest);
	return this;
	
}

//Method to enter email id in email field 
public AddAnItem enterEmail(String mail) {
	moveToElement(email);
	sendKeys(email,mail);
	return this;
	
}
//Method to enter phone number in mobile number field 

public AddAnItem enterPhone(String ph) {
	
	sendKeys(phone,ph);
	return this;
	
}

//Method to click continue payment button 
public AddAnItem clickContinuePayment() {
	
	click(continue_payment);
	return this;
}

//Method to enter card number 
public AddAnItem enterCardNo(String number) {
	
	sendKeys(card,number);
	return this;
}

//Method to enter first name
public AddAnItem enterFirstName(String first_name) {
	moveToElement(firstname);
	
	sendKeys(firstname,first_name);
	return this;
}

//Method to enter last name 
public AddAnItem enterLastName(String last_name) {
	
	sendKeys(lastname,last_name);
	return this;
}

//Method to enter address
public AddAnItem enterAddress(String add) {
	
	sendKeys(address,add);
	return this;
}

//Method to enter city 
public AddAnItem enterCity(String c) {
	
	sendKeys(city,c);
	return this;
}
// Method to select state
public AddAnItem selectState(String c) {
	
	select(state,c);
	return this;
}
//Method to enter zip code
public AddAnItem enterzip(String code) {
	
	sendKeys(zip,code);
	return this;
}

//Method to click Place order button 
public AddAnItem clickPlaceOrder() {
	
	
	click(placeorder);
	
	moveToElement(card);
	return this;
}
//Method to click switch to all shipping 
public AddAnItem clickSwitch() {
	
	click(switch_ship);
	return this;
}

//Method to click apply button 
public AddAnItem clickApply() {
	
	click(apply);
	return this;
}

//Method to enter address
public AddAnItem clickEnterAddress() {
	
	click(enteraddress);
	return this;
}

//Method to click remove button 
public AddAnItem removeAnItem() {
	
	click(remove);
	return this;
}

//Method to verify error message 
public AddAnItem verifyCartIsEmpty(String excepted) {
	
	WaitForVisibility(cartisempty);

	validationOfText(cartisempty,excepted);
	return this;
}

//Method to verify total balance
public AddAnItem verifyTotal(String excepted) {
	
	WaitForVisibility(total);

	validationOfText(total,excepted);
	return this;
}

//Method to click save button 
public AddAnItem clickSave() {
	
	scrolldown(selectitem2);
	actionClick(save_button);
	return this;
}

//Method to verify message of saved item
public AddAnItem verifySavedItem(String excepted) {
	
	WaitForVisibility(saved_msg);
	validationOfText(saved_msg,excepted);
	return this;
}

//Method to click my saved link 
public AddAnItem clickMySaved(String excepted) {
	
	
	click(mysaved_link);
	validationOfTitle(excepted);
	return this;
}
//Method to filter by clicking black friday link 
public AddAnItem clickDeal() {
	moveToElement(blackfriday);
	click(blackfriday);
	return this;
}
//Method to filter by clicking discount button 
public AddAnItem clickDiscount() {
	moveToElement(discount);
	click(discount);
	return this;
}

//Method to filter by clicking rating star 
public AddAnItem clickRating() {
	moveToElement(rating);
	click(rating);
	return this;
}

////Method to  clear out the filter
public AddAnItem clickClear() {
	click(clear);
	return this;
}

//Method to enter minimum price 
public AddAnItem enterPriceMin(String min) {
	
	moveToElement(price_min);
	sendKeys(price_min,min);
	return this;
}
//Method to enter maximum price 
public AddAnItem enterPriceMax(String max) {
	
	
	sendKeys(price_max,max);
	return this;
}
//Method to filter the price 
public AddAnItem clickPrice() {
	click(price_submit);
	return this;
}

//Method to select the desired color of the item
public AddAnItem selectColour() {
	moveToElement(colour);
	actionClick(colour);
	return this;
}
//Method to click the desired item link 
public AddAnItem selectItem3() {
	moveToElement(selectitem3);
	click(selectitem3);
	return this;
}
//Method to click the desired item link 
public AddAnItem selectItem4() {
	moveToElement(selectitem4);
	click(selectitem4);
	return this;
}

//Method to close the popup 
public AddAnItem clickClose() throws InterruptedException {
	try {
	WaitForVisibility(close);
	click(close);
	}
	catch(Exception e ) {
		System.out.println("No such pop up displayed");
	}
	return this;
	
}

//Method to click switch to shipping link 
public AddAnItem moveToSwitch() {
	moveToElement(switch_shipping);
	
	return this;
}

//Method to click cart icon 
public AddAnItem clickCart() {
	click(cart);
	return this;
}

}