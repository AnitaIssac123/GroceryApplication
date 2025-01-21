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
  public void verifyloginWithValidCredentials() throws IOException {
	  
	  
	  login=new  LoginPage(driver);
	  home=login.loginByUsingExcelData();
	  boolean actualresult=login.homePagedDisplayed();
	  boolean expectedresult=true;
	  Assert.assertEquals(expectedresult, actualresult, Constants.lp_VerifyLoginWithValidCredentials);
	  
	  
  }
  
  
  @Test(dataProvider="data provider")
  
  public void verifyLoginWithInvalidUsernameAndValidPassword(String username,String password)
  {
	  login=new  LoginPage(driver);
	  
	 home= login.enterUserName(username).enterPassword(password).clickOnLogin();
	  
	  boolean expectedresult=true;
	  boolean actualresult=login.getAlert().contains("Invalid Username/Password");
	  
	  Assert.assertEquals(expectedresult, actualresult,Constants.lp_verifyLoginWithInvalidUsernameAndValidPassword);
	  
  }
  
  @DataProvider(name="data provider")
  
	  public Object[][] dpmethod() 
	  {
		  return new Object[][] {{"admin567","admin"},{"admin256","admin"},{"admin356","admin"}};
	  }
  
  @Test
  
  public void verifyLoginWithValidUsernameAndInvalidPassword()
  {
	  String username="admin";
	  String password="admin123";
     login=new  LoginPage(driver);
	  
	home=  login.enterUserName(username).enterPassword(password).clickOnLogin();
	  
	  boolean expectedresult=true;
	  boolean actualresult=login.getAlert().contains("Invalid Username/Password");
	  
	  Assert.assertEquals(expectedresult, actualresult,Constants.lp_verifyLoginWithValidUsernameAndInvalidPassword);
  
  }
 


@Test


public void verifyLoginWithInValidUsernameAndInvalidPassword()
{
	
	String username="admin567";
	String password="admin256";
login=new  LoginPage(driver);
	  
	home=  login.enterUserName(username).enterPassword(password).clickOnLogin();
	  
	  
	  boolean expectedresult=true;;
	  boolean actualresult=login.getAlert().contains("Invalid Username/Password");
	  
	  Assert.assertEquals(expectedresult, actualresult,Constants.lp_verifyLoginWithInValidUsernameAndInvalidPassword);

}



}