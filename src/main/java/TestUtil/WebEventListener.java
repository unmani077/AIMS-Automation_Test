package TestUtil;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;



import TestBase.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener {

	public void beforeNavigateTo(String url, WebDriver driver)
	{
		System.out.println("Before naviagting to:" +url + " ");
	}
	public void afterNavigateTo(String url, WebDriver driver)
	{
		System.out.println("Navigated to:" +url + " ");
	}
	public void beforeChangeValueOf(WebElement element, WebDriver driver)
	{
		System.out.println("Value of the element" +element.toString()+ "before any changes made");
	}
	public void afterChangeValueOf(WebElement element, WebDriver driver)
	{
		System.out.println("Element value changed to:" +element.toString());
	}
	public void beforeClickOn(WebElement element, WebDriver driver)
	{
		System.out.println("Trying to click on: " +element.toString());
	}
	public void afterClickOn(WebElement element, WebDriver driver)
	{
		System.out.println("Clicked on: " +element.toString());
	}
	public void beforeNavigateBack(WebDriver driver)
	{
		System.out.println("Navigated back to previous page");
	}
	public void afterNavigateBack(WebDriver driver)
	{
		System.out.println("Navigated back to previous page");
	}
	public void beforeNavigateNext(WebDriver driver)
	{
		System.out.println("Navigated to the next page");
	}
	public void afterNavigateNext(WebDriver driver)
	{
		System.out.println("Navigated to the next page");
	}
	
	public void onException(Throwable error, WebDriver driver)
	{
		System.out.println("Exception occured: "+error);
		try
		{
			TestUtil.takeScreenshotAtEndOfTest();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void beforeFindBy(By by, WebElement element, WebDriver driver)
	{
		System.out.println("Trying to find Element by: "+by.toString());
	}
	public void afterFindBy(By by, WebElement element, WebDriver driver)
	{
		System.out.println("Found Element by: "+by.toString());
	}
	public void beforeScript(String script, WebDriver driver)
	{
		System.out.println("Before script: "+script.toString());
	}
	public void afterScript(String script, WebDriver driver)
	{
		System.out.println("After script: "+script.toString());
	}
	public void beforeAlertAccept(WebDriver driver)
	{
		System.out.println("Before alert accept");
	}
	public void afterAlertAccept(WebDriver driver)
	{
		System.out.println("After alert accept");
	}
	public void beforeAlertDismiss(WebDriver driver)
	{
		System.out.println(" ");
	}
	public void afterAlertDismiss(WebDriver driver)
	{
		System.out.println(" ");
	}
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend)
	{
		System.out.println(" ");
	}
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend)
	{
		System.out.println(" ");
	}
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}
}
