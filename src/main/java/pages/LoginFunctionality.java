package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import testbase.TestBase;
import utilities.ElementOperations;
import utilities.Utility;

public class LoginFunctionality extends ElementOperations{
	
		WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
		static Utility util = new Utility();
		
		//Object Repository
		@FindBy(xpath = "(//button[@type='button'])[3]//span[contains(text(),'my account')]")
		WebElement btnmyaccount;

		@FindBy(xpath = "//input[@id='logonId']")
		WebElement username;

		@FindBy(xpath = "//input[@id='logonPassword']")
		WebElement password;
		
		
		@FindBy(xpath = "//button[@data-provider='google']")
		WebElement btn_slackgoogle;
		
		@FindBy(xpath = "//input[@type='email']")
		WebElement gmail_username;

		@FindBy(xpath = "//input[@type='password']")
		WebElement gmail_password;
		
		@FindBy(xpath = "//span[contains(text(),'Next')]")
		WebElement gmail_nextbtn;
		
		@FindBy(xpath = "//a[contains(@href,'forget')]")
		WebElement btnforgotpassword;
		
		@FindBy(xpath = "//div[contains(text(),'Submit')]")
		WebElement btnSubmit;
		
		@FindBy(css= "p#successMessagePara")
		WebElement resetlinkmessage;	
		
		
		@FindBy(xpath = "//div[contains(@class,'emailinput')] /input")
		WebElement txtemailaddress;
		
		@FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign In')]")
		WebElement btnsignin;
		
		@FindBy(xpath="//button[@name='profile-button']")
		WebElement btnaccount;
		
		@FindBy(xpath="//span[@class='signin-user']")
		WebElement STLbtnaccount;

		@FindBy(xpath="//span[contains(text(),'Sign Out')]")
		WebElement btnLogout;
		
		@FindBy(xpath="(//a[contains(text(),'Sign Out')])[1]")
		WebElement STLbtnLogout;
		
		@FindBy(xpath="//iframe[@frameborder='0']")
		WebElement promotionbox;
		
		@FindBy(xpath="//span[contains(text(),'x')]")
		WebElement btnclose;

		@FindBy(css="img[alt*='logo']")
		WebElement btnLogo;		
		
		private int sleeplow;
		Actions action = new Actions(driver);
		
		public LoginFunctionality() {
			PageFactory.initElements(driver, this);
		}
		
		public AddProduct_CheckoutFunctionality JJill_Login() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			waitforElementVisiblility(btnmyaccount, sleeplow).click();
			readValuesForLogin("Login_Data", "Login");
			Reporter.log("Enter Username and Password",true);
			username.sendKeys(TestBase.testData.get().getUserEmail());
			waitforElementVisiblility(password,sleeplow);
			password.sendKeys(TestBase.testData.get().getUserPassword());
			waitforElementVisiblility(btnsignin,sleeplow);
			btnsignin.click();
			Reporter.log("Login Successful",true);
			Thread.sleep(500);
			/*try {
				Thread.sleep(500);
				if(promotionbox.isDisplayed())
				{
			driver.switchTo().frame(promotionbox);
			btnclose.click();
			driver.switchTo().parentFrame();
			Thread.sleep(50);
		}}*/
			/*finally
			{*/
			String title= driver.getTitle();
			Assert.assertEquals(title, "Women's apparel, accessories, and footwear from J.Jill");
			/* } */
			
			return new AddProduct_CheckoutFunctionality();
		}
		
		
		
		public LoginFunctionality JJillLogin_ForgotPassword() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			waitforElementVisiblility(btnmyaccount, sleeplow).click();
			readValuesForLogin("Login_Data", "Login");
			Reporter.log("Enter Username",true);
			username.sendKeys(TestBase.testData.get().getUserEmail());
			btnforgotpassword.click();
			txtemailaddress.sendKeys(TestBase.testData.get().getUserEmail());
			btnSubmit.click();
			String resetlinkconfirmationmsg= resetlinkmessage.getText();
			Reporter.log("An Email has been sent sucessfully",true);
			Assert.assertEquals(resetlinkconfirmationmsg, "An email has been sent to " +TestBase.testData.get().getUserEmail()+ " containing information on how to reset your password.");
			btnLogo.click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			return new LoginFunctionality();
		}
		
		/*
		 * public LoginFunctionality JJill_ValidateForgotPassword_Gmail() throws
		 * InterruptedException { driver.manage().timeouts().implicitlyWait(20,
		 * TimeUnit.SECONDS);
		 * Reporter.log("Logging into Gmail to check the Forgot Password email",true);
		 * Thread.sleep(10000); driver.get("https://stackoverflow.com/users/login");
		 * btn_slackgoogle.click(); // waitforElementVisiblility(btnmyaccount,
		 * sleeplow).click(); readValuesForLogin("Login_Data", "Login");
		 * Reporter.log("Enter Username and Password",true);
		 * gmail_username.sendKeys(TestBase.testData.get().getUserEmail());
		 * gmail_nextbtn.click();
		 * gmail_password.sendKeys(TestBase.testData.get().getPassword());
		 * gmail_nextbtn.click(); Reporter.log("Logged into gmail sucessfully",true);
		 * String title= driver.getTitle(); System.out.println(title); //
		 * Assert.assertEquals(resetlinkconfirmationmsg, "An email has been sent to "
		 * +TestBase.testData.get().getUserEmail()+
		 * " containing information on how to reset your password."); //
		 * btnLogo.click(); // driver.manage().timeouts().implicitlyWait(100,
		 * TimeUnit.SECONDS); return new LoginFunctionality(); }
		 */
		
		public LoginFunctionality JJill_Logout() throws InterruptedException {
			Reporter.log("Logging out of application", true);
			Thread.sleep(500);
			btnaccount.click();
			btnLogout.click();
			Reporter.log("Logout successful", true);
			return new LoginFunctionality();
		}
		
		public LoginFunctionality JJill_STLLogout() throws InterruptedException {
			Reporter.log("Logging out of STL page of the application", true);
			Thread.sleep(20);
			STLbtnaccount.click();
			for(int i=0;i<20;i++)
			{
			Thread.sleep(30);
			}
			STLbtnLogout.click();
			Reporter.log("Logout of STL is successful", true);
			return new LoginFunctionality();
		}
		
		public static void readValuesForLogin(String sheetName, String scenario) {
			Reporter.log("Fetch the useremail and password from the test data sheet and set it", true);
			TestBase.testData.get().setUserEmail(util.readCellValue(sheetName, scenario, "UserEmail"));
			TestBase.testData.get().setUserPassword(util.readCellValue(sheetName, scenario, "Password"));
			Reporter.log("Fetched the useremail and password from the test data sheet successfully", true);
		
		} 

	}



