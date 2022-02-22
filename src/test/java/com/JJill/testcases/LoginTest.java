package com.JJill.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginFunctionality;
import pojo.TestData;
import testbase.TestBase;
import utilities.Utility;

public class LoginTest extends TestBase{
	private static Utility util; 
	private static LoginFunctionality loginpage;


	@BeforeMethod(alwaysRun=true)
	public void setup() {
		TestBase.testData.set(new TestData());
		Initialization();
		util = new Utility();
		loginpage=new LoginFunctionality();
	}
	
	@Test(groups={"SmokeTest","Production"}) 
	public void verifyLoginInFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.ConnectingMethod()
		.JJill_Logout();
	}
//	
	@Test(groups= {"Staging"})
	public void verifyCheckoutFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.selectClothingDepartment()
		.selectItemDetails()
		.checkoutProcess()
		.savedaddress_paymentPage_addnewJjillCC()
		//.addnewAddress()
		//.newaddress_paymentPage_addnewJjillCC()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"}) 
	public void verifyPDPFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.selectClothingDepartment()
		.validatePdpPage()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"}) 
	public void verifyPLPFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.selectSaleDepartment()
		.validatePlpPage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"})
	public void verifySearchFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.validateSearchFunctionality()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"})
	public void verifyCompletetheLook() throws InterruptedException{
		loginpage.JJill_Login()
		.validateCompletetheLook()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"}) 
	public void verifyShoptheLook() throws InterruptedException{
		loginpage.JJill_Login()
		.selectSTLDepartment()
		.validateSTLPlpPage()
		.JJill_STLLogout();
	}
	
	@Test(groups={"SmokeTest","Production"}) 
	public void verifyMonetateBadging() throws InterruptedException{
		loginpage.JJill_Login()
		.selectSaleDepartment()
		.validateMonetateBadging()
		.JJill_Logout();
	}
	
	
	@Test(groups={"SmokeTest","Production"}) 
	public void verifyPaginationFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.selectClothingDepartment()
		.selectPaginationOption()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"}) 
	public void verifyHeaderFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.validateHeader()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"}) 
	public void verifyFooterFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.validateFooter()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"},priority=10) 
	public void verifyInventoryData() throws InterruptedException{
		loginpage.JJill_Login()
		.validateOOSFunctionality()
		.validateLowInventoryFunctionality()
		.validateBackOrderedFunctionality()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"},priority=11) 
	public void verifyQuickLookFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.selectClothingDepartment()
		.validateQuickLookScreen()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"},priority=12) 
	public void verifyForgotPasswordFunctionality() throws InterruptedException{
		loginpage.
		JJillLogin_ForgotPassword()
		.JJill_ValidateForgotPassword_Yahoo();
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.close();
	}
	
	@AfterTest(alwaysRun=true)
	public void closeAll()
	{
	driver.quit();	
	}

}
