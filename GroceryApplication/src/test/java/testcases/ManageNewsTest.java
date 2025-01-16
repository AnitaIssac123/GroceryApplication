package testcases;

import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import java.io.IOException;
import org.testng.Assert;


public class ManageNewsTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	ManageNewsPage mnp;
	
  @Test(priority=1)
  public void verifyonaddingNewManagenewsdetails () throws IOException {
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mnp=hp.clickonManageNews().clickonNewsButton().enterthenewsfield().clickonSaveButton();
	 
		
  }
  @Test(priority=2)
  public void VerifyonsearchingNonexistingnews() throws IOException
  {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mnp=hp.clickonManageNews().clickonSearchButton().enterTitle().clickonSearchNewButton();
	  boolean expectedresult=true;
	  boolean actualresult=mnp.checkonResultnotfoundmessage();
	  Assert.assertEquals(actualresult, expectedresult,Constants.MNP_VerifyonsearchingNonexistingnews);
	  
		
  }
  @Test(priority=3)
  public void verifyonUpdatingNews() throws IOException
  {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mnp=hp.clickonManageNews().clickonResetButton().clickonupdatebutton().enterthenewsfield().clickonUpdateButton3();
	 
	  
  }
  

}
