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

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import testbase.TestBase;
import utilities.ElementOperations;
import utilities.Utility;

public class AddProduct_CheckoutFunctionality extends ElementOperations{
	
		WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
		static Utility util = new Utility();
		Actions action = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Select select ;
		
		//Object Repository

		@FindBy(xpath="//iframe[@frameborder='0']")
		WebElement promotionbox;
		
		@FindBy(css = "button[class*=remove]")
		WebElement btnclose;
		
		@FindBy(css = "a[class= 'toplevel main-menu-link'][href='/shop/womens-clothing']")
		WebElement drpClothing;
		
		@FindBy(xpath = "(//div[contains(@id,'New_Arrivals')] /div/a)[1]")
		WebElement drpNewArrivals;
		
		@FindBy(xpath = "(//a[contains(text(),'Must-Have Outfits')])[1]")
		WebElement department_STL;
		
		@FindBy(xpath = "(//span[@class='shop-link'])[1]")
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
		
		
		@FindBy(xpath = "//select[contains(@id,'quantity')]")
		WebElement STLqty;
		
		@FindBy(xpath = "//div[contains(text(),'Add to Bag')]")
		WebElement STLbtnATB;
		
		@FindBy(xpath = "//a[contains(text(),'Save For Later')]")
		WebElement STLsaveforlater;
		
		@FindBy(xpath = "//a[contains(text(),'Full Product Details >')]")
		WebElement STLfulldetails;
		
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
		
		@FindBy(xpath = "(//div[contains(@id,'product')])[2] /div /div[2] /a/h6") 
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
		
		
		@FindBy(xpath = "//button[@title='M']")
		WebElement btnsize;

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
		
		@FindBy(css ="div[class*='new-address'] a")
		WebElement btnaddress;
		

		@FindBy(css="input[name='firstName']")
		WebElement txtfirstName;

		@FindBy(css="input[name='lastName']")
		WebElement txtlastName;

		@FindBy(css="input[name='address1']")
		WebElement txtaddress;

		@FindBy(css="input[name='zipCode']")
		WebElement txtzipCode;

		@FindBy(css="input[name='city']")
		WebElement txtcity;

		@FindBy(css="input[name='phone1']")
		WebElement txtPhoneNumber;
		
		@FindBy(css="button[id='buttoninspl']")
		WebElement btnaddAddress;
		
		@FindBy(css="//input[contains(@aria-label,'standard')] /../span")
		WebElement btnstandard;

		@FindBy(xpath="//button[contains(@aria-label,'PROCEED')]")
		WebElement btnpayment;
		
		@FindBy(css="img[alt*='logo']")
		WebElement btnLogo;		
		
		@FindBy(css="//a[@id='oo_no_thanks']")
		WebElement btn_nothanks;		

		@FindBy(css="select[id*='state']")
		WebElement drpdownstate;
		
		@FindBy(xpath="//nav[contains(@aria-label,'pagination')]/ul/li[1]")
		List<WebElement> pagenavigation;	
		
		@FindBy(xpath="(//div[contains(@class,'MuiGrid-item')] //ul)[6] //li")
		WebElement pagecontent;	
		
		@FindBy(xpath="(//button[contains(@aria-label,'next')])[1]")
		WebElement btnnexttop;
		
		@FindBy(xpath="(//button[contains(@aria-label,'previous')])[1]")
		WebElement btnprevioustop;
		

		@FindBy(xpath="(//button[contains(@aria-label,'next')])[3]")
		WebElement btnnextbottom;
		
		@FindBy(xpath="(//button[contains(@aria-label,'previous')])[3]")
		WebElement btnpreviousbottom;
		
		
		
		@FindBy(xpath="//label[@class='jjill-checkbox'] /input[@name='billingAddrChk'] /../span")
		WebElement chkboxbillingaddress;	
		
		@FindBy(xpath="(//a[contains(@title,'Add new card')])[1]")
		WebElement btnaddnewcard;	
		
		@FindBy(xpath="(//label[@class='jjill-checkbox'])[2] /span")
		WebElement chkjjillcc;	
		
