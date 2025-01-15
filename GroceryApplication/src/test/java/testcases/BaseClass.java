package testcases;


import constants.Constants;
import utilities.ScreenshotUtility;
import utilities.WaitUtilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	
  public WebDriver driver;
  Properties prop;
  FileInputStream fs;
  WaitUtilities waitutility=new  WaitUtilities();
  @BeforeMethod(alwaysRun=true)
  @Parameters("browser")
  public void initializebrowser(String browser) throws Exception {
	  prop=new Properties();
	  fs=new FileInputStream(Constants.CONFIGFILE);
	  prop.load(fs);
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
  
  driver=new ChromeDriver();}
else if(browser.equalsIgnoreCase("Edge"))
{
			driver=new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
				{
					driver=new FirefoxDriver();
					
				}
		else
		{
			throw new Exception("Invalid Browser");
		}
		
	  
	  driver.get(prop.getProperty("url"));

	  driver.manage().window().maximize();
	  waitutility.implicitWait(driver);
	  
  }
  
  @AfterMethod(alwaysRun=true)
  public void driverQuit(ITestResult itestresult) throws IOException {
	 
	  if(itestresult.getStatus()==ITestResult.FAILURE)
		{
		  ScreenshotUtility screenshot=new ScreenshotUtility();
			screenshot.getScreenShot(driver,itestresult.getName());
			
		}
	  
	  //driver.quit();
 }

}
