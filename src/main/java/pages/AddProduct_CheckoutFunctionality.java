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

	@FindBy(xpath = "(//div[contains(@id,'product')])[7] /div /div[2] /a/h6")
	WebElement selectitemdescription;
	
	@FindBy(xpath = "//button[@title='Remove Offer']")
	WebElement btnremoveoffer;

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

	@FindBy(xpath = "(//p[contains(@class,'MuiTypography-body1')])[14]")
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

	//Select Department
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

	//Select Department
	
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
		} finally {Thread.sleep(1000);}
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
}
