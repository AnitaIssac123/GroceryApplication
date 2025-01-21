package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.FileUpload;
import utilities.GeneralUtilities;
import utilities.WaitUtilities;

public class CategoryPage {
	
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	FileUpload fp=new FileUpload();
	WaitUtilities wu=new WaitUtilities();
	public CategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()=' Search']")WebElement searchfield;
	@FindBy(xpath="//input[@class='form-control']")WebElement entercategoryname;
	@FindBy(xpath="//button[text()='Search']")WebElement searchname;
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']")WebElement resultnotfoundmessage;
	@FindBy(xpath="//a[text()=' New']")WebElement newbutton;
	@FindBy(xpath="//input[@placeholder='Enter the Category']")WebElement categoryfield;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement  selectgroupsfield;
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	@FindBy(xpath="//input[@checked='checked' and@name='top_menu']") WebElement topmenuradiobutton;
	@FindBy(xpath="//input[@name='show_home' and@value='no']") WebElement leftmenubutton;
	@FindBy(xpath="//button[@type='submit']") WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement getalertmessage;
	
	
	public CategoryPage clickonSearchbutton()
	{
		searchfield.click();
		return this;
	}
	public CategoryPage entercategoryName()
	{
		entercategoryname.sendKeys("vegetablesanddriedfruits");
		return this;
		
	}
	
	public CategoryPage clickonSearchButton2()
	{
		searchname.click();
		
		return this;
	}
	public boolean checkonresultmessage()
	{
		return resultnotfoundmessage.isDisplayed();
	}
	public CategoryPage clickonNewButton()
	{
		
		newbutton.click();
		return this;
	}
	
	public CategoryPage categoryfield()
	{
		categoryfield.sendKeys("biscuit"+gu.generateCurrentDateAndTime());
		return this;
		
	}
	public CategoryPage selectGroups()
	{
		selectgroupsfield.click();
		return this;
	}
	public CategoryPage choosefile()
	{
		
		gu.scrollToElement(driver, choosefile);
		fp.fileuploadSendkeys(choosefile);
		wu.waitUntilElementIsVisible(driver, choosefile);
		return this;
		
	}
	
	public CategoryPage selectTopmenuradiobutton()
	{
		
		
		gu.scrollToElement(driver, topmenuradiobutton);
		gu.hoverOverElement(driver,topmenuradiobutton);
		
		//gu.selectRadioButton(topmenuradiobutton);
		
		return this;
		
	}
	
	public CategoryPage selectLeftmenuButton()
	{
		//gu.selectRadioButton(leftmenubutton);
		gu.scrollToElement(driver, leftmenubutton);
		gu.hoverOverElement(driver,leftmenubutton);
		return this;
	}
	public CategoryPage clickonSaveButton()
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



