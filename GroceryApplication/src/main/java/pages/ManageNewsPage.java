package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GeneralUtilities;

public class ManageNewsPage {
	
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	
	
	public ManageNewsPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()=' New']")WebElement newbutton;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")WebElement enterthenewsfield;
	@FindBy(xpath="//button[text()='Save']")WebElement savebuttonfield;
	@FindBy(xpath="//a[text()=' Search']")WebElement searchbutton;
	@FindBy(xpath="//input[@placeholder='Title']")WebElement enterthetitle;
	@FindBy(xpath="//button[text()='Search']")WebElement searchnewsbutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/edit?edit=2396&page_ad=1' and@class='btn btn-sm btn btn-primary btncss']")WebElement editbutton;
	@FindBy(xpath="//textarea[@id='news']")WebElement updatenewsfield;
	@FindBy(xpath="//button[text()='Update']")WebElement updatebutton;
	@FindBy(xpath="//a[text()=' Reset']")WebElement resetbutton;
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']")WebElement updatebutton2;
	@FindBy(xpath="//textarea[@name='news']")WebElement newsfield;
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']")WebElement resultnotfoundmessage;
	@FindBy(xpath="//button[text()='Update']")WebElement updatebutton3;
	public ManageNewsPage clickonNewsButton()
	{
		newbutton.click();
		return this;
	}
	public ManageNewsPage enterthenewsfield()
	{
		enterthenewsfield.sendKeys("Manmohansingh died");
		return this;
	}
	public ManageNewsPage clickonSaveButton()
	{
		savebuttonfield.click();
		return this;
	}
	public ManageNewsPage clickonSearchButton()
	{
		searchbutton.click();
		return this;
	}
	public ManageNewsPage enterTitle()
	{
		enterthetitle.sendKeys("Manmohansingh died hello");
		return this;
	}
	public ManageNewsPage clickonSearchNewButton()
	{
		searchnewsbutton.click();
		return this;
	}
	
	public boolean checkonResultnotfoundmessage()
	{
		return resultnotfoundmessage.isDisplayed();
	}
	public ManageNewsPage clickonResetButton()
	{
		resetbutton.click();
		return this;
	}
	public ManageNewsPage  clickonupdatebutton()
	{
		updatebutton2.click();
		return this;
	}
	
	public ManageNewsPage entherthenewsField()
	{
		newsfield.clear();
		newsfield.sendKeys("manmohan singh died date");
		return this;
	}
	
	public ManageNewsPage clickonUpdateButton3()
	{
		updatebutton3.click();
	
		return this;
	}
}
