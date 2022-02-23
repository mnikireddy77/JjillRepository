package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.ElementOperations;
import utilities.Utility;

public class Header_Footer_Functionality extends ElementOperations {

	WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
	static Utility util = new Utility();
	Actions action = new Actions(driver);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	Select select;
	
	//Object Repository
	
	@FindBy(xpath = "//iframe[@frameborder='0']")
	WebElement promotionbox;
	
	@FindBy(css = "button[class*='offer-control close']")
	WebElement btnclose;
	
	@FindBy(xpath = "(//div[contains(@id,'New_Arrivals')] /div/a)[1]")
	WebElement btn_headernewarrivals;
	
	@FindBy(xpath = "//span[contains(text(),'New')]")
	WebElement newarrivalsbreadcrumbs;
	
	@FindBy(xpath = "(//div[contains(@id,'Clothing')] /div/a)[1]")
	WebElement btn_headerclothing;
	
	   @FindBy(xpath = "//span[contains(text(),'Clothing')]")
		WebElement clothingbreadcrumbs;

	@FindBy(xpath = "(//div[contains(@id,'Shoes')] /div/a)[1]")
		WebElement btn_headershoes;

	@FindBy(xpath = "(//span[contains(text(),'Shoes')])[1]")
		WebElement shoesbreadcrumbs;

	@FindBy(xpath = "(//div[contains(@id,'Collections')] /div/a)[1]")
		WebElement btn_headerinspiration;

		@FindBy(xpath = "//li[contains(text(),'Inspiration')]")
		WebElement inspirationbreadcrumbs;

		@FindBy(xpath = "(//div[contains(@id,'Sale')] /div/a)[1]")
		WebElement btn_headersale;

		@FindBy(xpath = "//span[contains(text(),'Sale')]")
		WebElement salebreadcrumbs;

		@FindBy(xpath = "(//a[contains(text(),'stores')])[2]")
		WebElement btn_headerstores;

		@FindBy(xpath = "//li[contains(text(),'Store')]")
		WebElement storebreadcrumbs;

		@FindBy(css = "path[class*='jjill-logo']")
		WebElement headerlogo;    
		
		@FindBy(xpath = "(//img[contains(@alt,'logo')])[1]")
		WebElement Storestologo;
		
		@FindBy(xpath = "//div[text()='bag']")
		WebElement btn_headershoppingbag;

		@FindBy(xpath = "//button[@name='profile-button']")
		WebElement btn_headerprofilebutton;
		
		@FindBy(xpath = "//p[contains(text(),'NEED HELP?')]")
		WebElement txt_FooterNeedHelp;

		@FindBy(xpath = "(//H6[contains(text(),'CUSTOMER SERVICE')])[1]")
		WebElement txt_FooterCustomerService;

		@FindBy(xpath = "(//H6[contains(text(),'ABOUT')])[1]")
		WebElement txt_FooterAboutJJILL;

		@FindBy(xpath = "(//H6[contains(text(),'GIFT')])[1]")
		WebElement txt_FooterGiftCard;

		@FindBy(xpath = "(//H6[contains(text(),'CREDIT')])[1]")
		WebElement txt_FooterCreditCard;

		@FindBy(xpath = "//a[contains(text(),'email')]")
		WebElement btn_FooterEmailus;

		@FindBy(xpath = "//button[@type='button'][@aria-label='Send Message']")
		WebElement btn_emailus;

		@FindBy(xpath = "//form //input[@id='subject']")
		WebElement FooterEmailpopup;

		@FindBy(xpath = "//a[contains(text(),'Chat')]")
		WebElement btn_FooterChat;

		@FindBy(xpath = "	//button[@aria-label='Chat Now']")
		WebElement Footerchatpopupbutton;

		@FindBy(xpath = "//p[contains(text(),'Call')]")
		WebElement btn_FooterCallus;

		@FindBy(xpath = "//div[contains(text(),'Feedback')]")
		WebElement btn_FooterFeedback;

		@FindBy(xpath = "(//a[contains(@href,'contact')])[1]")
		WebElement btn_FooterContactUs;

		@FindBy(xpath = "	//button[@id=\"contactus_email\"]")
		WebElement FooterContactUsPage;

		@FindBy(xpath = "(//a[contains(@href,'faqs')])[1]")
		WebElement btn_FooterFAQ;

		@FindBy(xpath = "//h2[text()=\"CONTACT INFORMATION\"]")
		WebElement FooterFAQpage;

		@FindBy(xpath = "(//a[contains(@href,'OrderStatus')])[1]")
		WebElement btn_FooterOrderStatus;

		@FindBy(xpath = "//h1[contains(text(),'Order History')]")
		WebElement FooterOrderStatuspage;

