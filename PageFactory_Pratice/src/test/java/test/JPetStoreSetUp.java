package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BirdsPage;
import Pages.CheckoutPage;
import Pages.FishPage;
import Pages.LoginPage;


public class JPetStoreSetUp {
	
	Properties prop;
	WebDriver driver;
	LoginPage login;
	FishPage fish;
	BirdsPage birds;
	CheckoutPage checkout;
	
	
	@BeforeTest
	public void setup() throws IOException
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\laxmisrinivas.tanav\\eclipse-workspace\\PageFactory_Pratice\\src\\test\\java\\config\\config.properties");
		prop = new Properties();
		prop.load(fi);
		String browserName= prop.getProperty("browser");
		String driverpath= prop.getProperty("driver_path");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverpath);
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driverpath);
			driver=new FirefoxDriver();
		}else 
		{
			System.setProperty("webdriver.ie.driver", driverpath);
			driver=new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=0)
	public void loginPage()
	{
		
		login=new LoginPage(driver);
		login.clickOnLogin();
		login.clearUsername();
		login.enterUsername("j2ee");
		login.clearPassword();
		login.enterPassword("j2ee");
		login.clickLoginButton();
	}
	
	@Test(priority=1)
	public void fishsPage()
	{
		fish=new FishPage(driver);
		fish.fishLink();
		fish.AngelFishLink();
		fish.largeAngel();
		fish.clickfish();
		fish.GoldFishLink();
		fish.FemaleGoldFishAddtoCart();
		
	}
	
	@Test(priority=2)
	public void birdspage()
	{
		birds=new BirdsPage(driver);
		birds.clickBirdLink();
		birds.clickamazonParrot();
		birds.clickAddtoCart();
		
	}
	
	@Test(priority=3)
	public void checkout()
	{
		checkout=new CheckoutPage(driver);
		checkout.checkout();
		checkout.clickContinue();
		checkout.clickconfirm();
		Assert.assertTrue(checkout.istextPresent());
		checkout.clicksignout();
	}

}
