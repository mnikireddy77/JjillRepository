package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import testbase.TestBase;
import utilities.ElementOperations;
import utilities.Utility;

public class LoginFunctionality extends ElementOperations {

	WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
	static Utility util = new Utility();
	TestBase testbase= new TestBase();
	

	// Object Repository
	@FindBy(xpath = "(//button[@type='button'])[3]//span[contains(text(),'my account')]")
	WebElement btnmyaccount;

	@FindBy(xpath = "//input[@id='logonId']")
	WebElement username;

	@FindBy(xpath = "//input[@id='logonPassword']")
	WebElement password;

	@FindBy(xpath = "//a[contains(@href,'forget')]")
	WebElement btnforgotpassword;
	
	@FindBy(xpath = "//button[@data-provider='google']")
	WebElement btn_slackgoogle;

	@FindBy(xpath = "//a[@alt='Sign in']")
	WebElement yahoo_signin;
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement yahoo_username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement yahoo_password;

	@FindBy(xpath = "//input[@value='Next']")
	WebElement yahoo_nextbtnemail;
	
	@FindBy(xpath = "//button[@value='Next']")
	WebElement yahoo_nextbtnpwd;

	@FindBy(xpath = "(//span[@data-test-id='message-subject'])[1]")
	WebElement yahoo_subject;
	
	@FindBy(xpath = "//a[contains(@href,'ResetPasswordForm')]")
	WebElement yahoo_Resetlink;
	
	@FindBy(xpath = "//input[@id='logonPassword']")
	WebElement newpassword;
	
	@FindBy(xpath = "//input[@id='logonPasswordVerify']")
	WebElement confirmpassword;

	@FindBy(xpath = "//div[contains(text(),'Submit')]")
	WebElement btnSubmit;
	
	@FindBy(xpath = "//b[contains(text(),'reset')]")
	WebElement txtresetsucessful;

	@FindBy(xpath = "(//img[@alt='Jjill logo'])[2]")
	WebElement btnlogo;
	
	

	@FindBy(xpath = "//p[@id='logonPassword_error']")
	WebElement msgerror;

	//span[@class="error_msg"]
	@FindBy(css = "p#successMessagePara")
	WebElement resetlinkmessage;

	@FindBy(xpath = "//div[contains(@class,'emailinput')] /input")
	WebElement txtemailaddress;

	@FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign In')]")
	WebElement btnsignin;

	@FindBy(xpath = "//button[@name='profile-button']")
	WebElement btnaccount;

	@FindBy(xpath = "//span[@class='signin-user']")
	WebElement STLbtnaccount;

	@FindBy(xpath = "//span[contains(text(),'Sign Out')]")
	WebElement btnLogout;

	@FindBy(xpath = "(//a[contains(text(),'Sign Out')])[1]")
	WebElement STLbtnLogout;

	@FindBy(xpath = "//iframe[@frameborder='0']")
	WebElement promotionbox;

	@FindBy(xpath = "//span[contains(text(),'x')]")
	WebElement btnclose;

	@FindBy(css = "img[alt*='logo']")
	WebElement btnLogo;

	private int sleeplow;
	Actions action = new Actions(driver);
	JavascriptExecutor jse = (JavascriptExecutor)driver;

	public LoginFunctionality() {
		PageFactory.initElements(driver, this);
	}

	public AddProduct_CheckoutFunctionality JJill_Login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		waitforElementVisiblility(btnmyaccount, sleeplow).click();
		readValuesForLogin("Login_Data", "Login");
		Reporter.log("Enter Username and Password", true);
		username.sendKeys(TestBase.testData.get().getUserEmail());
		waitforElementVisiblility(password, sleeplow);
		password.sendKeys(TestBase.testData.get().getUserPassword());
		waitforElementVisiblility(btnsignin, sleeplow);
		btnsignin.click();
		Reporter.log("Login Successful", true);
		Thread.sleep(500);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Women's apparel, accessories, and footwear from J.Jill");

