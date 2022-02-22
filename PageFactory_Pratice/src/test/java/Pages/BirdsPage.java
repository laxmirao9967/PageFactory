package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BirdsPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a/img[@src='../images/sm_birds.gif']")
	WebElement BirdLink;
	
	@FindBy(xpath="//a[text()='AV-CB-01']")
	WebElement clickAmazonParrot;
	
	@FindBy(xpath="//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a")
	WebElement clickAddOnCart;
	
	public BirdsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickBirdLink()
	{
		BirdLink.click();
	}
	
	public void clickamazonParrot()
	{
		clickAmazonParrot.click();
	}
	
	public void clickAddtoCart()
	{
		clickAddOnCart.click();
	}

}