		@FindBy(xpath="(//input[contains(@aria-label,'card number')])[2]")
		WebElement txtcardnumber;	
		
		@FindBy(xpath="//input[contains(@id,'sameasshipping')] /../span")
		WebElement chkshippingAddress;	
		
		@FindBy(xpath="//button[@id='addCardButton']")
		WebElement btnAdd;	
		
		@FindBy(xpath="//input[@id='savethiscard'] /../span")
		WebElement btndontsavecreditcard;
		

		@FindBy(xpath="(//button[contains(@aria-label,'review')])[1]")
		WebElement btnReview;
		
		@FindBy(xpath="(//label[contains(@class,'jjill')])[6] /span")
		WebElement btnjillcard;
		
		@FindBy(xpath="//h2[contains(text(),'order review')]")
		WebElement txtreview;
		
		@FindBy(xpath="(//button[contains(@id,'place_order')])[1]")
		WebElement btnplaceorder;
		
		@FindBy(xpath="//div[contains(text(),'ORDER!')]")
		WebElement txtorder;
		
		@FindBy(xpath="//div[contains(@class,'order-info')] /p/span")
		WebElement txtOrderNumber;
		
		@FindBy(xpath="//h6[text()='Quick Look']")
		WebElement ql_txtQuickLook;
		
		@FindBy(xpath="(//div[@id='carouselInnerWrapper'])[4]")
		WebElement ql_heroimg;
		
		@FindBy(xpath="//div[contains(@class,'flexContainerVertical')] /button //img")
		WebElement ql_sideimg;
		
		@FindBy(xpath="//h1[contains(@class,'MuiTypography-h6')]")
		WebElement ql_ItemDescription;
		
		@FindBy(xpath="(//h1[contains(@class,'MuiTypography-h6')])[2]")
		WebElement pdp_ItemDescription;
		
		@FindBy(xpath="//div[@class='bv_stars_component_container']")
		WebElement ql_bazaarvoice;
		
		@FindBy(xpath="(//div[@itemprop='aggregateRating'])[2]")
		WebElement pdp_bazaarvoice;
		
		@FindBy(xpath="(//div[@data-id='ProductOptionSelector'])[1] /div//button")
		WebElement ql_btnsizetype;
		
		@FindBy(xpath="(//div[@data-id='ProductOptionSelector'])[2] /div//button")
		WebElement ql_btncolor;
		
		@FindBy(xpath="(//div[@data-id='ProductOptionSelector'])[4]/div[3]/button")
		WebElement ql_btnsize;
		
		@FindBy(xpath="//p[contains(text(),'Guide')]")
		WebElement ql_sizeguide;
		
		@FindBy(xpath="//div[@title='Fit Predictor'] /div")
		WebElement ql_fitpredicator;
		
		@FindBy(xpath="//input[@name='quantity'] /../button")
		WebElement ql_quantity;
		
		@FindBy(xpath="//span[contains(text(),'Save for Later ')]")
		WebElement ql_saveforlater;
		
		@FindBy(xpath="//a[contains(text(),'Full Details')]")
		WebElement ql_fulldetails;
		
		@FindBy(xpath="//h4[text()='Share This Product'] /../a")
		WebElement pdp_Sharethisproduct;
		
		@FindBy(xpath = "(//div[contains(@id,'New_Arrivals')] /div/a)[1]")
		WebElement btn_headernewarrivals;
		
		@FindBy(xpath="(//div[contains(@id,'Clothing')] /div/a)[1]")
		WebElement btn_headerclothing;
		
		@FindBy(xpath="(//div[contains(@id,'Shoes')] /div/a)[1]")
		WebElement btn_headershoes;
		
		@FindBy(xpath="(//div[contains(@id,'Collections')] /div/a)[1]")
		WebElement btn_headerinspiration;
		
		@FindBy(xpath="(//div[contains(@id,'Sale')] /div/a)[1]")
		WebElement btn_headersale;
		
		@FindBy(xpath="(//a[contains(text(),'stores')])[2]")
		WebElement btn_headerstores;
		
