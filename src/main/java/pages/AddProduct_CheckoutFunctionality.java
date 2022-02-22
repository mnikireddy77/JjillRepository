package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

	@FindBy(xpath = "(//span[@class='shop-link'])[2]")
	WebElement btnSTL;

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

	@FindBy(css = "a[class= 'toplevel main-menu-link'][href='/sale']")
	WebElement drpSale;

	@FindBy(xpath = "(//a[contains(text(),'All Clothing')])[1]")
	WebElement department_AllClothing;

	@FindBy(xpath = "(//a[contains(text(),'Knit Tops & Tees')])[1]")
	WebElement department_knitTops;

	@FindBy(xpath = "(//input[@id='searchInput'])[1]")
	WebElement txtSearch;

	@FindBy(xpath = "//ul[@data-ui='thumbnails'] /li[1]")
	WebElement searchresults;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]")
	WebElement txtCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li")
	List<WebElement> resultsCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li //div[@data-swipeable='true']//img")
	List<WebElement> imagesCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[1]")
	List<WebElement> itemdescCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[2]/div/div")
	List<WebElement> itemdeptCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[3]/div/div")
	List<WebElement> itemcolorCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[4]/div/div")
	List<WebElement> itemsizeCTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[5]/div/div//span[text()='Add to Bag']")
	List<WebElement> itemATB_CTL;

	@FindBy(xpath = "//p[contains(text(),'complete the look')]/../ul/li/div/div[1]/div[2]/div/div[5]/div/div//a[text()='Full Details >']")
	List<WebElement> itemFullDetails_CTL;

	@FindBy(xpath = "(//div[contains(@id,'product')])[2] /div /div[1]")
	WebElement selectitem;

	@FindBy(xpath = "(//div[contains(@id,'product')])[4] /div /div[2] /a/h6")
	WebElement selectitemdescription;

	@FindBy(xpath = "(//span[contains(text(),'Quick Look')])[1]")
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

	@FindBy(xpath = "//button[@title='L']")
	WebElement btnsize;
	
	@FindBy(xpath = "//button[@title='XS']")
	WebElement btnOOSSize;
	
	@FindBy(xpath="//p[contains(text(),'QTY')]/../../../../p")
	WebElement inventoryMessage;

	@FindBy(xpath="//p[contains(text(),'QTY')]/../../../../p/span[1]")
	WebElement inventoryMessageBO;
	
	@FindBy(xpath = "//div[contains(text(),'Style No')]")
	WebElement txtStyleNo;

	@FindBy(xpath = "//span[contains(text(),'DETAILS & CARE')]")
	WebElement txtdetailscare;

	@FindBy(xpath = "(//div[@role='tabpanel']/span)[1]")
	WebElement txtdetailscare_msg;

	@FindBy(xpath = "//span[contains(text(),'RETURNS MADE EASY')]")
	WebElement txtreturns;

	@FindBy(xpath = "(//div[@role='tabpanel']/span)[2]/p[2]")
	WebElement txtreturns_msg;

	@FindBy(xpath = "//button[@type='submit'][@data-th='add-to-cart']")
	WebElement btnaddtobag;

	@FindBy(xpath = "(//div[@role='dialog'])[1]")
	WebElement dialogaddtobag;

	@FindBy(xpath = "div[class*='dividers'] img[src*='product']")
	WebElement itemdescription;

	@FindBy(xpath = "(//span[contains(text(),'View Shopping Bag')])[1]")
	WebElement btnviewshoppingcart;

	@FindBy(xpath = "//div[contains(@class,'MuiGrid-root MuiGrid-item MuiGrid-grid')] /ul/li")
	List<WebElement> imgPLP;

	@FindBy(xpath = "(//div[contains(@id,'product')]) /div /div[1] /div[1]/img")
	List<WebElement> monetatebadge;

	@FindBy(xpath = "(//ul[contains(@class,'MuiPagination-ul')])[3]/li/button")
	List<WebElement> salepagecount;

	@FindBy(xpath = "//p[contains(text(),'Estimated total')]/span")
	WebElement txtEstimatedTotal;

	@FindBy(xpath = "//span[@id='totalPrice']")
	WebElement txtEstimatedTotalchkout;

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

	@FindBy(css = "//a[@id='oo_no_thanks']")
	WebElement btn_nothanks;

	@FindBy(css = "select[id*='state']")
	WebElement drpdownstate;

	@FindBy(xpath = "//nav[contains(@aria-label,'pagination')]/ul/li[1]")
	List<WebElement> pagenavigation;

	@FindBy(xpath = "(//div[contains(@class,'MuiGrid-item')] //ul)[6] //li")
	WebElement pagecontent;

	@FindBy(xpath = "(//button[contains(@aria-label,'next')])[1]")
	WebElement btnnexttop;

	@FindBy(xpath = "(//button[contains(@aria-label,'previous')])[1]")
	WebElement btnprevioustop;

	@FindBy(xpath = "(//button[contains(@aria-label,'next')])[3]")
	WebElement btnnextbottom;

	@FindBy(xpath = "(//button[contains(@aria-label,'previous')])[3]")
	WebElement btnpreviousbottom;

	@FindBy(xpath = "//label[@class='jjill-checkbox'] /input[@name='billingAddrChk'] /../span")
	WebElement chkboxbillingaddress;

	@FindBy(xpath = "(//a[contains(@title,'Add new card')])[1]")
	WebElement btnaddnewcard;

	@FindBy(xpath = "(//label[@class='jjill-checkbox'])[2] /span")
	WebElement chkjjillcc;

	@FindBy(xpath = "(//input[contains(@aria-label,'card number')])[2]")
	WebElement txtcardnumber;

	@FindBy(xpath = "//input[contains(@id,'sameasshipping')] /../span")
	WebElement chkshippingAddress;

	@FindBy(xpath = "//button[@id='addCardButton']")
	WebElement btnAdd;

	@FindBy(xpath = "//input[@id='savethiscard'] /../span")
	WebElement btndontsavecreditcard;

	@FindBy(xpath = "(//button[contains(@aria-label,'review')])[1]")
	WebElement btnReview;

	@FindBy(xpath = "(//label[contains(@class,'jjill')])[6] /span")
	WebElement btnjillcard;

	@FindBy(xpath = "//h2[contains(text(),'order review')]")
	WebElement txtreview;

	@FindBy(xpath = "(//button[contains(@id,'place_order')])[1]")
	WebElement btnplaceorder;

	@FindBy(xpath = "//div[contains(text(),'ORDER!')]")
	WebElement txtorder;

	@FindBy(xpath = "//div[contains(@class,'order-info')] /p/span")
	WebElement txtOrderNumber;

	@FindBy(xpath = "//h6[text()='Quick Look']")
	WebElement ql_txtQuickLook;

	@FindBy(xpath = "(//div[@id='carouselInnerWrapper'])[4]")
	WebElement ql_heroimg;

	@FindBy(xpath = "//div[contains(@class,'flexContainerVertical')] /button //img")
	WebElement ql_sideimg;

	@FindBy(xpath = "//h1[contains(@class,'MuiTypography-h6')]")
	WebElement ql_ItemDescription;

	@FindBy(xpath = "(//h1[contains(@class,'MuiTypography-h6')])[2]")
	WebElement pdp_ItemDescription;

	@FindBy(xpath = "//div[@class='bv_stars_component_container']")
	WebElement ql_bazaarvoice;

	@FindBy(xpath = "(//div[@itemprop='aggregateRating'])[2]")
	WebElement pdp_bazaarvoice;

	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[1] /div//button")
	WebElement ql_btnsizetype;

	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[1] /div//button")
	List<WebElement> pdpbtnsizetype;

	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[2] /div//button")
	List<WebElement> PDP_btncolor;

	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[2] /div//button")
	WebElement ql_btncolor;

	@FindBy(xpath = "(//p[contains(@class,'MuiTypography-body1')])[7]")
	WebElement txtbtnColorName;

	@FindBy(xpath = "(//p[contains(@class,'MuiTypography-body1')])[10]")
	WebElement ql_txtbtnColorName;

	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[3]/div[3]/button")
	WebElement ql_btnsize;

	@FindBy(xpath = "//p[contains(text(),'Guide')]")
	WebElement ql_sizeguide;

	@FindBy(xpath = "(//p[contains(text(),'Size Guide')])[2]")
	WebElement sizeguidepopup;

	@FindBy(css = "svg[width='1em'] path")
	WebElement btnsizepopupClose;

	@FindBy(xpath = "(//button[@aria-label='close'])[4]//span[1]")
	WebElement ql_btnsizepopupClose;

	@FindBy(xpath = "(//div[@title='Fit Predictor'] /div)[1]")
	WebElement ql_fitpredicator;

	@FindBy(xpath = "(//div[@class='fp-logo'])[2]")
	WebElement fitpredicatorpopup;

	@FindBy(xpath = "//div[@aria-label='Close']")
	WebElement fitpredicatorclose;

	@FindBy(xpath = "(//input[@name='quantity'] /../button)[2]")
	WebElement ql_quantityadd;

	@FindBy(xpath = "(//input[@name='quantity'] /../button)[2]/../input")
	WebElement ql_quantityvalue;

	@FindBy(xpath = "(//input[@name='quantity'] /../button)[1]")
	WebElement ql_quantitysub;

	@FindBy(xpath = "//span[contains(text(),'Save for Later ')]")
	WebElement ql_saveforlater;

	@FindBy(xpath = "//p[contains(text(),'SAVED FOR LATER')]")
	WebElement ql_saveforlaterpopup;

	@FindBy(xpath = "//a[contains(text(),'Full Details')]")
	WebElement ql_fulldetails;

	@FindBy(xpath = "//h4[text()='Share This Product'] /../a")
	List<WebElement> pdp_Sharethisproduct;

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

	@FindBy(xpath = "(//div[contains(@id,'product')]) /div /div[1] /div[1]/img /../../../div[2]/a/h6")
	List<WebElement> txt_itemdesc;

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

	public AddProduct_CheckoutFunctionality() {
		PageFactory.initElements(driver, this);
	}

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


	public AddProduct_CheckoutFunctionality validateQuickLookScreen() throws InterruptedException {
		Reporter.log("Validate quicklook screen", true);
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,700)");
		action.moveToElement(btnquicklook);
		action.click(btnquicklook).build().perform();
		Thread.sleep(1000);
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
		}
		Assert.assertEquals(ql_txtQuickLook.isDisplayed(), true);
		Thread.sleep(200);
		Assert.assertEquals(ql_heroimg.isDisplayed(), true);
		Thread.sleep(400);
		Assert.assertEquals(ql_sideimg.isDisplayed(), true);
		Thread.sleep(50);
		Assert.assertEquals(ql_ItemDescription.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(ql_bazaarvoice.isDisplayed(), true);
		Thread.sleep(20);
		try {
			ql_bazaarvoice.click();
		} catch (Exception e) {
			Reporter.log("QL Bazaarvoice is not clickable", true);
		}
		Assert.assertEquals(ql_btnsizetype.isDisplayed(), true);
		Thread.sleep(20);

		for (int i = 0; i < pdpbtnsizetype.size(); i++) {
			pdpbtnsizetype.get(i).click();
			String size = pdpbtnsizetype.get(i).getAttribute("title");
			Reporter.log(size);
		}
		pdpbtnsizetype.get(0).click();
		Thread.sleep(20);
		for (int i = 0; i < PDP_btncolor.size(); i++) {
			PDP_btncolor.get(i).click();
			Thread.sleep(5);
			String name = ql_txtbtnColorName.getText();
			System.out.println(name);
		}
		jse.executeScript("window.scrollBy(0,100)");
		Assert.assertEquals(ql_btnsize.isDisplayed(), true);
		Thread.sleep(50);
		ql_btnsize.click();
		Thread.sleep(50);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Assert.assertEquals(ql_sizeguide.isDisplayed(), true);
		Thread.sleep(20);
		ql_sizeguide.click();
		if (sizeguidepopup.isDisplayed()) {
			Assert.assertEquals(sizeguidepopup.isDisplayed(), true);
			Thread.sleep(20);
			ql_btnsizepopupClose.click();
		}

		Assert.assertEquals(ql_fitpredicator.isDisplayed(), true);
		Thread.sleep(20);
		ql_fitpredicator.click();
		if (fitpredicatorpopup.isDisplayed()) {
			Assert.assertEquals(fitpredicatorpopup.isDisplayed(), true);
			Thread.sleep(20);
			fitpredicatorclose.click();
			Thread.sleep(20);
		}
		jse.executeScript("window.scrollBy(0,100)");
		if (ql_quantityadd.isDisplayed()) {
			Thread.sleep(20);
			ql_quantityadd.click();
			String qty = ql_quantityvalue.getAttribute("value");
			System.out.print(qty);
			Assert.assertEquals(qty, "2");
		}
		if (ql_quantitysub.isDisplayed()) {
			Thread.sleep(20);
			ql_quantitysub.click();
			String qty = ql_quantityvalue.getAttribute("value");
			System.out.print(qty);
			Assert.assertEquals(qty, "1");
		}
		Assert.assertEquals(btnaddtobag.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(ql_saveforlater.isDisplayed(), true);
		Thread.sleep(20);
		if (ql_saveforlater.isDisplayed()) {
			ql_saveforlater.click();
			Thread.sleep(20);
			Assert.assertEquals(ql_saveforlaterpopup.isDisplayed(), true);
			Thread.sleep(20);
			ql_btnsizepopupClose.click();
		}
		Assert.assertEquals(ql_fulldetails.isDisplayed(), true);
		Thread.sleep(20);
		btnaddtobag.click();
		btnviewshoppingcart.click();
		Reporter.log("quicklook validation successful", true);
		return new AddProduct_CheckoutFunctionality();
	}

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

	public LoginFunctionality validateMonetateBadging() throws InterruptedException {
		Reporter.log("Validate the Monetate Badging", true);
		int count = 1;
		int pagecount = 1;
		try {
			while (btnnexttop.isDisplayed()) {
				btnnexttop.click();
				Thread.sleep(500);
				pagecount++;
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(pagecount);
		}
		for (int j = 0; j < pagecount; j++) {
			jse.executeScript("window.scrollBy(0,400)");
			int size = imgPLP.size();
			for (int i = 0; i < monetatebadge.size(); i++) {
				System.out.println(monetatebadge.get(i));
				System.out.println(monetatebadge.size() + " akdjf" + i);
				System.out.println(txt_itemdesc.get(i).getText());
				Assert.assertEquals(monetatebadge.get(i).isDisplayed(), true);
				if (i < monetatebadge.size() - 1 && count % 3 == 0) {
					jse.executeScript("window.scrollBy(0,300)");
					Thread.sleep(1000);
					jse.executeScript("window.scrollBy(0,300)");
				}
				Thread.sleep(50);
				count++;
			}
			jse.executeScript("window.scrollBy(0,500)");
			try {
				// System.out.println(pagecount);
				jse.executeScript("window.scrollBy(0,-200)");
				Thread.sleep(500);
				btnpreviousbottom.click();
				Thread.sleep(1500);
			}
		
			catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		for (int i = 0; i < 15; i++) {
			Thread.sleep(1000);
			jse.executeScript("window.scrollBy(0,-700)");
		}
		Thread.sleep(1000);
		Reporter.log("Monetate Badging validated sucessfully", true);
		// }
		return new LoginFunctionality();
	}

	public LoginFunctionality validateHeader() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("Validate Header Functioanality", true);
		Thread.sleep(20);
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
				Thread.sleep(1000);
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

	public AddProduct_CheckoutFunctionality validatePdpPage() throws InterruptedException {
		Reporter.log("Validating the PDP Started", true);
		jse.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,750)");
		selectitemdescription.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		for (int i = 0; i < 7; i++) {
			Thread.sleep(1000);
		}
		Assert.assertEquals(ql_heroimg.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(ql_sideimg.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(pdp_ItemDescription.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(pdp_bazaarvoice.isDisplayed(), true);
		Thread.sleep(20);
		for (int i = 0; i < pdpbtnsizetype.size(); i++) {
			pdpbtnsizetype.get(i).click();
			String size = pdpbtnsizetype.get(i).getAttribute("title");
			Reporter.log(size);
		}
		pdpbtnsizetype.get(0).click();
		Thread.sleep(20);
		for (int i = 0; i < PDP_btncolor.size(); i++) {
			PDP_btncolor.get(i).click();
			Thread.sleep(5);
			String name = txtbtnColorName.getText();
			System.out.println(name);
		}
		jse.executeScript("window.scrollBy(0,100)");
		Assert.assertEquals(btnsize.isDisplayed(), true);
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,100)");
		btnsize.click();
		Thread.sleep(50);
		Assert.assertEquals(ql_sizeguide.isDisplayed(), true);
		Thread.sleep(20);
		ql_sizeguide.click();
		if (sizeguidepopup.isDisplayed()) {
			Assert.assertEquals(sizeguidepopup.isDisplayed(), true);
			Thread.sleep(20);
			btnsizepopupClose.click();
		}
		Assert.assertEquals(ql_fitpredicator.isDisplayed(), true);
		Thread.sleep(20);
		ql_fitpredicator.click();
		if (fitpredicatorpopup.isDisplayed()) {
			Assert.assertEquals(fitpredicatorpopup.isDisplayed(), true);
			Thread.sleep(20);
			fitpredicatorclose.click();
			Thread.sleep(20);
		}
		jse.executeScript("window.scrollBy(0,100)");
		if (ql_quantityadd.isDisplayed()) {
			Thread.sleep(20);
			ql_quantityadd.click();
			String qty = ql_quantityvalue.getAttribute("value");
			System.out.print(qty);
			Assert.assertEquals(qty, "2");
		}
		if (ql_quantitysub.isDisplayed()) {
			Thread.sleep(20);
			ql_quantitysub.click();
			String qty = ql_quantityvalue.getAttribute("value");
			System.out.print(qty);
			Assert.assertEquals(qty, "1");
		}
		Assert.assertEquals(btnaddtobag.isDisplayed(), true);
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,100)");
		if (ql_saveforlater.isDisplayed()) {
			ql_saveforlater.click();
			Thread.sleep(20);
			Assert.assertEquals(ql_saveforlaterpopup.isDisplayed(), true);
			Thread.sleep(20);
			btnsizepopupClose.click();
		}
		Assert.assertEquals(pdp_Sharethisproduct.size(), 3);
		for (int i = 0; i < 3; i++) {
			String parentwindow = driver.getWindowHandle();
			pdp_Sharethisproduct.get(i).click();
			Set<String> allWindowHandles = driver.getWindowHandles();
			if (i == 0) {
				for (String wh : allWindowHandles) {
					driver.switchTo().window(wh);
					String Title = driver.getTitle();
					if (Title.contentEquals("Facebook"))
						driver.close();
				}
			}
			if (i == 1) {
				for (String wh : allWindowHandles) {
					driver.switchTo().window(wh);
					System.out.println(driver.getWindowHandle());
					String Title = driver.getTitle();
					System.out.println(Title);
					if (Title.contentEquals("Compose new Tweet / Twitter"))
						driver.close();
				}
			}
			if (i == 2) {
				for (String wh : allWindowHandles) {
					driver.switchTo().window(wh);
					System.out.println(driver.getWindowHandle());
					String Title = driver.getTitle();
					System.out.println(Title);
					if (Title.contentEquals("Pinterest"))
						driver.close();
				}
			}
			driver.switchTo().window(parentwindow);
		}
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,500)");
		Assert.assertEquals(txtStyleNo.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(txtdetailscare.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertNotNull(txtdetailscare_msg.getText());
		Thread.sleep(20);
		Assert.assertEquals(txtreturns.isDisplayed(), true);
		txtreturns.click();
		Assert.assertNotNull(txtreturns_msg.getText());
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,-500)");
		btnaddtobag.click();
		Thread.sleep(20);
		btnviewshoppingcart.click();
		Reporter.log("PDP Validation Sucessful", true);
		return this;
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

	public LoginFunctionality validateSTLPlpPage() throws InterruptedException {
		Reporter.log("Adding STL item to Bag", true);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
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
		return new LoginFunctionality();
	}

	public AddProduct_CheckoutFunctionality validateSearchFunctionality() throws InterruptedException {
		Reporter.log("Validating the Search Functionality Started", true);
		Thread.sleep(2000);
		txtSearch.click();
		readValuesForSearch("Search_Data", "Search");
		Reporter.log("Enter Search Data", true);
		txtSearch.sendKeys(TestBase.testData.get().getSearchData());
		Thread.sleep(500);
		try {
			if (promotionbox.isDisplayed()) {
				driver.switchTo().frame(promotionbox);
				btnclose.click();
				driver.switchTo().parentFrame();
				Thread.sleep(500);
			}
		} finally {
			searchresults.click();
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,300)");
			btnsize.click();
			Thread.sleep(500);
			jse.executeScript("window.scrollBy(0,100)");
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
	
	public AddProduct_CheckoutFunctionality validateOOSFunctionality() throws InterruptedException {
		Reporter.log("Validating the Out of Stock Functionality Started", true);
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
		readValuesForSearch("Search_Data", "OOS");
		Reporter.log("Enter Sku Data", true);
		txtSearch.sendKeys(TestBase.testData.get().getSearchData());
		Thread.sleep(600);
		
		  try { if (promotionbox.isDisplayed()) {
		  driver.switchTo().frame(promotionbox); btnclose.click();
		  driver.switchTo().parentFrame(); Thread.sleep(500); } } finally {
		 
			searchresults.click();
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,300)");
			btnOOSSize.click();
			Thread.sleep(500);
			String message= inventoryMessage.getText();
			Assert.assertEquals(message, "SELECTEDCOLOR/SIZE UNAVAILABLE");
			Reporter.log("OOS Validation Sucessful", true);
			jse.executeScript("window.scrollBy(0,-300)");
			action.click(headerlogo).perform();
			Thread.sleep(100);
		}
		}
		
		return new AddProduct_CheckoutFunctionality();
		
	}
	
	public AddProduct_CheckoutFunctionality validateLowInventoryFunctionality() throws InterruptedException {
		Reporter.log("Validating the LowInventory Functionality Started", true);
		txtSearch.click();
		readValuesForSearch("Search_Data", "LowInventory");
		Reporter.log("Enter Sku Data", true);
		txtSearch.sendKeys(TestBase.testData.get().getSearchData());
		txtSearch.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,300)");
			Thread.sleep(500);
			String message= inventoryMessage.getText();
			System.out.print(message);
			Assert.assertEquals(message, "THIS IS ALMOST GONE, DON'T MISS OUT!");
			Reporter.log("LowInventory Validation Sucessful", true);
			jse.executeScript("window.scrollBy(0,-300)");
			action.click(headerlogo).perform();
		
			Thread.sleep(100);

		
		return new AddProduct_CheckoutFunctionality();
		
	}
	public LoginFunctionality validateBackOrderedFunctionality() throws InterruptedException {
		Reporter.log("Validating the Backordered Functionality Started", true);
		txtSearch.click();
		readValuesForSearch("Search_Data", "BackOrdered");
		Reporter.log("Enter Sku Data", true);
		txtSearch.sendKeys(TestBase.testData.get().getSearchData());
		txtSearch.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,300)");
			Thread.sleep(500);
			String message= inventoryMessageBO.getText();
			System.out.print(message);
			Assert.assertEquals(message, "BACKORDERED:");
			Reporter.log("Backordered Validation Sucessful", true);
			jse.executeScript("window.scrollBy(0,-300)");
			action.click(headerlogo).perform();
		
			Thread.sleep(100);
	
		
		return new LoginFunctionality();
		
	}


	public LoginFunctionality selectPaginationOption() throws InterruptedException {
		int i = pagenavigation.size();
		System.out.println(i);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		jse.executeScript("window.scrollBy(0,450)");
		for (int j = 0; j < i; j++) {
			try {
				if (pagecontent.isDisplayed()) {
					Thread.sleep(5000);
					if (btnnexttop.isDisplayed()) {
						Thread.sleep(5000);
						btnnexttop.click();
						System.out.println("NextButton is sucessfully clicked on page " + (Integer.valueOf(j) + 1));
					}
				}
				Thread.sleep(2000);
			} catch (Exception e) {
				break;
			}
			Thread.sleep(5000);
			jse.executeScript("window.scrollBy(0,500)");
		}
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-500)");
		return new LoginFunctionality();
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
		Thread.sleep(1000);
		return new LoginFunctionality();
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

	public static void readValuesForSearch(String sheetName, String scenario) {
		Reporter.log("Fetch the search data", true);
		TestBase.testData.get().setSearchData(util.readCellValue(sheetName, scenario, "SearchData"));
		Reporter.log("Fetched search data from the test data sheet successfully", true);
	}

}
