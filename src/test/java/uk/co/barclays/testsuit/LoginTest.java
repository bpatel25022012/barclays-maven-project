package uk.co.barclays.testsuit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.LoginPage;
import uk.co.barclays.testbase.TestBase;

/*
Created By Bhavesh
*/
public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod (groups = "regression")
    public void setUp(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

@Test (groups = "regression")
    public void userShouldNavigateToLoginPage(){

    homePage.clickOnLoginButton();
    String expectedText = "Quick, safe and convenient";
    String actualText = loginPage.getWelcomeText();
    Assert.assertEquals(expectedText, actualText);
}


}
