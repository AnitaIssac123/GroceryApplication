package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.FileUpload;
import utilities.GeneralUtilities;
import utilities.WaitUtilities;

public class ManageCategoryPage {
	WebDriver driver;
	FileUpload fp=new FileUpload();
	GeneralUtilities gu=new GeneralUtilities();
	WaitUtilities wu=new WaitUtilities();
	
	
	public ManageCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()=' New']")WebElement newbutton;
	@FindBy(xpath="//input[@placeholder='Enter the Category']")WebElement categoryfield;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement  selectgroupsfield;
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	@FindBy(xpath="//input[@checked='checked' and@name='top_menu']") WebElement topmenuradiobutton;
	@FindBy(xpath="//input[@name='show_home' and@value='no']") WebElement leftmenubutton;
	@FindBy(xpath="//button[@type='submit']") WebElement savebutton;
	//@FindBy(xpath="//button[text()='Save']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement getalertmessage;
	
	
	
	public ManageCategoryPage clickonNewButton()
	{
		
		newbutton.click();
		return this;
	}
	
	public ManageCategoryPage categoryfield()
	{
		categoryfield.sendKeys("biscuit"+gu.generateCurrentDateAndTime());
		return this;
		
	}
	public ManageCategoryPage selectGroups()
	{
		selectgroupsfield.click();
		return this;
	}
	public ManageCategoryPage choosefile()
	{
		
		gu.scrollToElement(driver, choosefile);
		fp.fileuploadSendkeys(choosefile);
		wu.waitUntilElementIsVisible(driver, choosefile);
		return this;
		
	}
	
	public ManageCategoryPage selectTopmenuradiobutton()
	{
		
		
		gu.scrollToElement(driver, topmenuradiobutton);
		gu.hoverOverElement(driver,topmenuradiobutton);
		
		//gu.selectRadioButton(topmenuradiobutton);
		
		return this;
		
	}
	
	public ManageCategoryPage selectLeftmenuButton()
	{
		//gu.selectRadioButton(leftmenubutton);
		gu.scrollToElement(driver, leftmenubutton);
		gu.hoverOverElement(driver,leftmenubutton);
		return this;
	}
	public ManageCategoryPage clickonSaveButton()
	{
		
		wu.waitUntilClickable(driver, savebutton);
		
		//gu.scrollToElement(driver, savebutton);
		
		savebutton.click();
		
		return this;
		
	}
	public boolean getAlertMessage()
	
	{
		return getalertmessage.isDisplayed();
		
	}

}