		@FindBy(xpath = "(//a[contains(@href,'request')])[1]")
		WebElement btn_FooterRequestCatalog;

		@FindBy(xpath = "//h1[contains(text(),'Catalog')]")
		WebElement FooterRequestCatalogpage;

		@FindBy(xpath = "(//a[contains(@href,'shipping')])[1]")
		WebElement btn_FooterShipping;

		@FindBy(xpath = "//div[contains(text(),'Shipping')]")
		WebElement FooterShippingpage;

		@FindBy(xpath = "(//a[contains(@href,'returns')])[1]")
		WebElement btn_FooterReturns;

		@FindBy(xpath = "//h1[contains(text(),'Returns')]")
		WebElement FooterReturnspage;

		@FindBy(xpath = "(//a[contains(@href,'perfect-fit')])[1]")
		WebElement btn_FooterSizeGuide;

		@FindBy(xpath = "(//h1[contains(text(),'FIT')])[1]")
		WebElement FooterSizeGuidepage;

		@FindBy(xpath = "(//a[contains(@href,'coupons')])[1]")
		WebElement btn_FooterSpecialOffer;

		@FindBy(xpath = "//h1[contains(text(),'offers')]")
		WebElement FooterSpecialOfferpage;

		@FindBy(xpath = "(//a[contains(@href,'privacy')])[1]")
		WebElement btn_FooterDoNotSell;

		@FindBy(xpath = "(//a[contains(@href,'terms')])[1]")
		WebElement btn_FooterTermsofUse;

		@FindBy(xpath = "(//a[contains(@href,'privacy')])[1]")
		WebElement btn_FooterPrivacy;

		@FindBy(xpath = "(//a[contains(@href,'about')])[1]")
		WebElement btn_Footerwhoweare;

		@FindBy(xpath = "	(//h1[contains(text(),'WHO')])[1]")
		WebElement Footerwhowearepage;

		@FindBy(xpath = "(//a[contains(@href,'compassion')])[5]")
		WebElement btn_Footercompassionfund;

		@FindBy(xpath = "(//h1[contains(text(),'Compassion')])[1]")
		WebElement Footercompassionfundpage;

		@FindBy(xpath = "(//a[contains(@href,'perfect-fit')])[2]")
		WebElement btn_Footerperfectfit;

		@FindBy(xpath = "(//a[contains(@href,'jobs')])[1]")
		WebElement btn_Footercarrers;

		@FindBy(xpath = "(//a[contains(@href,'investor')])[1]")
		WebElement btn_FooterInvestors;

		@FindBy(xpath = "(//a[contains(@href,'social')])[1]")
		WebElement btn_FooterSocialResponsibility;

		@FindBy(xpath = "(//h1[contains(text(),'Social')])[1]")
		WebElement FooterSocialResponsibilitypage;

		@FindBy(xpath = "(//a[contains(@href,'california')])[1]")
		WebElement btn_Footercalifornia;

		@FindBy(xpath = "(//h1[contains(text(),'California')])[1]")
		WebElement Footercaliforniapage;

		@FindBy(xpath = "(//a[contains(@href,'accessibility')])[1]")
		WebElement btn_Footeraccessibility;

		@FindBy(xpath = "(//h1[contains(text(),'Accessibility')])[1]")
		WebElement Footeraccessibilitypage;

		@FindBy(xpath = "(//a[contains(@href,'e-gift-card')])[1]")
		WebElement btn_Footeregiftcard;

		@FindBy(xpath = "(//h1[contains(text(),'e-Gift Card')])[1]")
		WebElement Footeregiftcardpage;

		@FindBy(xpath = "(//a[contains(@href,'gift-card')])[2]")
		WebElement btn_Footergiftcard;

		@FindBy(xpath = "(//h1[contains(text(),'Card')])[1]")
		WebElement Footergiftcardpage;

		@FindBy(xpath = "(//a[contains(@href,'gift-services')])[1]")
		WebElement btn_Footergiftservices;

		@FindBy(xpath = "(//h1[contains(text(),'Card')])[1]")
		WebElement Footergiftservicespage;

		@FindBy(xpath = "(//a[contains(@href,'creditcard')])[1]")
		WebElement btn_Footerlearnmore;

		@FindBy(xpath = "(//a[contains(@href,'applynow')])[1]")
		WebElement btn_Footerapplynow;

