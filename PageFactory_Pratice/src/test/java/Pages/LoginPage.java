package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement loginLink;
	
	@FindBy(name="username")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(name="signon")
	WebElement loginbutton;
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogin()
	{
		loginLink.click();
	}
	
	public void clearUsername()
	{
		txt_username.clear();
	}
	

	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	
	public void clearPassword()
	{
		txt_password.clear();
	}
	
	public void enterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		loginbutton.click();
	}
}

