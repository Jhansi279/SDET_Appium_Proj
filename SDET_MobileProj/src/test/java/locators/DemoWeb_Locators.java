package locators;

import org.openqa.selenium.By;

public class DemoWeb_Locators {

	public static By categories = By.xpath("//span[@class='icon']");
	public static By books = By.xpath("(//a[contains(text(),'Books')])[2]");
	public static By product_Book_Add_to_cart_Btn = By.xpath("//div[@class='product-item']//input[@value='Add to cart']");
	public static By product_Name = By.xpath("//div[@class='product-item']//input[@value='Add to cart']//ancestor::div[@class='details']//a");
	
	public static By cart_Icon = By.xpath("//span[text()='Shopping cart']") ;
	public static By cart_products = By.xpath("//table[@class='cart']//tbody/tr/td[@class='product']");
	
	public static By login_Icon = By.xpath("//a[text()='Log in']");
	public static By email_Textbox = By.xpath("//input[@id='Email']"); 
	public static By password_Textbox = By.xpath("//input[@id='Password']"); 
	public static By login_Btn = By.xpath("//input[@value='Log in']");
	public static By loggedIn_Details = By.xpath("//a[text()='jhansitest9@gmail.com']");
	
	public static By accept_Checkbox = By.xpath("//input[@id='termsofservice']");
	public static By checkout_Btn  = By.xpath("//button[@id='checkout']");
	
	public static By billingAddr_Cont_Btn  = By.xpath("//span[@id='billing-please-wait']//preceding-sibling::input[@title='Continue']");
	public static By ShippingAddr_Cont_Btn  = By.xpath("//span[@id='shipping-please-wait']//preceding-sibling::input[@title='Continue']");
	public static By ShippingMethod_Cont_Btn  = By.xpath("//span[@id='shipping-method-please-wait']//preceding-sibling::input[@value='Continue']");
	public static By PaymentMethod_Cont_Btn  = By.xpath("//span[@id='payment-method-please-wait']//preceding-sibling::input[@value='Continue']");
	public static By PaymentInfo_Cont_Btn  = By.xpath("//span[@id='payment-info-please-wait']//preceding-sibling::input[@value='Continue']");
	public static By Confirm_Btn  = By.xpath("//span[@id='confirm-order-please-wait']//preceding-sibling::input[@value='Confirm']");
	
	public static By orderNum_Text = By.xpath("//li[contains(text(),'Order number')]");
	
	
}
