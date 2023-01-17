package TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestUtil.TestUtil;
import TestBase.TestBase;
import TestPages.AssetSummary;
import TestPages.HomePage;
import TestPages.LoginPage;
import com.beust.jcommander.Parameter;

public class addAssetTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	AssetSummary assetSummary;
	

	public addAssetTest() {
		super();
	}
	

	@BeforeClass()
	@Parameters("Browser")
	
	public void setUp(String browsername) throws IOException 
	{	
		try 
		{
			Initialization(browsername);
			loginPage = new LoginPage();
			homePage= new HomePage();
			assetSummary= new AssetSummary();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	 
	
	
	@Test(priority = 1)
	public void verifyLoginTest() 
	{
		try {
			homePage= loginPage.loginto(prop.getProperty("Username"),
				prop.getProperty("Password"));
			Assert.assertEquals(homePage.verifyLoginUsername(), "Test User");
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	@Test(priority = 2)
	public void validateLogoTest() 
	{
		try {
			boolean logo = loginPage.validateLogo();
			Assert.assertTrue(logo);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
	}
	
	@Test(priority = 3)
	public void validateAddAsset() 
	{
		try {
			
			assetSummary.addAssetAction();
			Assert.assertEquals("Asset- 17 Jan 23", assetSummary.addedAssetName);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		
	}


	
	
	
	
}
