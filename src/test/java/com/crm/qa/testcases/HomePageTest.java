package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ilm.qa.base.TestBase;
import com.ilm.qa.pages.ChangePasswordPage;
import com.ilm.qa.pages.HomePage;
import com.ilm.qa.pages.LoginPage;
import com.ilm.qa.pages.PromotionsPage;
import com.ilm.qa.pages.RewardsPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	ChangePasswordPage changepasswordpage;
	PromotionsPage promopage;
	RewardsPage rewardspage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
/*	@Test (priority = 1)
	public void verifyUserNameTest() {
		Assert.assertTrue(homepage.correctUserName());
	}*/
	
	@Test(priority = 2)
	public void verifyUserRole() {
		Assert.assertTrue(homepage.correctuserrole());
	}
	
	@Test(priority = 3)
	public void changePasswordLinkTest() {
		changepasswordpage = homepage.clickOnChangePasswordLink();
	}
	
	@Test(priority = 4)
	public void signOutLinkTest() {
		loginpage = homepage.clickOnSignOutLink();
	}
	
	@Test(priority = 5)
	public void promotionsLinkTest() {
		promopage = homepage.clickOnPromotionsLink();
	}
	
	@Test(priority = 6)
	public void rewardsLinkTest() {
		rewardspage = homepage.clickOnRewardsLink();
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
