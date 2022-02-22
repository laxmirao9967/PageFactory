package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishPage {
	
	@FindBy(xpath="//*[@id='SidebarContent']/a[1]/img")
	WebElement clickOnFishLink;
	
//	@FindBy(xpath="//*[@id='SidebarContent']/a[5]/img")
//	WebElement clickOnBirdsLink;
//	
//	@FindBy(xpath="//*[@id='SidebarContent']/a[2]/img")
//	WebElement clickOnDogsLink;
	
	
	@FindBy(xpath="//td/a[text()='FI-SW-01']")
	WebElement clickOnAngelFish;
	
	@FindBy(xpath="//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a")
	WebElement largeAngelFishAddToCart1;
	
	@FindBy(xpath="//a/img[@src='../images/sm_fish.gif']")
	WebElement clickfish;
	
	@FindBy(xpath="//td/a[text()='FI-FW-02']")
	WebElement clickOnGoldFish;
	
	@FindBy(xpath="//*[@id='Catalog']/table/tbody/tr[3]/td[5]/a")
	WebElement FemaleGoldFishAddtoCart;
	
	WebDriver driver;
	
	public FishPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fishLink()
	{
		clickOnFishLink.click();
	}
	
	public void AngelFishLink()
	{
		clickOnAngelFish.click();
	}
	
	public void largeAngel()
	{
		largeAngelFishAddToCart1.click();
	}
	
	public void clickfish()
	{
		clickfish.click();
	}
	
	public void GoldFishLink()
	{
		clickOnGoldFish.click();
	}
	
	public void FemaleGoldFishAddtoCart()
	{
		FemaleGoldFishAddtoCart.click();
	}
	
	
//	public void birdLink()
//	{
//		clickOnBirdsLink.click();
//	}
//	
//	public void dogsLink()
//	{
//		clickOnDogsLink.click();
//	}

}
