package TestPages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import TestBase.TestBase;

public class AssetSummary extends TestBase {

	

		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		public static String addedAssetName;
		
		@FindBy(xpath = "//span[contains(text(),'Asset Summary')]")
		WebElement assetSummaryOption;
		
		@FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[11]/div/div[1]")
	//	@FindBy(css = "div.container.ptPageWrap:nth-child(14) div.ptPageWrap:nth-child(2) div.pageMiddle.leftMenuExpand:nth-child(2) div.container-fluid.ptPageContent.ptPageMiddleWrap.panel-container.forAssetSectionRight div.panel-left.ui-resizable:nth-child(2) div.ptTreeViewWrap.csTreeAS:nth-child(1) div.fixed-size:nth-child(1) div.slimScrollDiv div.treeWrapper table.csTreeGrid.fancytree-container.fancytree-ext-table.ui-draggable-handle.fancytree-ext-glyph.fancytree-treefocus tbody:nth-child(3) tr.fancytree-active.fancytree-focused.fancytree-expanded.fancytree-has-children.fancytree-lastsib.fancytree-exp-el.fancytree-ico-e:nth-child(1) td:nth-child(11) div.dropdown.user-menu.treeThreeDotsWrap.open > div.dropdown-toggle.treeThreeDots")
		WebElement threeDots;
		@FindBy(xpath = "//span[contains(text(),'Asset Type:')]")
		WebElement assetTypeText;
		@FindBy(xpath = "//li/span[contains(text(),'Add')]")
		WebElement addAsset;
		@FindBy(xpath = "//input[@id='txtAssetProjName']")
		WebElement assetName;
		@FindBy(xpath = "//a[@id='btnModalSave']")
		WebElement assetSave;
		@FindBy(xpath = "//*[@id=\"ui-id-1_2\"]/td[3]/span/span[3]")
		WebElement addedAsset;
	
		
		public AssetSummary()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void addAssetAction() throws InterruptedException {
			
			 Thread.sleep(5000);
			Actions actions = new Actions(driver);
			actions.moveToElement(assetSummaryOption).click().perform();
			wait.until(ExpectedConditions.elementToBeClickable(assetSummaryOption));
			  assetSummaryOption.click();
			  
			  Thread.sleep(5000);
			  wait.until(ExpectedConditions.visibilityOf(assetTypeText));
			  String getAssetTypeText=assetTypeText.getText();
			  System.err.println(" Asset type text is: "+ getAssetTypeText);
			  
			  Thread.sleep(5000); 

			  clickByJs(3000, threeDots);
		
			  clickByJs(3000, addAsset);
			  
			  clickByJs(3000, assetName);
			  assetName.sendKeys("Asset- 22 Dec 22-1");
			
			  
			  clickByJs(3000, assetSave);
	
			  wait.until(ExpectedConditions.visibilityOf(addedAsset));
			   addedAssetName= addedAsset.getText();
			  System.err.println(addedAssetName);
			  
				 //return addedAssetName;
			}
			
			
		
		
}


