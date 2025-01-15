
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class HomePage {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	 public HomePage(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		 
	 }
	 @FindBy(xpath="//span[text()='7rmart supermarket']") WebElement homePageText;
	 @FindBy(xpath="//p[text()='Sub Category']") WebElement subCategoryButton;
	 @FindBy(xpath="//p[text()='Manage Category']")WebElement managecategorybutton;
	 @FindBy(xpath="//p[text()='Manage Contact']") WebElement managecontactbutton;
	 @FindBy(xpath="//p[text()='Manage Footer Text']")WebElement managefootertextbutton;
	 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/' and@class='active nav-link']")WebElement managecardandvoucherbutton;
	 @FindBy(xpath="//p[text()='Manage News']")WebElement managenewsbutton;
	 @FindBy(xpath="//p[text()='Category']")WebElement categoryfield;
	 
	 public String getHomePageText()
	 {
		 return homePageText.getText();
	 }
	 public SubCategoryPage clickOnSubCategoryButton()
	 
	 {
		 subCategoryButton.click();
		 return new SubCategoryPage(driver);
	 }
	 public ManageCategoryPage clickonManageCategoryButton()
		{
		 managecategorybutton.click();
		   // gu.clickOnElement(managecategorybutton);
			return new  ManageCategoryPage(driver);
		}
	 public ManageContactPage clickOnManageContactButton() {
			
			managecontactbutton.click();
			return new ManageContactPage(driver);
		}
	 public ManageFootTextPage clickonManagefootertext()
		{
			managefootertextbutton.click();
			return new ManageFootTextPage(driver);
		}
	 public ManageGiftCardsandVouchersPage clickonmanagegiftVoucher()
		
		{
			managecardandvoucherbutton.click();
			return new ManageGiftCardsandVouchersPage(driver);
		}
	 public ManageNewsPage clickonManageNews()
		{
			managenewsbutton.click();
			return new ManageNewsPage (driver);
		}
	 public CategoryPage clickonCategoryButton() {
			categoryfield.click();
			return new CategoryPage(driver);
			
		}

}