		@FindBy(xpath = "(//a[contains(@href,'jjillcard')])[1]")
		WebElement btn_Footeraccessyouraccount;

		
		public Header_Footer_Functionality() {
			PageFactory.initElements(driver, this);
		}

	
	public LoginFunctionality validateHeader() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("Validate Header Functioanality", true);
		Thread.sleep(1000);
		try {
			driver.switchTo().frame(promotionbox);
			btnclose.click();
			driver.switchTo().parentFrame();
			Thread.sleep(1000);
		} finally {
			if (btn_headernewarrivals.isDisplayed()) {
				Thread.sleep(20);
				btn_headernewarrivals.click();
				Thread.sleep(20);
				Assert.assertEquals(newarrivalsbreadcrumbs.isDisplayed(), true);

			}
			if (btn_headerclothing.isDisplayed()) {
				btn_headerclothing.click();
				Thread.sleep(20);
				Assert.assertEquals(clothingbreadcrumbs.isDisplayed(), true);

			}
			if (btn_headershoes.isDisplayed()) {
				Thread.sleep(100);
				btn_headershoes.click();
				Thread.sleep(2000);
				Assert.assertEquals(shoesbreadcrumbs.isDisplayed(), true);
			}
			if (btn_headerinspiration.isDisplayed()) {
				btn_headerinspiration.click();
				Thread.sleep(20);
				Assert.assertEquals(inspirationbreadcrumbs.isDisplayed(), true);

			}
			if (btn_headersale.isDisplayed()) {
				btn_headersale.click();
				Thread.sleep(20);
				Assert.assertEquals(salebreadcrumbs.isDisplayed(), true);

			}
			if (btn_headerstores.isDisplayed()) {
				btn_headerstores.click();
				Thread.sleep(20);
				Assert.assertEquals(storebreadcrumbs.isDisplayed(), true);
				Storestologo.click();
			}
			Assert.assertEquals(headerlogo.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_headershoppingbag.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_headerprofilebutton.isDisplayed(), true);
			Thread.sleep(20);
			Reporter.log("Validated Header Functionality successfully", true);
		}
		return new LoginFunctionality();
	}

	public LoginFunctionality validateFooter() throws InterruptedException {
		Reporter.log("Validate Footer Functioanality", true);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for (int i = 0; i < 10; i++) {
			jse.executeScript("window.scrollBy(0,600)");
		}
		Thread.sleep(20);
		Assert.assertEquals(txt_FooterNeedHelp.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(txt_FooterCustomerService.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(txt_FooterAboutJJILL.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(txt_FooterGiftCard.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(txt_FooterCreditCard.isDisplayed(), true);
		Thread.sleep(20);
		try {
			driver.switchTo().frame(promotionbox);
			btnclose.click();
			driver.switchTo().parentFrame();
			Thread.sleep(1000);
		} finally {
			Thread.sleep(20);
		}
		if (btn_FooterEmailus.isDisplayed()) {
			Thread.sleep(20);
			btn_FooterEmailus.click();
			btn_emailus.click();
		}
		if (btn_FooterChat.isDisplayed()) {
			Thread.sleep(20);
			btn_FooterChat.click();
			Footerchatpopupbutton.click();
		}
		if (btn_FooterContactUs.isDisplayed()) {
			Thread.sleep(20);
			btn_FooterContactUs.click();
			Assert.assertEquals(FooterContactUsPage.isDisplayed(), true);
			driver.navigate().back();
			for (int j = 0; j < 3; j++) {
				jse.executeScript("window.scrollBy(0,1200)");
				Thread.sleep(20);
			}
		}
		if (btn_FooterFAQ.isDisplayed()) {

			Thread.sleep(20);
			btn_FooterFAQ.click();
			Assert.assertEquals(FooterFAQpage.isDisplayed(), true);
			driver.navigate().back();
			for (int j = 0; j < 4; j++) {
				jse.executeScript("window.scrollBy(0,1200)");
				Thread.sleep(20);
			}		}
		if (btn_FooterOrderStatus.isDisplayed()) {
			Thread.sleep(20);
			btn_FooterOrderStatus.click();
			Thread.sleep(20);
			Assert.assertEquals(FooterOrderStatuspage.isDisplayed(), true);
			driver.navigate().back();
			
		}
		if (btn_FooterRequestCatalog.isDisplayed()) {
			Thread.sleep(20);
			btn_FooterRequestCatalog.click();
			Assert.assertEquals(FooterRequestCatalogpage.isDisplayed(), true);
			driver.navigate().back();
			
		}
		if (btn_FooterShipping.isDisplayed()) {
			Thread.sleep(20);
			btn_FooterShipping.click();
			Assert.assertEquals(FooterShippingpage.isDisplayed(), true);
			driver.navigate().back();
			for (int j = 0; j < 5; j++) {
				jse.executeScript("window.scrollBy(0,1200)");
				Thread.sleep(20);
			}
		}
		if (btn_FooterReturns.isDisplayed()) {
			Thread.sleep(20);
			btn_FooterReturns.click();
			Assert.assertEquals(FooterReturnspage.isDisplayed(), true);
			driver.navigate().back();
			for (int j = 0; j < 5; j++) {
				jse.executeScript("window.scrollBy(0,1200)");
				Thread.sleep(20);
			}
		}
		if (btn_FooterSizeGuide.isDisplayed()) {
			Thread.sleep(20);
			btn_FooterSizeGuide.click();
			Assert.assertEquals(FooterSizeGuidepage.isDisplayed(), true);
			driver.navigate().back();
			for (int j = 0; j < 5; j++) {
				jse.executeScript("window.scrollBy(0,1200)");
				Thread.sleep(20);
			}
		}
		if (btn_FooterSpecialOffer.isDisplayed()) {
			Thread.sleep(20);
			btn_FooterSpecialOffer.click();
			Assert.assertEquals(FooterSpecialOfferpage.isDisplayed(), true);
			driver.navigate().back();
			
		}
		if (btn_Footerwhoweare.isDisplayed()) {
			Thread.sleep(20);
			btn_Footerwhoweare.click();
			Assert.assertEquals(Footerwhowearepage.isDisplayed(), true);
			driver.navigate().back();
			
		}
		if (btn_Footercompassionfund.isDisplayed()) {
			Thread.sleep(20);
			btn_Footercompassionfund.click();
			Assert.assertEquals(Footercompassionfundpage.isDisplayed(), true);
			driver.navigate().back();
			for (int j = 0; j < 5; j++) {
				jse.executeScript("window.scrollBy(0,1200)");
				Thread.sleep(20);
			}
		}
		if (btn_Footerperfectfit.isDisplayed()) {
			Thread.sleep(20);
			btn_Footerperfectfit.click();
			Assert.assertEquals(FooterSizeGuidepage.isDisplayed(), true);
			driver.navigate().back();
			for (int j = 0; j < 5; j++) {
				jse.executeScript("window.scrollBy(0,1200)");
				Thread.sleep(20);
			}
		}
		if (btn_FooterSocialResponsibility.isDisplayed()) {
			Thread.sleep(20);
			btn_FooterSocialResponsibility.click();
			Assert.assertEquals(FooterSocialResponsibilitypage.isDisplayed(), true);
			driver.navigate().back();
			for (int j = 0; j < 5; j++) {
				jse.executeScript("window.scrollBy(0,1200)");
				Thread.sleep(20);
			}
		}
		if (btn_Footercalifornia.isDisplayed()) {
			Thread.sleep(20);
			btn_Footercalifornia.click();
			Assert.assertEquals(Footercaliforniapage.isDisplayed(), true);
			driver.navigate().back();
			for (int j = 0; j < 5; j++) {
				jse.executeScript("window.scrollBy(0,1200)");
				Thread.sleep(20);
			}
		}
		if (btn_Footeraccessibility.isDisplayed()) {
			Thread.sleep(20);
			btn_Footeraccessibility.click();
			Assert.assertEquals(Footeraccessibilitypage.isDisplayed(), true);
			driver.navigate().back();
			for (int j = 0; j < 5; j++) {
				jse.executeScript("window.scrollBy(0,1200)");
				Thread.sleep(20);
			}
		}
		if (btn_Footeregiftcard.isDisplayed()) {
			Thread.sleep(20);
			btn_Footeregiftcard.click();
			Assert.assertEquals(Footeregiftcardpage.isDisplayed(), true);
			driver.navigate().back();
			
		}
		if (btn_Footergiftcard.isDisplayed()) {
			Thread.sleep(20);
			btn_Footergiftcard.click();
			Assert.assertEquals(Footergiftcardpage.isDisplayed(), true);
			driver.navigate().back();
			}
		if (btn_Footergiftservices.isDisplayed()) {
			Thread.sleep(20);
			btn_Footergiftservices.click();
			Assert.assertEquals(Footergiftservicespage.isDisplayed(), true);
			driver.navigate().back();
			
		}
		
		Assert.assertEquals(btn_FooterCallus.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(btn_FooterFeedback.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(btn_Footerlearnmore.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(btn_Footerapplynow.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(btn_Footeraccessyouraccount.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(btn_Footercarrers.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(btn_FooterInvestors.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(btn_FooterDoNotSell.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(btn_FooterTermsofUse.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(btn_FooterPrivacy.isDisplayed(), true);
		Thread.sleep(20);
		Reporter.log("Validated Footer Functionality successfully", true);

		for (int i = 0; i < 10; i++) {
			jse.executeScript("window.scrollBy(0,-600)");
		}
		
		return new LoginFunctionality();
	}



}