		@FindBy(css="path[class*='jjill-logo']")
		WebElement headerlogo;
		
		@FindBy(xpath="//div[text()='bag']")
		WebElement btn_headershoppingbag;
		
		@FindBy(xpath="//button[@name='profile-button']")
		WebElement btn_headerprofilebutton;
		
		@FindBy(xpath="(//div[contains(@id,'product')]) /div /div[1] /div[1]/img /../../../div[2]/a/h6")
		List<WebElement> txt_itemdesc;
		
		@FindBy(xpath="//p[contains(text(),'NEED HELP?')]")
		WebElement txt_FooterNeedHelp;
		
		@FindBy(xpath="(//H6[contains(text(),'CUSTOMER SERVICE')])[1]")
		WebElement txt_FooterCustomerService;
	
		@FindBy(xpath="(//H6[contains(text(),'ABOUT')])[1]")
		WebElement txt_FooterAboutJJILL;
		
		@FindBy(xpath="(//H6[contains(text(),'GIFT')])[1]")
		WebElement txt_FooterGiftCard;
		
		@FindBy(xpath="(//H6[contains(text(),'CREDIT')])[1]")
		WebElement txt_FooterCreditCard;
		
		@FindBy(xpath="//a[contains(text(),'email')]")
		WebElement btn_FooterEmailus;
		
		@FindBy(xpath="//a[contains(text(),'Chat')]")
		WebElement btn_FooterChat;
		
		@FindBy(xpath="//p[contains(text(),'Call')]")
		WebElement btn_FooterCallus;
		
		@FindBy(xpath="//div[contains(text(),'Feedback')]")
		WebElement btn_FooterFeedback;
		
		@FindBy(xpath="(//a[contains(@href,'contact')])[1]")
		WebElement btn_FooterContactUs;
		
		@FindBy(xpath="(//a[contains(@href,'faq')])[1]")
		WebElement btn_FooterFAQ;
		
		@FindBy(xpath="(//a[contains(@href,'OrderStatus')])[1]")
		WebElement btn_FooterOrderStatus;
		
		@FindBy(xpath="(//a[contains(@href,'request')])[1]")
		WebElement btn_FooterRequestCatalog;
		
		@FindBy(xpath="(//a[contains(@href,'shipping')])[1]")
		WebElement btn_FooterShipping;
		
		@FindBy(xpath="(//a[contains(@href,'returns')])[1]")
		WebElement btn_FooterReturns;
		
		@FindBy(xpath="(//a[contains(@href,'coupons')])[1]")
		WebElement btn_FooterSpecialOffer;
		
		@FindBy(xpath="(//a[contains(@href,'privacy')])[1]")
		WebElement btn_FooterDoNotSell;
		
		@FindBy(xpath="(//a[contains(@href,'terms')])[1]")
		WebElement btn_FooterTermsofUse;
		
		@FindBy(xpath="(//a[contains(@href,'about')])[1]")
		WebElement btn_Footerwhoweare;

		@FindBy(xpath="	(//a[contains(@href,'compassion')])[5]")
		WebElement btn_Footercompassionfund;
		
		@FindBy(xpath="(//a[contains(@href,'perfect-fit')])[2]")
		WebElement btn_Footerperfectfit;
		
		@FindBy(xpath="(//a[contains(@href,'jobs')])[1]")
		WebElement btn_Footercarrers;
		
		@FindBy(xpath="(//a[contains(@href,'investor')])[1]")
		WebElement btn_FooterInvestors;
		
		@FindBy(xpath="//a[contains(@href,'social')]")
		WebElement btn_FooterSocialResponsibility;
		
		@FindBy(xpath="(//a[contains(@href,'california')])[1]")
		WebElement btn_Footercalifornia;
		
		@FindBy(xpath="(//a[contains(@href,'accessibility')])[1]")
		WebElement btn_Footeraccessibility;
		
		@FindBy(xpath="(//a[contains(@href,'e-gift-card')])[1]")
		WebElement btn_Footeregiftcard;
		
