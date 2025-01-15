package testcases;

import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;
import java.io.IOException;
import org.testng.Assert;


public class SubcategorytTest extends BaseClass{
	
	LoginPage lp;
	HomePage hp;
	SubCategoryPage scp;
  @Test(priority=1)
  public void AddSubCategory() throws IOException {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  scp=hp.clickOnSubCategoryButton().clickOnNewTabButton().selectCategory().subCategory().chooseFileImage().clickOnSaveButton();
	  boolean actualresult=scp.getAlertMessage();
	  boolean expectedresult=true;
	  Assert.assertEquals(actualresult,expectedresult,Constants.SCP_AddSubCategory );
  }
  @Test(priority=2)
  
  public void searchSubCategory() throws IOException
  {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  scp=hp.clickOnSubCategoryButton().clickOnSearchButton().enterTheSearchItems().clickOnSearchButton2();
	  
  
	  
	  
  }
 
}