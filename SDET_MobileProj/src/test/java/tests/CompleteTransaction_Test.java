package tests;

import org.testng.annotations.Test;

import appFunctions.LoginPageActions;
import appFunctions.PageActions;
import base.BaseTest;
import locators.DemoWeb_Locators;

import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class CompleteTransaction_Test extends BaseTest {
	
	WebElement user;
	//Boolean flag = false;

	@Test
	public void verify_Transaction() throws InterruptedException {
		System.out.println("Running Transaction Test Case");
		PageActions.select_Product();
		PageActions.view_cart();
		PageActions.checkout();
		int size = driver.findElements(DemoWeb_Locators.orderNum_Text).size();
		assertEquals(size, 1,"Transaction Not Complete");
		//assertTrue(condition);
	}

	@BeforeMethod
	public void beforeMethod() throws MalformedURLException, InterruptedException {
		BaseTest.initialization();
		LoginPageActions.login();
		user = driver.findElement(DemoWeb_Locators.loggedIn_Details);
		assertEquals(user.getText(), "jhansitest9@gmail.com", "User Not Logged In");
		System.out.println("User Logged In Successfully");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
