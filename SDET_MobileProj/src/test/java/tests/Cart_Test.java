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
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Cart_Test extends BaseTest {
	WebElement user;
	
	@Test
	public void verifyCart() {
		System.out.println("Running Cart Test Case");

		Boolean product_Found = false;
		String selected_Product = PageActions.select_Product();
		PageActions.view_cart();
		ArrayList<WebElement> products = (ArrayList<WebElement>) driver.findElements(DemoWeb_Locators.cart_products);
		for (WebElement pdt : products) {
			String product_Name = pdt.getText();
			if (product_Name.equalsIgnoreCase(selected_Product)) {
				product_Found = true;
				System.out.println("Cart productName: " + product_Name);
			}
		}
		assertTrue("Product Not found in Cart", product_Found);
	}

	@BeforeMethod
	public void beforeMethod() throws MalformedURLException, InterruptedException {
		BaseTest.initialization();
		LoginPageActions.login();
		user = driver.findElement(DemoWeb_Locators.loggedIn_Details);
		//user.getText()
		/*
		 * if(user != null) { System.out.println("User Logged In successfully"); }
		 */
		//Thread.sleep(2000);
		assertEquals(user.getText(), "jhansitest9@gmail.com", "User Not Logged In");
		System.out.println("User Logged In Successfully");
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
