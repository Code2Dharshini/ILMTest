package com.ilm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ilm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"welcome\"]/text()[1]") 
	WebElement usernameLabel;
	
	@FindBy(xpath="//*[@id=\"welcome\"]/b") 
	WebElement userrole;
	
	@FindBy(xpath="//a[contains(text(),'Change Password')]")
	WebElement changePasswordLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	WebElement signOutLink;
	
	@FindBy(xpath="//*[@id=\"link_promotions\"]")
	WebElement promotionsLink;
	
	@FindBy(xpath="//*[@id=\"link_rewards\"]")
	WebElement rewardsLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean correctUserName() {
		return usernameLabel.isDisplayed();
	}
	
	public boolean correctuserrole() {
		return userrole.isDisplayed();
	}
	
	public ChangePasswordPage clickOnChangePasswordLink() {
		changePasswordLink.click();
		return new ChangePasswordPage();
	}
	
	public PromotionsPage clickOnPromotionsLink() {
		promotionsLink.click();
		return new PromotionsPage();
	}
	
	public RewardsPage clickOnRewardsLink() {
		rewardsLink.click();
		return new RewardsPage();
	}
	
	public LoginPage clickOnSignOutLink() {
		signOutLink.click();
		return new LoginPage();
	}

}
