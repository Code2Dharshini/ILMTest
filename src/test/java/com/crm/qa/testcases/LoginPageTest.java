package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ilm.qa.base.TestBase;
import com.ilm.qa.pages.ForgotPasswordPage;
import com.ilm.qa.pages.HomePage;
import com.ilm.qa.pages.LoginPage;
import com.ilm.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	ForgotPasswordPage forgotpasswordpage;
	
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
	public void forgotPasswordTest() {
		forgotpasswordpage = loginpage.forgotPassword();
	}
	
	@DataProvider
	public Object[][] getLoginTestData(){
		Object data[][] = TestUtil.getTestData("Login");
		return data;
	
	}
	@Test(dataProvider = "getLoginTestData", priority =4)
	public void loginTest(String loginEmail, String pwd) {
		
		//homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage = loginpage.login(loginEmail, pwd);
		if(homepage.correctUserName()) {
			System.out.println("Logged in successfully");}
			else{
				System.out.println("Invalid username or password");
			}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
