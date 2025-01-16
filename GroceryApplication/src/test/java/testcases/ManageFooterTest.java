
package testcases;

import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFootTextPage;
import java.io.IOException;
import org.testng.Assert;


public class ManageFooterTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	ManageFootTextPage mfp;
  @Test
  public void verifyManagefootertextUpdatedetails() throws IOException {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mfp=hp.clickonManagefootertext().clickoneditbutton().enterAddressField().enterPhonenumberField().clickonUpdateButton();
	 boolean expectedresult=true;
	boolean  actualresult=mfp.getalertMessage();
	  Assert.assertEquals(actualresult,expectedresult,Constants.MFP_verifyManagefootertextUpdatedetails);
	 
  }
  

}
