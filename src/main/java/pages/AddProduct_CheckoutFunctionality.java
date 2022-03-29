package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import testbase.TestBase;
import utilities.ElementOperations;
import utilities.Utility;

public class AddProduct_CheckoutFunctionality extends ElementOperations {

	WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
	static Utility util = new Utility();
	Actions action = new Actions(driver);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	Select select;

	// Object Repository

	@FindBy(xpath = "//iframe[@frameborder='0']")
	WebElement promotionbox;

	@FindBy(css = "button[class*='offer-control close']")
	WebElement btnclose;
	@FindBy(css = "a[class= 'toplevel main-menu-link'][href='/shop/womens-clothing']")
	WebElement drpClothing;

	@FindBy(xpath = "(//div[contains(@id,'New_Arrivals')] /div/a)[1]")
	WebElement drpNewArrivals;

	@FindBy(xpath = "(//a[contains(text(),'Must-Have Outfits')])[1]")
	WebElement department_STL;

	@FindBy(css = "a[class= 'toplevel main-menu-link'][href='/sale']")
	WebElement drpSale;

	@FindBy(xpath = "(//a[contains(text(),'All Clothing')])[1]")
	WebElement department_AllClothing;

	@FindBy(xpath = "(//a[contains(text(),'Knit Tops & Tees')])[1]")
	WebElement department_knitTops;
	
	@FindBy(xpath = "//div[text()='bag']")
	WebElement btn_headershoppingbag;

	@FindBy(xpath = "//div[contains(@id,'layout')]")
	List<WebElement> productcount;

	@FindBy(xpath = "//div[contains(@id,'layout')]/div[2]/div/div/div/div[1]/div/a[2]")
	List<WebElement> removebutton;

	@FindBy(xpath = "(//div[contains(@id,'product')])[2] /div /div[1]")
	WebElement selectitem;

	@FindBy(xpath = "//button[@title='L']")
	WebElement btnsize;

	@FindBy(xpath = "//button[@type='submit'][@data-th='add-to-cart']")
	WebElement btnaddtobag;

	@FindBy(xpath = "//p[contains(text(),'Estimated total')]/span")
	WebElement txtEstimatedTotal;

	@FindBy(xpath = "//span[@id='totalPrice']")
	WebElement txtEstimatedTotalchkout;

	@FindBy(xpath = "(//span[contains(text(),'View Shopping Bag')])[1]")
	WebElement btnviewshoppingcart;
	
	@FindBy(css = "button#start_checkout")
	WebElement btncheckout;

	@FindBy(css = "div[class*='new-address'] a")
	WebElement btnaddress;

	@FindBy(css = "input[name='firstName']")
	WebElement txtfirstName;

	@FindBy(css = "input[name='lastName']")
	WebElement txtlastName;

	@FindBy(css = "input[name='address1']")
	WebElement txtaddress;

	@FindBy(css = "input[name='zipCode']")
	WebElement txtzipCode;

	@FindBy(css = "input[name='city']")
	WebElement txtcity;

	@FindBy(css = "input[name='phone1']")
	WebElement txtPhoneNumber;

	@FindBy(css = "button[id='buttoninspl']")
	WebElement btnaddAddress;

	@FindBy(css = "//input[contains(@aria-label,'standard')] /../span")
	WebElement btnstandard;

	@FindBy(xpath = "//button[contains(@aria-label,'PROCEED')]")
	WebElement btnpayment;

	@FindBy(css = "img[alt*='logo']")
	WebElement btnLogo;

	@FindBy(xpath = "(//label[@class='jjill-checkbox'])[2] /span")
	WebElement chkjjillcc;

	@FindBy(xpath = "(//input[contains(@aria-label,'card number')])[2]")
	WebElement txtcardnumber;

	@FindBy(css = "select[id*='state']")
	WebElement drpdownstate;


	@FindBy(xpath = "//label[@class='jjill-checkbox'] /input[@name='billingAddrChk'] /../span")
	WebElement chkboxbillingaddress;

	@FindBy(xpath = "//input[@id='savethiscard'] /../span")
	WebElement btndontsavecreditcard;

	@FindBy(xpath = "(//button[contains(@aria-label,'review')])[1]")
	WebElement btnReview;
	
	@FindBy(xpath = "//h2[contains(text(),'order review')]")
	WebElement txtreview;

	@FindBy(xpath = "(//button[contains(@id,'place_order')])[1]")
	WebElement btnplaceorder;

	@FindBy(xpath = "//div[contains(text(),'ORDER!')]")
	WebElement txtorder;

	@FindBy(xpath = "//div[contains(@class,'order-info')] /p/span")
	WebElement txtOrderNumber;



	public AddProduct_CheckoutFunctionality() {
		PageFactory.initElements(driver, this);
	}

	// Select Department
	public AddProduct_CheckoutFunctionality selectClothingDepartment() throws InterruptedException {
		Reporter.log("Select the department", true);
		Thread.sleep(4000);
		try {
			if (promotionbox.isDisplayed()) {
				Thread.sleep(500);
				driver.switchTo().frame(promotionbox);
				btnclose.click();
				driver.switchTo().parentFrame();
				Thread.sleep(50);
			}
		} finally {
			action.moveToElement(drpClothing).moveToElement(department_knitTops).click().perform();
			Thread.sleep(1000);
			Reporter.log("Selected the department sucessfully", true);
		}
		return this;
	}

