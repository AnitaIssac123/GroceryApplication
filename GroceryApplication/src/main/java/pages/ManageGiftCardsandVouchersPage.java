package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.GeneralUtilities;

public class ManageGiftCardsandVouchersPage {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	public ManageGiftCardsandVouchersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
@FindBy(xpath="//a[text()='More info ' and@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")WebElement adminusersmoreinfofield;
	@FindBy(xpath="//a[text()=' New']")WebElement newbutton;
	@FindBy(xpath="//input[@id='username']")WebElement usernamefield;
	@FindBy(xpath="//input[@id='password']")WebElement passwordfield;
	@FindBy(xpath="//select[@id='user_type']")WebElement selectusertypefield;
	@FindBy(xpath="//button[@name='Create']")WebElement savebutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/home' and@class='brand-link navbar-dark']")WebElement dashboardinfofield;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
	public ManageGiftCardsandVouchersPage clickonAdminUsersinfofield()
	{
		adminusersmoreinfofield.click();
		return this;
	}
	public ManageGiftCardsandVouchersPage  clickonNewButton()
	{
		newbutton.click();
		return this;
	}
	public ManageGiftCardsandVouchersPage enterusernamefield()
	{
		
		usernamefield.sendKeys("anita"+gu.generateCurrentDateAndTime());
		return this;
	}
	public ManageGiftCardsandVouchersPage enterpasswordfield()
	{
		passwordfield.sendKeys("anita");
		return this;
	}
	public ManageGiftCardsandVouchersPage selectusertypefield()
	{
		gu.selectDropdownWithIndex(selectusertypefield, 1);
		
		return this;
		
	}
	public ManageGiftCardsandVouchersPage clickonSavebutton()
	{
		savebutton.click();
		return this;
	}
	public boolean getAlertmessage()
	{
		return alertmessage.isDisplayed();
	}
}
