package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.ilm.qa.base.Testbase;
import com.ilm.qa.pages.HomePage;
import com.ilm.qa.pages.LoginPage;

public class LoginPageTest extends Testbase{
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority =1)
	public void validateLoginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "mercatus Administration");
	}
	
	@Test(priority =2)
	public void ilmLogoTest() {
		boolean flag = loginpage.validateMercatusLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority =3)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
