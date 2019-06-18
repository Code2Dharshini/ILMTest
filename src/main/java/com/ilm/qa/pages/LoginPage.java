package com.ilm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ilm.qa.base.Testbase;

public class LoginPage extends Testbase{
	
	@FindBy(name="userEmail")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@alt, 'Sprooki')]")
	WebElement mercatusLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateMercatusLogo() {
		return mercatusLogo.isDisplayed();
	}
	
	public HomePage login(String loginEmail, String pwd) {
		email.sendKeys(loginEmail);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
