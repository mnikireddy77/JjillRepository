package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import testbase.TestBase;
import utilities.ElementOperations;
import utilities.Utility;
import java.util.List;

public class PLP_Search_CLT_STL_Functionality extends ElementOperations {

	WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
	static Utility util = new Utility();
	Actions action = new Actions(driver);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	Select select;

	// Object Repository

	@FindBy(xpath = "(//div[contains(@id,'product')])[2] /div /div[1]")
	WebElement selectitem;

	@FindBy(xpath = "(//span[contains(text(),'Quick Look')])[2]")
	WebElement btnquicklook;

	@FindBy(xpath = "(//div[contains(@id,'product')])[2] /div /div[1] /div[1]")
	WebElement pdp_btnmonetatebadges;

	@FindBy(xpath = "(//div[contains(@id,'product')])[2] /div /div[2] //button")
	WebElement plp_btncolorswatches;

	@FindBy(xpath = "(//div[contains(@id,'product')])[2] /div /div[2] /h6[1]")
	WebElement plp_oldCost;

	@FindBy(xpath = "(//div[contains(@id,'product')])[2] /div /div[2] /h6[2]")
	WebElement plp_updatedCost;

	@FindBy(xpath = "(//div[contains(@id,'product')])[2] /div /div[2] /div[2]/span")
	WebElement plp_reviews;

	@FindBy(xpath = "(//div[contains(@id,'product')])[7] /div /div[2] /a/h6")
	WebElement selectitemdescription;

	@FindBy(xpath = "//iframe[@frameborder='0']")
	WebElement promotionbox;

	@FindBy(css = "button[class*='offer-control close']")
	WebElement btnclose;

	@FindBy(xpath = "(//input[@id='searchInput'])[1]")
	WebElement txtSearch;