		@FindBy(xpath="(//a[contains(@href,'gift-card')])[2]")
		WebElement btn_Footergiftcard;
		
		@FindBy(xpath="(//a[contains(@href,'gift-services')])[1]")
		WebElement btn_Footergiftservices;
		
		@FindBy(xpath="(//a[contains(@href,'creditcard')])[1]")
		WebElement btn_Footerlearnmore;
		
		@FindBy(xpath="(//a[contains(@href,'applynow')])[1]")
		WebElement btn_Footerapplynow;
		
		@FindBy(xpath="(//a[contains(@href,'jjillcard')])[1]")
		WebElement btn_Footeraccessyouraccount;
		
		public AddProduct_CheckoutFunctionality() {
			PageFactory.initElements(driver, this);
		}
		
		 
		public AddProduct_CheckoutFunctionality selectClothingDepartment() {
			Reporter.log("Select the department", true);
			action.moveToElement(drpClothing).perform();
			action.moveToElement(department_knitTops).click().perform();
			Reporter.log("Selected the department sucessfully", true);
			return this;
		}
		
		public AddProduct_CheckoutFunctionality selectSaleDepartment() {
			Reporter.log("Select the department", true);
			action.moveToElement(drpSale).perform();
			action.moveToElement(department_AllClothing).click().perform();
			Reporter.log("Selected the department sucessfully", true);
			return this;
		}
		
		
		public AddProduct_CheckoutFunctionality selectSTLDepartment() {
			Reporter.log("Select the department", true);
			action.moveToElement(drpNewArrivals).perform();
			action.clickAndHold(department_STL).release().perform();
			Reporter.log("Selected the department sucessfully", true);
			return new AddProduct_CheckoutFunctionality();
		}
		
		public AddProduct_CheckoutFunctionality selectQuickLook() throws InterruptedException {
			Reporter.log("Select the quick look option on an Item", true);
			driver.switchTo().frame(promotionbox);
			btnclose.click();
			driver.switchTo().parentFrame();
			Thread.sleep(50);
			jse.executeScript("window.scrollBy(0,600)");
			Thread.sleep(1000);
			action.click(btnquicklook).perform();
			Reporter.log("Quick look option is selected sucessfully on an Item", true);
			return this;
		}
		
