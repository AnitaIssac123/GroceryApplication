package testcases;

import org.testng.annotations.Test;
import constants.Constants;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;
import java.io.IOException;
import org.testng.Assert;

public class CategoryTest extends BaseClass {
	
	LoginPage lp;
	HomePage hp;
	CategoryPage ccp;
	
  @Test
  public void verifyUserIsAbleToSearchNonExistingCategory() throws IOException {
	 
	  
	 lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  ccp=hp.clickonCategoryButton().clickonSearchbutton().entercategoryName().clickonSearchButton2();
	  boolean expectedresult=true;
	  boolean actualresult=ccp.checkonresultmessage();
	  Assert.assertEquals(actualresult,expectedresult,Constants.CCP_verifyUserIsAbleToSearchNonExistingCategory);
	  
  }
  @Test(retryAnalyzer=retry.Retry.class)
  public void verifyUserIsAbleToAddNewCategoryWithValidDetails() throws IOException {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  ccp=hp.clickonCategoryButton().clickonNewButton().categoryfield().selectGroups()
			  .choosefile().selectTopmenuradiobutton().selectLeftmenuButton().clickonSaveButton();
		boolean expectedresult=true;
		boolean actualresult=ccp.getAlertMessage();
		Assert.assertEquals(actualresult, expectedresult,Constants.CCP_verifyUserIsAbleToAddNewCategoryWithValidDetails);
	
  }
  
  }
 