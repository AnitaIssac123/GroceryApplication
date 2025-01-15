package pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ExcelUtility;
import utilities.GeneralUtilities;

public class LoginPage {
	
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	
	public LoginPage(WebDriver driver)
	
	{this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	
	}
	
	@FindBy(xpath="//input[@name='username']" )WebElement usernamefield; ;
	@FindBy(xpath="//input[@name='password']")WebElement passwordfield;
	@FindBy(xpath="//button[text()='Sign In']") WebElement signinbutton;
	@FindBy(xpath="//span[text()='7rmart supermarket']") WebElement homepage;
    @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alertmessage;
	
	public LoginPage enterUserName(String username)
	{
		usernamefield.sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password)
	{
		passwordfield.sendKeys(password);
		return this;
		
	}
	
	public HomePage clickOnLogin()
	{
		gu.clickOnElement(signinbutton);
		return new HomePage(driver);
	
	}
	
	public boolean homePagedDisplayed()
	{
		return homepage.isDisplayed();
	}
	
	public String getAlert()
	
	
	{
		
		return alertmessage.getText();
	}
	
	public HomePage loginByUsingExcelData() throws IOException
	{
		String username=ExcelUtility.readStringData(1, 0,"LoginPage");
		
		String password=ExcelUtility.readStringData(1, 1,"LoginPage");
		
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		gu.clickOnElement(signinbutton);
		return new HomePage(driver);
	}
	
	
}