

package testcases;

import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import java.io.IOException;
import org.testng.Assert;


public class ManageCategoryTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	ManageCategoryPage mcp;
	
	
  @Test(retryAnalyzer=retry.Retry.class)
  public void managecategory() throws IOException {
	  
	  lp = new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mcp=hp.clickonManageCategoryButton().clickonNewButton().categoryfield().selectGroups()
			  .choosefile().selectTopmenuradiobutton().selectLeftmenuButton().clickonSaveButton();
		boolean expectedresult=true;
		boolean actualresult=mcp.getAlertMessage();
		Assert.assertEquals(actualresult, expectedresult,Constants.MCP_managecategory);
	
  }
  
}
