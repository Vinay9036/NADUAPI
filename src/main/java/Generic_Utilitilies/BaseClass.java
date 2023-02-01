package Generic_Utilitilies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	ExcelUtility elib = new ExcelUtility();
	FileUtility flib = new FileUtility();
	WebDriverUtility wlib = new WebDriverUtility();
	JavaUtility jlib = new JavaUtility();

	@BeforeSuite
	public void configBS() {
		System.out.println("Connect to DB");
	}
	@BeforeTest
	public void configBT() {
		System.out.println("Test");
	}
	@BeforeClass
	public void configBC() {
		System.out.println("Launch browser");
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://webmail.akadevqa.com/owa/");
	}
	
	@BeforeMethod
	public void configBM() {
		System.out.println("Enter URL");
		
	}
	
	@AfterMethod
	public void configAM() {
		System.out.println("Logout");
	}
	
	@AfterClass
	public void configAC() {
		System.out.println("close browser");
		driver.close();;
	}
	@AfterTest
	public void configAT() {
		System.out.println("Test");
	}
	@AfterSuite
	public void config() {
		System.out.println("Close DB");
	}
}
