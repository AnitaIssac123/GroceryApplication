package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	LoginPage login;
	HomePage home;
  @Test
  public void loginWithValidCredentials() throws IOException {
	  
	  
	  login=new  LoginPage(driver);
	  home=login.loginByUsingExcelData();
	  boolean actualresult=login.homePagedDisplayed();
	  boolean expectedresult=true;
	  Assert.assertEquals(expectedresult, actualresult, Constants.lp_VerifyLoginWithValidCredentials);
	  
	  
  }
  
  
  @Test(dataProvider="data provider")
  
  public void loginWithInvalidUsernameAndValidPassword(String username,String password)
  {
	  login=new  LoginPage(driver);
	  
	  login.enterUserName(username).enterPassword(password).clickOnLogin();
	  
	  boolean expectedresult=true;
	  boolean actualresult=login.getAlert().contains("Invalid Username/Password");
	  
	  Assert.assertEquals(expectedresult, actualresult,"alert message is not as expected");
	  
  }
  
  @DataProvider(name="data provider")
  
	  public Object[][] dpmethod() 
	  {
		  return new Object[][] {{"admin1","admin"},{"admin2","admin"},{"admin3","admin"}};
	  }
  
  @Test(dataProvider="data provider1")
  
  public void loginWithValidUsernameAndInvalidPassword(String username,String password)
  {
 login=new  LoginPage(driver);
	  
	  login.enterUserName(username).enterPassword(password).clickOnLogin();
	  
	  boolean expectedresult=true;
	  boolean actualresult=login.getAlert().contains("Invalid Username/Password");
	  
	  Assert.assertEquals(expectedresult, actualresult,"alert message is not as expected");
  
  }
  @DataProvider(name="data provider1")
  
  public Object[][] dpmethod1() 
  {
	  return new Object[][] {{"admin","admin12"},{"admin","admin23"},{"admin","admin"}};
  }


@Test(dataProvider="data provider2")


public void loginWithInValidUsernameAndInvalidPassword(String username,String password)
{
login=new  LoginPage(driver);
	  
	  login.enterUserName(username).enterPassword(password).clickOnLogin();
	  
	  
	  boolean expectedresult=true;;
	  boolean actualresult=login.getAlert().contains("Invalid Username/Password");
	  
	  Assert.assertEquals(expectedresult, actualresult,"alert message is not as expected");

}
@DataProvider(name="data provider2")

public Object[][] dpmethod2() 
{
	  return new Object[][] {{"admin1","admin12"},{"admin1","admin23"},{"admin3","admin3"}};
}


}