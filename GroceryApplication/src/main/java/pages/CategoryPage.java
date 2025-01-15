package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GeneralUtilities;

public class CategoryPage {
	
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	
	public CategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()=' Search']")WebElement searchfield;
	@FindBy(xpath="//input[@class='form-control']")WebElement entercategoryname;
	@FindBy(xpath="//button[text()='Search']")WebElement searchname;
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']")WebElement resultnotfoundmessage;
	
	
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

}
