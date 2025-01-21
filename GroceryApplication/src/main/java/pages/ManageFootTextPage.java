package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GeneralUtilities;

public class ManageFootTextPage {
	
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	public ManageFootTextPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement editbutton;
	@FindBy(xpath="//textarea[@name='address']") WebElement addressfield;

	@FindBy(xpath="//input[@name='phone']") WebElement phonenumberfield;
	@FindBy(xpath="//button[@name='Update']")WebElement updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
	
	
	public ManageFootTextPage clickoneditbutton()
	{
		editbutton.click();
		return this;
}
	public ManageFootTextPage enterAddressField()
	{
		addressfield.clear();
		addressfield.sendKeys("mamoottil");
		return this;
	}
	public  ManageFootTextPage enterPhonenumberField()
	{
		phonenumberfield.clear();
		phonenumberfield.sendKeys("7510502597");
		return this;
	}
	public  ManageFootTextPage clickonUpdateButton()
	{
		updatebutton.click();
		return this;
	}
	public boolean getalertMessage()
	{
		return alertmessage.isDisplayed();
	}
	
}