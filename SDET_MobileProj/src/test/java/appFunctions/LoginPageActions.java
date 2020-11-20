package appFunctions;

import base.BaseTest;
import locators.DemoWeb_Locators;

public class LoginPageActions extends BaseTest {
	
	public static void login() throws InterruptedException {
		driver.findElement(DemoWeb_Locators.login_Icon).click();
		driver.findElement(DemoWeb_Locators.email_Textbox).sendKeys("jhansitest9@gmail.com");
		Thread.sleep(500);
		System.out.println("Email entered: "+driver.findElement(DemoWeb_Locators.email_Textbox).getAttribute("value"));
		driver.findElement(DemoWeb_Locators.password_Textbox).click();
		Thread.sleep(500);
		driver.hideKeyboard();
		
		driver.findElement(DemoWeb_Locators.password_Textbox).sendKeys("Sais@279");
		driver.hideKeyboard();
		driver.findElement(DemoWeb_Locators.login_Btn).click();
		
	}

}
