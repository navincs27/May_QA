package com.May_IPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.May_IPT.base.BaseClass;


public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text() = 'Profile']")
	private WebElement profile_option;
	
	@FindBy(xpath = "//span[text() = 'Login']")
	private WebElement login_btn;
	
	
	@FindBy(id = "emph")
	private WebElement mobile_input;

//	public WebElement getProfile_option() {
//		return profile_option;
//	}
//
//	public WebElement getLogin_btn() {
//		return login_btn;
//	}
	
	public void clickLoginBtn() {
		mouseHover(profile_option);
		clickOnElement(login_btn);
	}
	
	public void enterMobileInput(String mobileNumber) {
		input(mobile_input, mobileNumber);
	}
	public void password() {}
	
	
	public void selectBoysTshirt() {
//		mouseHover(kids);
//		clickOnElement(tshirt);
	}
	

}
