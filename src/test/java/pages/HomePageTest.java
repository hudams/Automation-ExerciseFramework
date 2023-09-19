package pages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test 
	public void test () throws InterruptedException {
		homePage.clickLogo();
		homePage.clickLoginButton();
//		homePage.clickNewUserName();
//		homePage.clickNewUserEmail();
		homePage.InputNewUserNameAndEmailThenClickSignupButton();
	}
}
