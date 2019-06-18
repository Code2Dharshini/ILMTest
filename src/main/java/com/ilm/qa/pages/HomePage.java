package com.ilm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ilm.qa.base.Testbase;

public class HomePage extends Testbase{
	
	@FindBy(xpath="//td[contains(text(), 'Welcome Dharshini S.')]")
	WebElement usernameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Change Password')]")
	WebElement changePasswordLink;
	
	@FindBy(xpath="//a[contains(text(), 'link_promotions')]")
	WebElement promotionsLink;
	
	@FindBy(xpath="//a[contains(text(), 'link_rewards')]")
	WebElement rewardsLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}
