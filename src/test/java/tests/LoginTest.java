package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	String username = "admin@yourstore.com";
	String password = "admin";

	@Test
	public void testValidLogin() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickLoginButton();
		System.out.println("Title of the page is: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");

	}
}
