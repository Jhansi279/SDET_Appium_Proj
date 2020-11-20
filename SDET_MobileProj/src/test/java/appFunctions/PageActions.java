package appFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import base.BaseTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import locators.DemoWeb_Locators;

public class PageActions extends BaseTest{

	
	
	public static String select_Product() {
		
		//Click on Categories
		driver.findElement(DemoWeb_Locators.categories).click();
		
		//Click on Books
		driver.findElement(DemoWeb_Locators.books).click();
		
		//[Select a book (the first one) ] 
		//Get the name of the book into a variable
		//click on Add to Cart 
		String productName = driver.findElement(DemoWeb_Locators.product_Name).getText();
		System.out.println("Selected productName: " + productName);
		driver.findElement(DemoWeb_Locators.product_Book_Add_to_cart_Btn).click();
		return productName;
	}
	
	public static void view_cart() {
		driver.findElement(DemoWeb_Locators.cart_Icon).click();
	}
	
	public static void checkout() throws InterruptedException {
		driver.findElement(DemoWeb_Locators.accept_Checkbox).click();
		driver.findElement(DemoWeb_Locators.checkout_Btn).click();
		
		
		//Scroll up the page
		TouchAction act = new TouchAction<>(driver);
		Dimension d = driver.manage().window().getSize();
		int width = d.width;
		int height = d.height;

		int x1 = width / 2;
		int y1 = 4 * height / 5;

		int x2 = width / 2;
		int y2 = height / 5;
		
		act.press(PointOption.point(x1, y1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(x2, y2)).release().perform();

		/*
		 * //Using findElements and size() to know if the element is present. If not, it
		 * will go inside while loop and swipe
		 * while(driver.findElements(By.xpath("//h3[text()='Information']")).size()==0){
		 * Thread.sleep(2000); act.press(PointOption.point(x1,
		 * y1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(
		 * PointOption.point(x2, y2)).release().perform(); }
		 */
		
		driver.findElement(DemoWeb_Locators.billingAddr_Cont_Btn).click();
		driver.findElement(DemoWeb_Locators.ShippingAddr_Cont_Btn).click();
		driver.findElement(DemoWeb_Locators.ShippingMethod_Cont_Btn).click();
		driver.findElement(DemoWeb_Locators.PaymentMethod_Cont_Btn).click();
		driver.findElement(DemoWeb_Locators.PaymentInfo_Cont_Btn).click();
		driver.findElement(DemoWeb_Locators.Confirm_Btn).click();
	}
	
	
	
	
	
}