		public AddProduct_CheckoutFunctionality selectSaleDepartment() throws InterruptedException {
		Reporter.log("Select the department", true);
		Thread.sleep(3000);
		try {
			if (promotionbox.isDisplayed()) {
				driver.switchTo().frame(promotionbox);
				btnclose.click();
				driver.switchTo().parentFrame();
			}
		} finally {
			Thread.sleep(3000);
			action.moveToElement(drpSale).perform();
			action.clickAndHold(department_AllClothing).release().perform();
			Reporter.log("Selected the department sucessfully", true);
		}
		return this;
	}

	public AddProduct_CheckoutFunctionality selectSTLDepartment() throws InterruptedException {
		Reporter.log("Select the department", true);
		Thread.sleep(5000);
		try {
			if (promotionbox.isDisplayed()) {
				driver.switchTo().frame(promotionbox);
				btnclose.click();
				driver.switchTo().parentFrame();
				Thread.sleep(100);
			}
		} finally {
			action.moveToElement(drpNewArrivals).perform();
			action.clickAndHold(department_STL).release().perform();
			Reporter.log("Selected the department sucessfully", true);
		}
		return new AddProduct_CheckoutFunctionality();
	}

	// Select Department

	public AddProduct_CheckoutFunctionality selectItemDetails() throws InterruptedException {
		Reporter.log("Select the Item", true);
		driver.switchTo().frame(promotionbox);
		btnclose.click();
		driver.switchTo().parentFrame();
		Thread.sleep(50);
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		action.click(selectitem).perform();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		jse.executeScript("window.scrollBy(0,450)");
		btnsize.click();
		jse.executeScript("window.scrollBy(0,300)");
		btnaddtobag.click();
		String total = txtEstimatedTotal.getText();
		btnviewshoppingcart.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String chkoutTotal = txtEstimatedTotalchkout.getText();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("Selected the Item sucessfully", true);
		return this;
	}

	public AddProduct_CheckoutFunctionality checkoutProcess() throws InterruptedException {
		Reporter.log("Checkout Process Started", true);
		Thread.sleep(10);
		btncheckout.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("Checkout Process Completed", true);
		return new AddProduct_CheckoutFunctionality();
	}

	public AddProduct_CheckoutFunctionality addnewAddress() throws InterruptedException {
		btnaddress.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		readValuesForAddress("Address_Fields", "Address");
		Thread.sleep(500);
		txtfirstName.sendKeys(TestBase.testData.get().getFirstName());
		Thread.sleep(500);
		txtlastName.sendKeys(TestBase.testData.get().getLastName());
		Thread.sleep(500);
		txtaddress.sendKeys(TestBase.testData.get().getstreetAddress());
		Thread.sleep(500);
		txtzipCode.sendKeys(TestBase.testData.get().getZipCode());
		Thread.sleep(500);
		txtcity.sendKeys(TestBase.testData.get().getCity());
		Thread.sleep(500);
		select = new Select(drpdownstate);
		select.selectByVisibleText("Ohio");
		Thread.sleep(500);
		chkboxbillingaddress.click();
		Thread.sleep(500);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		txtPhoneNumber.sendKeys(TestBase.testData.get().getPhoneNumber());
		Thread.sleep(500);
		btnaddAddress.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("Address added sucessfully", true);
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		return new AddProduct_CheckoutFunctionality();
	}

	public LoginFunctionality navigateToHomePage() {
		Reporter.log("Navigate to Home Page", true);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		btnLogo.click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		return new LoginFunctionality();
	}

	public AddProduct_CheckoutFunctionality savedaddress_paymentPage_addnewJjillCC() throws InterruptedException {
		Reporter.log("Payment Process Started", true);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		// jse.executeScript("window.scrollBy(0,600)");
		// remove all added cards.
		chkjjillcc.click();
		// btnaddnewcard.click();
		readValuesForcards("Cards", "Cards");
		txtcardnumber.sendKeys(TestBase.testData.get().getJJILLCC());
		Thread.sleep(500);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		btndontsavecreditcard.click();
		Thread.sleep(200);
		btnReview.click();
		Reporter.log("Payment Process Completed", true);
		return new AddProduct_CheckoutFunctionality();
	}

	public AddProduct_CheckoutFunctionality newaddress_paymentPage_addnewJjillCC() throws InterruptedException {
		// jse.executeScript("window.scrollBy(0,600)");
		Reporter.log("Payment Process Started", true);
		btnpayment.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		jse.executeScript("window.scrollBy(0,600)");
		// btnaddnewcard.click();
		Thread.sleep(500);
		chkjjillcc.click();
		Thread.sleep(500);
		readValuesForcards("Cards", "Cards");
		txtcardnumber.click();
		txtcardnumber.sendKeys(TestBase.testData.get().getJJILLCC());
		Thread.sleep(50);
		// chkshippingAddress.click();
		Thread.sleep(500);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		// btnAdd.click();
		// Thread.sleep(500);
//					btnjillcard.click();
		// Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,600)");
		btnReview.click();
		Reporter.log("Payment Process Completed", true);
		Thread.sleep(1000);
		return new AddProduct_CheckoutFunctionality();
	}

