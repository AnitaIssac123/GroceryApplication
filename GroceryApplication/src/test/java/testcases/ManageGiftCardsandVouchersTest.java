package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageGiftCardsandVouchersPage;

public class ManageGiftCardsandVouchersTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	ManageGiftCardsandVouchersPage mgv;
  @Test
  public void verifyUserIsAbleToAddnewAdminUsersInformationsWithValidDatas() throws IOException {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mgv=hp.clickonmanagegiftVoucher().clickonAdminUsersinfofield().clickonNewButton().enterusernamefield().enterpasswordfield().selectusertypefield().clickonSavebutton();
	  boolean expectedresult=true;
	  boolean actualresult=mgv.getAlertmessage();
	  Assert.assertEquals(actualresult, expectedresult,Constants.MGV_verifyUserIsAbleToAddnewAdminUsersInformationsWithValidDatas);
	 
  }
}