	@FindBy(xpath = "//ul[@data-ui='thumbnails'] /li[1]")
	WebElement searchresults;

	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[1] /div//button")
	List<WebElement> PDPSizeType;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]")
	WebElement txtCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li")
	List<WebElement> resultsCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li //div[@data-swipeable='true']//img")
	List<WebElement> imagesCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[1]")
	List<WebElement> itemdescCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[2]/div/div/div/span/span")
	List<WebElement> itemdeptCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[3]/div/div")
	List<WebElement> itemcolorCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[4]/div/div")
	List<WebElement> itemsizeCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[5]/div/div//span[text()='Add to Bag']")
	List<WebElement> itemATB_CTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[5]/div/div//a[text()='Full Details >']")
	List<WebElement> itemFullDetails_CTL;

	@FindBy(xpath = "//button[@title='L']")
	WebElement btnsize;

	@FindBy(xpath = "//button[@type='submit'][@data-th='add-to-cart']")
	WebElement btnaddtobag;

	@FindBy(xpath = "(//span[contains(text(),'View Shopping Bag')])[1]")
	WebElement btnviewshoppingcart;

	@FindBy(xpath = "(//div//span[@class='shop-link'])[2]")
	WebElement btnSTL;
	//*[@id=\"keylooks\"]/div[3]/a/div[2]/span
	//*[@id="keylooks"]/div[3]/a/div[2]/span
	//(//div//span[@class='shop-link'])[1]
	//#keylooks > div:nth-child(3) > a > div.link-wrap.text-right > span
	
	@FindBy(xpath = "//div[@class='hidden-xs'] /h3[contains(@class,'sub-head ')]")
	WebElement STLdesc;

	@FindBy(xpath = "(//div[contains(@class,'jjill-ratings-list jjill-responsive-ratings')])[2]")
	WebElement STLreviews;

	@FindBy(xpath = "(//ul[contains(@aria-label,'Size')])[1]")
	WebElement STLsizetype;

	@FindBy(xpath = "//span[contains(@id,'shoplook_swatch_selection_Color')]")
	WebElement STLcolorname;

	@FindBy(xpath = "(//ul[contains(@aria-label,'Color')])[2]")
	WebElement STLcolor;

	@FindBy(xpath = "//ul[contains(@aria-label,'Size')]")
	WebElement STLsize;

	@FindBy(xpath = "//img[@id='shoplookSwatch_Size_M']/..")
	WebElement STLsize_medium;

	@FindBy(xpath = "(//div[@title='Fit Predictor'] /div)[1]")
	WebElement STLfitpredictor;

	@FindBy(xpath = "//span[contains(text(),'Size')]")
	WebElement STLsizeguide;

	@FindBy(xpath = "//select[contains(@id,'quantity')]")
	WebElement STLqty;

	@FindBy(xpath = "//div[contains(text(),'Add to Bag')]")
	WebElement STLbtnATB;

	@FindBy(xpath = "//a[contains(text(),'Save For Later')]")
	WebElement STLsaveforlater;

	@FindBy(xpath = "//a[contains(text(),'Full Product Details >')]")
	WebElement STLfulldetails;

	@FindBy(xpath = "(//button[contains(@class,'next')])[3]")
	WebElement STLNextButton;

	@FindBy(xpath = "(//button[contains(@id,'close')])[1]")
	WebElement STLbtnClose;

	@FindBy(xpath = "//h3[contains(text(),'ADDED')]")
	WebElement txtATBConfirmation;

	public PLP_Search_CLT_STL_Functionality() {
		PageFactory.initElements(driver, this);
	}

	public LoginFunctionality validatePlpPage() throws InterruptedException {
		Reporter.log("Validating the PLP Started", true);
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		Assert.assertEquals(selectitem.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(btnquicklook.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(pdp_btnmonetatebadges.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(plp_btncolorswatches.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(selectitemdescription.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(plp_oldCost.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(plp_updatedCost.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(plp_reviews.isDisplayed(), true);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Reporter.log("PLP Validation Sucessful", true);
		// }
		return new LoginFunctionality();
	}

	public AddProduct_CheckoutFunctionality validateSearchFunctionality() throws InterruptedException {
		Reporter.log("Validating the Search Functionality Started", true);
		Thread.sleep(2000);

		try {
			if (promotionbox.isDisplayed()) {
				driver.switchTo().frame(promotionbox);
				btnclose.click();
				driver.switchTo().parentFrame();
				Thread.sleep(500);
			}
		} finally {
			txtSearch.click();
			readValuesForSearch("Search_Data", "Search");
			Reporter.log("Enter Search Data", true);
			txtSearch.sendKeys(TestBase.testData.get().getSearchData());
			Thread.sleep(500);
			searchresults.click();
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,300)");
			btnsize.click();
			Thread.sleep(500);
			jse.executeScript("window.scrollBy(0,250)");
			btnaddtobag.click();
			Thread.sleep(10);
			btnviewshoppingcart.click();
			Reporter.log("Seacrh Validation Sucessful", true);
		}
		return new AddProduct_CheckoutFunctionality();
	}

	public LoginFunctionality validateCompletetheLook() throws InterruptedException {
		Reporter.log("Validating Complete the Look Functionality Started", true);
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			if (promotionbox.isDisplayed()) {
				driver.switchTo().frame(promotionbox);
				btnclose.click();
				driver.switchTo().parentFrame();
				Thread.sleep(500);
			}
		} finally {
			txtSearch.click();
			readValuesForSearch("Search_Data", "CTL");
			Reporter.log("Enter CTL Data", true);
			txtSearch.sendKeys(TestBase.testData.get().getSearchData());
			Thread.sleep(200);
			Assert.assertEquals(searchresults.isDisplayed(), true);
			Thread.sleep(100);
			searchresults.click();
			Thread.sleep(100);
			jse.executeScript("window.scrollBy(0,700)");
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(500);
			jse.executeScript("window.scrollBy(0,600)");
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(100);
			Assert.assertEquals(txtCTL.isDisplayed(), true);
			Thread.sleep(20);
			int size = resultsCTL.size();
			// Assert.assertEquals(size, 4);
			Thread.sleep(20);
			int imgsize = imagesCTL.size();
			// Assert.assertEquals(imgsize, 24);
			// jse.executeScript("window.scrollBy(0,400)");
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			for (int i = 0; i < size; i++) {
				// System.out.println(itemdescCTL.get(i).getText());
				Reporter.log(itemdescCTL.get(i).getText(), true);
				Thread.sleep(20);
				Assert.assertEquals(itemdeptCTL.get(i).isDisplayed(), true);
				Thread.sleep(20);
				Assert.assertEquals(itemcolorCTL.get(i).isDisplayed(), true);
				Thread.sleep(20);
				Assert.assertEquals(itemsizeCTL.get(i).isDisplayed(), true);
				Thread.sleep(20);
				Assert.assertEquals(itemATB_CTL.get(i).isDisplayed(), true);
				Thread.sleep(20);
				Assert.assertEquals(itemFullDetails_CTL.get(i).isDisplayed(), true);
			}
			Thread.sleep(20);
			for (int j = 0; j < 6; j++) {
				action.sendKeys(Keys.PAGE_UP).build().perform();
				Thread.sleep(20);
			}
			Thread.sleep(1000);
			Reporter.log("Complete the Look Functionality Sucessfully", true);
		}
		return new LoginFunctionality();
	}

	public LoginFunctionality validatePDPCompletetheLook() throws InterruptedException {
		Reporter.log("Validating PDP and Complete the Look Size Functionality Started", true);
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			if (promotionbox.isDisplayed()) {
				driver.switchTo().frame(promotionbox);
				btnclose.click();
				driver.switchTo().parentFrame();
				Thread.sleep(500);
			}
		} finally {
			txtSearch.click();
			readValuesForSearch("Search_Data", "CTL");
			Reporter.log("Enter CTL Data", true);
			txtSearch.sendKeys(TestBase.testData.get().getSearchData());
			Thread.sleep(200);
			Assert.assertEquals(searchresults.isDisplayed(), true);
			Thread.sleep(100);
			searchresults.click();
			Thread.sleep(100);
			int sizetype = PDPSizeType.size();
			for (int j = 0; j < sizetype; j++) {
				PDPSizeType.get(j).click();
				String PDPsizetype = PDPSizeType.get(j).getAttribute("title");
				jse.executeScript("window.scrollBy(0,700)");
				action.sendKeys(Keys.PAGE_DOWN).build().perform();
				Thread.sleep(500);
				jse.executeScript("window.scrollBy(0,600)");
				// action.sendKeys(Keys.PAGE_DOWN).build().perform();
				Thread.sleep(100);
				Assert.assertEquals(txtCTL.isDisplayed(), true);
				Thread.sleep(20);
				int size = resultsCTL.size();
				Thread.sleep(20);
				int imgsize = imagesCTL.size();
				action.sendKeys(Keys.PAGE_DOWN).build().perform();
				for (int i = 0; i < size; i++) {
					Reporter.log(itemdescCTL.get(i).getText(), true);
					Thread.sleep(20);
					Assert.assertEquals(itemdeptCTL.get(i).isDisplayed(), true);
					Thread.sleep(20);
					if (itemdeptCTL.get(i).getText().equalsIgnoreCase(PDPsizetype)
							|| itemdeptCTL.get(i).getText().equalsIgnoreCase("Shoes & Accessories"))
						Reporter.log("Size Type validation in PDP and Complete the Look is matching", true);
					Thread.sleep(20);
				}
				for (int k = 0; k < 6; k++) {
					action.sendKeys(Keys.PAGE_UP).build().perform();
					Thread.sleep(20);
				}
			}

			Thread.sleep(1000);
			Reporter.log("Complete the Look Size validation Functionality validated Sucessfully", true);
		}
		return new LoginFunctionality();
	}

	public LoginFunctionality validateSTLPlpPage() throws InterruptedException {
		Reporter.log("Adding STL item to Bag", true);
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,810)");
		Thread.sleep(1000);
		/*
		 * jse.executeScript("window.scrollBy(0,800)"); Thread.sleep(1000);
		 */
		try {
			if (promotionbox.isDisplayed()) {
				driver.switchTo().frame(promotionbox);
				btnclose.click();
				driver.switchTo().parentFrame();
				Thread.sleep(50);
			}
		} finally {
			btnSTL.click();
			Thread.sleep(10000);
			Assert.assertEquals(STLdesc.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLreviews.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLsizetype.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLcolorname.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLcolor.isDisplayed(), true);
			Thread.sleep(20);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Assert.assertEquals(STLsize.isDisplayed(), true);
			Thread.sleep(40);
			STLsize_medium.click();
			Thread.sleep(1000);
			Assert.assertEquals(STLsizeguide.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLfitpredictor.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLqty.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLbtnATB.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLsaveforlater.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLfulldetails.isDisplayed(), true);
			Thread.sleep(20);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Assert.assertEquals(STLNextButton.isDisplayed(), true);
			Thread.sleep(20);
			STLbtnATB.click();
			Thread.sleep(1000);
			action.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(1000);
			action.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(1000);
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
			}
			Assert.assertEquals(txtATBConfirmation.getText(), "ADDED TO BAG");
			STLbtnClose.click();
			for (int i = 0; i < 10; i++) {
				Thread.sleep(100);
				action.sendKeys(Keys.PAGE_UP).build().perform();
			}

			Reporter.log("Added STL item to Bag sucesfully", true);
		}
		//}
		return new LoginFunctionality();
	}

	public static void readValuesForSearch(String sheetName, String scenario) {
		Reporter.log("Fetch the search data", true);
		TestBase.testData.get().setSearchData(util.readCellValue(sheetName, scenario, "SearchData"));
		Reporter.log("Fetched search data from the test data sheet successfully", true);
	}
}