	public AddProduct_CheckoutFunctionality orderReview_PlaceOrder() throws InterruptedException {
		Reporter.log("Review Page", true);
		if (txtreview.isDisplayed()) {
			jse.executeScript("window.scrollBy(0,600)");
			btnplaceorder.click();
		}
		Reporter.log("Order Placed Sucessfully ", true);
		return new AddProduct_CheckoutFunctionality();
	}

	public AddProduct_CheckoutFunctionality ReviewOrderDetails() throws InterruptedException {
		Reporter.log("Review Order Details Page", true);
		if (txtorder.isDisplayed()) {
			String ordernumber = txtOrderNumber.getText();
		}
		Reporter.log("Order Placed Sucessfully ", true);
		return new AddProduct_CheckoutFunctionality();
	}

	public LoginFunctionality ConnectingMethod() throws InterruptedException {

		try {
			if (promotionbox.isDisplayed()) {
				Thread.sleep(500);
				driver.switchTo().frame(promotionbox);
				btnclose.click();
				driver.switchTo().parentFrame();
				Thread.sleep(50);
			}
		} finally {
			Thread.sleep(1000);
		}
		return new LoginFunctionality();
	}

	public Header_Footer_Functionality ConnectingMethodLogin_Header() throws InterruptedException {
		Thread.sleep(1000);
		return new Header_Footer_Functionality();
	}

	public PDP_QuickLook_Functionality ConnectingMethodLogin_PDP() throws InterruptedException {
		Thread.sleep(1000);
		return new PDP_QuickLook_Functionality();
	}

	public PLP_Search_CLT_STL_Functionality ConnectingMethodLogin_PLP() throws InterruptedException {
		Thread.sleep(1000);
		return new PLP_Search_CLT_STL_Functionality();
	}

	public Pagination_Monetate ConnectingMethodLogin_Pagination() throws InterruptedException {
		Thread.sleep(1000);
		return new Pagination_Monetate();
	}

	public static void readValuesForcards(String sheetName, String scenario) {
		Reporter.log("Fetch the Cards value from the test data sheet and set it", true);
		TestBase.testData.get().setJJILLCC(util.readCellValue(sheetName, scenario, "JJILLCC"));
		Reporter.log("Card values fetches sucessfully", true);
	}

	public static void readValuesForAddress(String sheetName, String scenario) {
		Reporter.log("Fetch the Address Fields from the test data sheet and set it", true);
		TestBase.testData.get().setStreetAddress(util.readCellValue(sheetName, scenario, "streetAddress"));
		TestBase.testData.get().setZipCode(util.readCellValue(sheetName, scenario, "zipCode"));
		TestBase.testData.get().setCity(util.readCellValue(sheetName, scenario, "city"));
		TestBase.testData.get().setFirstName(util.readCellValue(sheetName, scenario, "firstName"));
		TestBase.testData.get().setLastName(util.readCellValue(sheetName, scenario, "lastName"));
		TestBase.testData.get().setPhoneNumber(util.readCellValue(sheetName, scenario, "phoneNumber"));
		Reporter.log("Fetched the Address Fields from the test data sheet", true);
	}
	
	// select shopping bag
		public AddProduct_CheckoutFunctionality selectshoppingbag() throws InterruptedException {
			Reporter.log("Select the shoppingbag", true);
			Thread.sleep(4000);
			try {
				if (promotionbox.isDisplayed()) {
					Thread.sleep(500);
					driver.switchTo().frame(promotionbox);
					btnclose.click();
					driver.switchTo().parentFrame();
					Thread.sleep(50);
				}
			} finally {
				btn_headershoppingbag.click();
				// action.moveToElement(drpClothing).moveToElement(department_knitTops).click().perform();
				Thread.sleep(1000);
				Reporter.log("Selected shopping bag", true);
			}
			return this;
		}

		public AddProduct_CheckoutFunctionality removeProductsShoppingbag() throws InterruptedException {
				Reporter.log("Removing Items from shopping bag started", true);
				Thread.sleep(4000);
				jse.executeScript("window.scrollBy(0,300)");
				try {
					for (int j = 0; j < 5; j++) {
						for (int i = 0; i <= productcount.size(); i++) {
							removebutton.get(i).click();
							Thread.sleep(7000);
						}
						jse.executeScript("window.scrollBy(0,-700)");
					}
				} finally {
					if (productcount.size() != 0) {
						jse.executeScript("window.scrollBy(0,-900)");
						for (int i = 0; i <= productcount.size(); i++) {
							Thread.sleep(2000);
							removebutton.get(i).click();
							Thread.sleep(3000);
						}

					} else {
						Reporter.log("Removed all the products from shopping bag", true);
					}
				}
				
				return this;
			}


}
