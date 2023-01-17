package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestPages.HomePage;

import TestBase.TestBase;

public class LoginPage extends TestBase {

	static WebDriverWait wait = new WebDriverWait(driver, 40);
	
	@FindBy(xpath = "//a[@id='btnAccept']")
	WebElement acceptCookies;
	@FindBy(xpath = "//input[@id='emailid']")
	WebElement emailIdBtn;
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='PTLogin']")
	WebElement loginBtn;
	@FindBy(xpath = "//img[@src='/content/images/siLogo.png']")
	static
	WebElement logo;

	

public LoginPage() {
	PageFactory.initElements(driver, this);
}

	public  HomePage loginto(String un, String pwd) {
		
		wait.until(ExpectedConditions.visibilityOf(acceptCookies));
		acceptCookies.click();
		wait.until(ExpectedConditions.visibilityOf(emailIdBtn));
		emailIdBtn.sendKeys(un);
		password.sendKeys(pwd);
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		loginBtn.click();

		return new HomePage();
	}	
	
	public static boolean validateLogo() {
		wait.until(ExpectedConditions.visibilityOf(logo));
		return logo.isDisplayed();
	}
}

