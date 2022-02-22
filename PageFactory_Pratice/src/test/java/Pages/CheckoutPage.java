package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Proceed to Checkout']")
	WebElement clickcheckout;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement clickContinue;
	
	@FindBy(xpath="//a[text()='Confirm' and @class='Button']")
	WebElement clickConfirm;
	
	@FindBy(xpath="//li[text()='Thank you, your order has been submitted.']")
	WebElement text;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	WebElement signout;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkout()
	{
		clickcheckout.click();
	}
	
	public void clickContinue()
	{
		clickContinue.click();
	}
	
	public void clickconfirm()
	{
		clickConfirm.click();
	}
	public boolean istextPresent()
	{
		return text.isDisplayed();
	}
	public void clicksignout()
	{
		signout.click();
	}
}
