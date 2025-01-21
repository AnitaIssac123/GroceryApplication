package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;

public class ManageContactTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	ManageContactPage mcpp;
  @Test
  public void verifyUserIsableToUpdateTheContactWithValidDetails() throws IOException {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  
	  mcpp=hp.clickOnManageContactButton().clickOnActionButton().enterPhoneNumber().enterDeliveryTime().enterDeliveryCharge().clickOnUpdateButton();

	boolean expectedresult=true;
	boolean actalresult=mcpp.getalertmessage();
	Assert.assertEquals(actalresult,expectedresult,Constants.MCPP_verifyUserIsableToUpdateTheContactWithValidDetails);
	  
  }
}