		public AddProduct_CheckoutFunctionality validateQuickLookScreen() throws InterruptedException {
			Reporter.log("Validate quicklook screen", true);
			for(int i=0;i<5;i++)
			{
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
			Assert.assertEquals(ql_bazaarvoice.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(ql_btnsizetype.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(ql_btncolor.isDisplayed(),true);
			Thread.sleep(20);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Assert.assertEquals(ql_btnsize.isDisplayed(),true);
			Thread.sleep(50);
			ql_btnsize.click();
			Thread.sleep(50);
			//action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Assert.assertEquals(ql_sizeguide.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(ql_fitpredicator.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(ql_quantity.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(btnaddtobag.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(ql_saveforlater.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(ql_fulldetails.isDisplayed(),true);
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
			//expwait.until(ExpectedConditions.visibilityOf(selectitem));
			//action.moveToElement(selectitem).perform();
			action.click(selectitem).perform();
			//selectitem.click();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			jse.executeScript("window.scrollBy(0,450)");
			btnsize.click();
			jse.executeScript("window.scrollBy(0,300)");
			btnaddtobag.click();
			String total= txtEstimatedTotal.getText();
			btnviewshoppingcart.click();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			String chkoutTotal= txtEstimatedTotalchkout.getText();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			//Assert.assertEquals(total, chkoutTotal);
			Reporter.log("Selected the Item sucessfully", true);
			return this;		}
		
		public LoginFunctionality validateMonetateBadging() throws InterruptedException {
			Reporter.log("Validate the Monetate Badging", true);
			try {
				if(promotionbox.isDisplayed())
				{
			driver.switchTo().frame(promotionbox);
			btnclose.click();
			driver.switchTo().parentFrame();
			Thread.sleep(50);
		}}
			finally
			{
			int count=1;
			int pagecount= 1;
			try {
			while(btnnexttop.isDisplayed())
			{
				btnnexttop.click();
				Thread.sleep(500);
				pagecount++;
				Thread.sleep(500);
			}
			}
			catch(Exception e)
			{
				System.out.println(pagecount);
			}
		for(int j=0;j<pagecount;j++)
			{
			jse.executeScript("window.scrollBy(0,400)");
			int size= imgPLP.size();
			//System.out.println(size);
			for(int i=0 ;i<monetatebadge.size();i++)
			{
				//System.out.println(monetatebadge.get(i));
				//System.out.println(monetatebadge.size()+ " akdjf" + i);
			//	Assert.assertEquals(monetatebadge.size(), 36);
				System.out.println(txt_itemdesc.get(i).getText());
				Assert.assertEquals(monetatebadge.get(i).isDisplayed(), true);
				if(i<monetatebadge.size()-1&& count%3==0)
				{
					jse.executeScript("window.scrollBy(0,300)");
					Thread.sleep(1000);
					jse.executeScript("window.scrollBy(0,300)");
				}
				Thread.sleep(50);
				count++;
			}
			jse.executeScript("window.scrollBy(0,250)");
			try {
			btnpreviousbottom.click();
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
			Thread.sleep(1000);
			}
			}
		for(int i=0;i<15;i++)
		{
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,-600)");
		}
		Thread.sleep(1000);
		Reporter.log("Monetate Badging validated sucessfully", true);
			}
			return new LoginFunctionality();		
			}
		
		public LoginFunctionality validateHeader() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Reporter.log("Validate Header Functioanality",true);
			Thread.sleep(20);
			Assert.assertEquals(btn_headernewarrivals.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_headerclothing.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_headershoes.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_headerinspiration.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_headersale.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_headerstores.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(headerlogo.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_headershoppingbag.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_headerprofilebutton.isDisplayed(), true);
			Thread.sleep(20);
			Reporter.log("Validated Header Functionality successfully",true);
			return new LoginFunctionality();
		}	
		
		public LoginFunctionality validateFooter() throws InterruptedException {
			Reporter.log("Validate Footer Functioanality",true);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			for(int i=0;i<10;i++)
			{
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
			Assert.assertEquals(btn_FooterEmailus.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterChat.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterCallus.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterFeedback.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterContactUs.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterFAQ.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterOrderStatus.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterRequestCatalog.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterShipping.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterReturns.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterSpecialOffer.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterDoNotSell.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterTermsofUse.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footerwhoweare.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footercompassionfund.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footerperfectfit.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footercarrers.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterInvestors.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_FooterSocialResponsibility.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footercalifornia.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footeraccessibility.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footeregiftcard.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footergiftcard.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footergiftservices.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footerlearnmore.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footerapplynow.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(btn_Footeraccessyouraccount.isDisplayed(), true);
			Thread.sleep(20);
			Reporter.log("Validated Footer Functionality successfully",true);
			for(int i=0;i<10;i++)
			{
			jse.executeScript("window.scrollBy(0,-600)");
			}
			
			return new LoginFunctionality();
		}	
		
		public AddProduct_CheckoutFunctionality validatePdpPage() throws InterruptedException {
			Reporter.log("Validating the PDP Started", true);
			driver.switchTo().frame(promotionbox);
			btnclose.click();
			driver.switchTo().parentFrame();
			Thread.sleep(50);
			jse.executeScript("window.scrollBy(0,600)");
			Thread.sleep(1000);
			action.click(selectitemdescription).perform();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			for(int i=0;i<10;i++)
			{
			Thread.sleep(1000);
			}
			Assert.assertEquals(ql_heroimg.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(ql_sideimg.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(pdp_ItemDescription.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(pdp_bazaarvoice.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(ql_btnsizetype.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(ql_btncolor.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(btnsize.isDisplayed(),true);
			Thread.sleep(20);
			btnsize.click();
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Assert.assertEquals(ql_sizeguide.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(ql_fitpredicator.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(ql_quantity.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(btnaddtobag.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(ql_saveforlater.isDisplayed(),true);
			Thread.sleep(20);
			Assert.assertEquals(pdp_Sharethisproduct.isDisplayed(),true);
			Thread.sleep(20);
			btnaddtobag.click();
			btnviewshoppingcart.click();
			Reporter.log("PDP Validation Sucessful", true);
			return this;		
			}

		public LoginFunctionality validatePlpPage() throws InterruptedException {
			Reporter.log("Validating the PLP Started", true);
			driver.switchTo().frame(promotionbox);
			btnclose.click();
			driver.switchTo().parentFrame();
			Thread.sleep(50);
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
			return new LoginFunctionality();		
			}

		public LoginFunctionality validateSTLPlpPage() throws InterruptedException {
			Reporter.log("Adding STL item to Bag", true);
			jse.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			try
			{
			if(promotionbox.isDisplayed())
			{
			driver.switchTo().frame(promotionbox);
			btnclose.click();
			driver.switchTo().parentFrame();
			Thread.sleep(50);
			}
			}
			finally
			{
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
			Assert.assertEquals(STLqty.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLbtnATB.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLsaveforlater.isDisplayed(), true);
			Thread.sleep(20);
			Assert.assertEquals(STLfulldetails.isDisplayed(), true);
			Thread.sleep(20);
			STLbtnATB.click();
			Thread.sleep(1000);
			action.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(1000);
			action.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(1000);
			for(int i=0;i<10;i++)
			{
				Thread.sleep(1000);
			}
			Assert.assertEquals(txtATBConfirmation.getText(), "ADDED TO BAG");
			STLbtnClose.click();
		//	jse.executeScript("window.scrollBy(1000,0)");
			for(int i=0;i<10;i++)
			{
			Thread.sleep(100);
			}
			action.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(40);
			action.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(40);
			Reporter.log("Added STL item to Bag sucesfully", true);
			}
			return new LoginFunctionality();		
			}
		
		
		public AddProduct_CheckoutFunctionality validateSearchFunctionality() throws InterruptedException {
			Reporter.log("Validating the Search Functionality Started", true);
			try
			{
				if(promotionbox.isDisplayed())
				{
			driver.switchTo().frame(promotionbox);
			btnclose.click();
			driver.switchTo().parentFrame();
			Thread.sleep(50);
				}
			}
			finally
			{
			txtSearch.click();
			txtSearch.sendKeys("Wearever Crew-Neck Ballet-Sleeve Top");
			Thread.sleep(200);
			Assert.assertEquals(searchresults.isDisplayed(), true);
			searchresults.click();
			Thread.sleep(500);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(500);
			btnsize.click();
			// action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(20);
			btnaddtobag.click();
			btnviewshoppingcart.click();
			Reporter.log("Seacrh Validation Sucessful", true);
			}
			return new AddProduct_CheckoutFunctionality();	
			}
		
		public LoginFunctionality validateCompletetheLook() throws InterruptedException {
			Reporter.log("Validating Complete the Look Functionality Started", true);
			try
			{
				if(promotionbox.isDisplayed())
				{
			driver.switchTo().frame(promotionbox);
			btnclose.click();
			driver.switchTo().parentFrame();
			Thread.sleep(50);
				}
			}
			finally
			{
			txtSearch.click();
			txtSearch.sendKeys("Simply Supima® V-Neck Tunic");
			Thread.sleep(200);
			Assert.assertEquals(searchresults.isDisplayed(), true);
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
			int size= resultsCTL.size();
			//Assert.assertEquals(size, 4);
			Thread.sleep(20);
			int imgsize= imagesCTL.size();
		//	Assert.assertEquals(imgsize, 24);
		//	jse.executeScript("window.scrollBy(0,400)");
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			for(int i=0;i<size;i++)
			{
				//System.out.println(itemdescCTL.get(i).getText());
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
			for(int j=0;j<5;j++)
			{
				action.sendKeys(Keys.PAGE_UP).build().perform();
				Thread.sleep(20);
			}
			Thread.sleep(500);
			Reporter.log("Complete the Look Functionality Sucessfully", true);
			}
			return new LoginFunctionality();		
			}
		
		
		public LoginFunctionality selectPaginationOption()  throws InterruptedException {
			int i=  pagenavigation.size();
			System.out.println(i);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			jse.executeScript("window.scrollBy(0,450)");
			for(int j=0;j<i;j++)
			{
			try {
			if(pagecontent.isDisplayed())
			{
				Thread.sleep(5000);
				if(btnnexttop.isDisplayed())
				{
					Thread.sleep(5000);
				btnnexttop.click();
				System.out.println("NextButton is sucessfully clicked on page "+ (Integer.valueOf(j)+1));
				}
			}
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
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
			readValuesForAddress("Address_Fields","Address");
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
			select= new Select(drpdownstate);
			select.selectByVisibleText("Ohio");
			Thread.sleep(500);
			chkboxbillingaddress.click();
			Thread.sleep(500);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			//actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			//jse.executeScript("window.scrollBy(0,600)");
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
		
		public LoginFunctionality navigateToHomePage(){
			Reporter.log("Navigate to Home Page", true);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			//action.moveToElement(btnLogo);
			btnLogo.click();
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
//			if(btn_nothanks.isDisplayed())
//			{
//				btn_nothanks.click();
//			}
//			else
//			{
//				Reporter.log("Promotion Box not displayed");
//			}
			return new LoginFunctionality();
		}
		
		public AddProduct_CheckoutFunctionality savedaddress_paymentPage_addnewJjillCC() throws InterruptedException{
			Reporter.log("Payment Process Started", true);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
		//	jse.executeScript("window.scrollBy(0,600)");
			//remove all added cards.
			chkjjillcc.click();
			//btnaddnewcard.click();
			readValuesForcards("Cards","Cards");
			txtcardnumber.sendKeys(TestBase.testData.get().getJJILLCC());
			Thread.sleep(500);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			btndontsavecreditcard.click();
			Thread.sleep(200);
			btnReview.click();
			Reporter.log("Payment Process Completed", true);
			return new AddProduct_CheckoutFunctionality();
		}
		
		public AddProduct_CheckoutFunctionality newaddress_paymentPage_addnewJjillCC() throws InterruptedException{
			//		jse.executeScript("window.scrollBy(0,600)");
					Reporter.log("Payment Process Started", true);
					btnpayment.click();
					driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
					jse.executeScript("window.scrollBy(0,600)");
				//	btnaddnewcard.click();
					Thread.sleep(500);
					chkjjillcc.click();
					Thread.sleep(500);
					readValuesForcards("Cards","Cards");
					txtcardnumber.click();
					txtcardnumber.sendKeys(TestBase.testData.get().getJJILLCC());
					Thread.sleep(50);
				//	chkshippingAddress.click();
					Thread.sleep(500);
					action.sendKeys(Keys.PAGE_DOWN).build().perform();
				//	btnAdd.click();
				//	Thread.sleep(500);
//					btnjillcard.click();
			//		Thread.sleep(500);
					jse.executeScript("window.scrollBy(0,600)");
					btnReview.click();
					Reporter.log("Payment Process Completed", true);
					Thread.sleep(1000);
					return new AddProduct_CheckoutFunctionality();
				}


		public AddProduct_CheckoutFunctionality orderReview_PlaceOrder() throws InterruptedException{
			Reporter.log("Review Page", true);
			if(txtreview.isDisplayed())
			{
				jse.executeScript("window.scrollBy(0,600)");
				btnplaceorder.click();
			}
			Reporter.log("Order Placed Sucessfully ", true);
			return new AddProduct_CheckoutFunctionality();
		}
		
		public AddProduct_CheckoutFunctionality ReviewOrderDetails() throws InterruptedException{
			Reporter.log("Review Order Details Page", true);
			if(txtorder.isDisplayed())
			{
				String ordernumber= txtOrderNumber.getText();
			}
			Reporter.log("Order Placed Sucessfully ", true);
			return new AddProduct_CheckoutFunctionality();
		}

		public LoginFunctionality ConnectingMethod() {
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


		

}

