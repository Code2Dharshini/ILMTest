package com.ilm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ilm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="userEmail")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@alt, 'Sprooki')]")
	WebElement mercatusLogo;
	
	@FindBy(xpath="//a[contains(text(), 'Forgot your password?')]")
	WebElement forgotPassword;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateMercatusLogo() {
		return mercatusLogo.isDisplayed();
	}
	
	public ForgotPasswordPage forgotPassword() {
		forgotPassword.click();
		return new ForgotPasswordPage();
		
	}
	
	public HomePage login(String loginEmail, String pwd) {
		email.sendKeys(loginEmail);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
