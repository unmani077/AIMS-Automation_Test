package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TestBase;



	public class HomePage extends TestBase {

		WebDriverWait wait = new WebDriverWait(driver,40);
		
		
		@FindBy(xpath="//span[@class='sideDashboardTxt active']")
		@CacheLookup
		WebElement dashboardOption;	
		@FindBy(xpath="//img[@src='/content/images/siLogo.png']")
		WebElement logoImage;	
		@FindBy(xpath="//span[@class='hidden-xs2']")
		WebElement loggedInName;	
	
	
		
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public String verifyLoginUsername() {

			wait.until(ExpectedConditions.elementToBeClickable(loggedInName));
			String loggedInUsername;
			loggedInUsername = loggedInName.getText();
			System.out.println("Logged in Username is: "+loggedInUsername);
			return loggedInUsername;
		}

		
}
