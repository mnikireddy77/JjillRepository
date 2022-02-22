package testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import pojo.TestData;


public class TestBase {
	
	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriver driver;
	
	public static final ThreadLocal<TestData> testData = new ThreadLocal<TestData>();
	Random random= new Random();
	
	public TestBase() 
	    {
		prop = new Properties();
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + File.separator +"src" + File.separator +"main" + File.separator 
					+"java" + File.separator +"config" + File.separator + "config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		  catch (IOException e) {
			e.printStackTrace();
		}		
        }
	
	
	public void Initialization() {
		String Browser = prop.getProperty("browser");
		if(Browser.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitkhitha.kuthukur\\OneDrive - J.Jill\\Automation\\Drivers\\chromedriver.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-notifications");
			options.addArguments("--enable-automation");
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-save-password-bubble");
			options.addArguments("--test-type");
			//options.addArguments("--headless");
			//options.addArguments("--start-maximized");
		//	options.addArguments("--window-size=1920,1080");
    //options.addArguments("--headless", "--disable-gpu", "--window-size=1936,1056");		

			//			Reporter.log("Chrome options added successfully",true);
			driver = new ChromeDriver(options);
		} 
		
		else if (Browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(Browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + File.separator + "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS); 
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			    capabilities.setCapability("requireWindowFocus", true);
			    capabilities.setCapability("ignoreZoomSetting", true);
			    capabilities.setCapability("ignoreProtectedModeSettings", true);
			    capabilities.setCapability("IntroduceInstabilityByIgnoringProtectedModeSettings", true);
			    capabilities.setCapability("nativeEvents", true);
			    capabilities.setCapability("INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS", true);
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get(prop.getProperty("signinurl"));
	//	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}
	
	/*
	 * public String Random() { int leftLimit = 97; // letter 'a' int rightLimit =
	 * 122; // letter 'z' int targetStringLength = 15; Random random = new Random();
	 * 
	 * String generatedString = random.ints(leftLimit, rightLimit + 1)
	 * .limit(targetStringLength) .collect(StringBuilder::new,
	 * StringBuilder::appendCodePoint, StringBuilder::append) .toString();
	 * 
	 * return generatedString;
	 * 
	 * }
	 */
	
	public String generateRandomPassword(int len)
    {
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$^&*()";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }

	
	
}