		return new AddProduct_CheckoutFunctionality();
	}

	public LoginFunctionality JJillLogin_ForgotPassword() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		waitforElementVisiblility(btnmyaccount, sleeplow).click();
		readValuesForLogin("Login_Data", "ForgotPassword");
		Reporter.log("Enter Username", true);
		username.sendKeys(TestBase.testData.get().getUserEmail());
		btnforgotpassword.click();
		txtemailaddress.sendKeys(TestBase.testData.get().getUserEmail());
		btnSubmit.click();
		String resetlinkconfirmationmsg = resetlinkmessage.getText();
		Reporter.log("An Email has been sent sucessfully", true);
		Assert.assertEquals(resetlinkconfirmationmsg, "An email has been sent to "
				+ TestBase.testData.get().getUserEmail() + " containing information on how to reset your password.");
		btnLogo.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		return new LoginFunctionality();
	}

	
	  public LoginFunctionality JJill_ValidateForgotPassword_Yahoo() throws
	  InterruptedException { driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  Reporter.log("Logging into Yahoo mail to check the Forgot Password email",true);
	  Thread.sleep(500000); 
	  driver.get("https://login.yahoo.com/?.src=ym&pspid=1197806870&activity=header-signin&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
	 // yahoo_signin.click();
	  readValuesForLogin("Login_Data", "ForgotPassword");
	  Reporter.log("Enter Username and Password",true);
	  yahoo_username.sendKeys(TestBase.testData.get().getUserEmail());
	  yahoo_nextbtnemail.click();
	  Thread.sleep(300);
	  yahoo_password.sendKeys(TestBase.testData.get().getUserPassword());
	  yahoo_nextbtnpwd.click(); 
	  Thread.sleep(20);	  
	  Reporter.log("Logged into yahoo mail sucessfully",true);
	 String subject= yahoo_subject.getText();
	 for(int i=0;1<3;i++)
	 {
	  if(subject.contentEquals("MyAccount Forgot Password"))
	  {
		  yahoo_subject.click();
		  break;
	  }
	  else
	  {
		  Thread.sleep(500000);
	  }
	 }
	 action.sendKeys(Keys.PAGE_DOWN).build().perform();
	 Thread.sleep(200);
	 yahoo_Resetlink.click();
	 String parentwindow= driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles(); 
		for(String wh:allWindowHandles)
		{
			driver.switchTo().window(wh);
			String title= driver.getTitle();
			System.out.println(title);
			
			if(title.contentEquals("Password"))
			{
				String random= testbase.generateRandomPassword(14); 
				System.out.println(random);
				newpassword.sendKeys(random);
				confirmpassword.sendKeys(random);
				btnSubmit.click();
				try 
				{
				if(msgerror.isDisplayed())
				{
					String random1= testbase.generateRandomPassword(14); 
					System.out.println(random1);
					newpassword.clear();
					newpassword.sendKeys(random1);
					confirmpassword.clear();
					confirmpassword.sendKeys(random1);
					btnSubmit.click();
				}
				}
				catch(Exception e)
				{
					break;
				}
			}
			
		}
		Assert.assertEquals(txtresetsucessful.isDisplayed(), true);
		Thread.sleep(20);
		driver.close();
		driver.switchTo().window(parentwindow);
		Thread.sleep(20);
	  return new LoginFunctionality(); 
	  }
	 

	public LoginFunctionality JJill_Logout() throws InterruptedException {
		Reporter.log("Logging out of application", true);
		Thread.sleep(600);
		btnaccount.click();
		Thread.sleep(500);
		btnLogout.click();
		Reporter.log("Logout successful", true);
		return new LoginFunctionality();
	}

	public LoginFunctionality JJill_STLLogout() throws InterruptedException {
		Reporter.log("Logging out of STL page of the application", true);
		Thread.sleep(20);
		STLbtnaccount.click();
		for (int i = 0; i < 20; i++) {
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
