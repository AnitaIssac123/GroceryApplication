package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.FileUpload;
import utilities.GeneralUtilities;

public class SubCategoryPage   {
	
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	FileUpload fp=new FileUpload();
	
	
	public SubCategoryPage(WebDriver driver){
		// TODO Auto-generated constructor stub
	
		this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	
	}
	

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newtabbutton;

@FindBy(xpath="//select[@class='form-control selectpicker']") WebElement categorydropdown;

@FindBy(xpath="//input[@placeholder='Enter the Subcategory']") WebElement subcategory;

@FindBy(xpath="//input[@type='file']") WebElement choosefile;

@FindBy(xpath="//button[text()='Save']" )WebElement savebutton;

@FindBy(xpath="//a[text()=' Search']") WebElement searchbutton;

@FindBy(xpath="//select[@class='form-control selectpicker']") WebElement selectfield;

@FindBy(xpath="//button[text()='Search']") WebElement searchbutton2;
@FindBy(xpath="//h4[text()='Search List Sub Categories']")WebElement searchtext;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
public SubCategoryPage clickOnNewTabButton()

{
	newtabbutton.click();
	return this;
}

public SubCategoryPage selectCategory()
{
	gu.selectDropdownWithIndex(categorydropdown, 5);
	
	return this;
}

public SubCategoryPage subCategory()
{
	subcategory.sendKeys("Building Blocks"+gu.generateCurrentDateAndTime());
	return this;
	
}

public SubCategoryPage chooseFileImage()
{
	fp.fileuploadSendkeys(choosefile);
	return this;
	
}

public SubCategoryPage clickOnSaveButton()
{
	gu.scrollToElement(driver, choosefile);
	savebutton.click();
	return this;
	
	
}
public boolean getAlertMessage()
{
	return alertmessage.isDisplayed();
}


public SubCategoryPage clickOnSearchButton()
{

	return this;
}


public SubCategoryPage enterTheSearchItems()
{ gu.selectDropdownWithIndex(selectfield, 5);
	return this;
	
}
public SubCategoryPage clickOnSearchButton2()
{
	searchbutton2.click();
	return this;
}


}