package uk.co.barclays.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.barclays.utility.Utility;

/*
Created By Bhavesh
*/
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());




    @FindBy (xpath = "//strong[contains(text(),'Quick, safe and convenient')]")
    WebElement _welcomeText;

    public String getWelcomeText(){
        Reporter.log("Getting text from : " + _welcomeText.toString() + "<br>");
        log.info("Getting text from " +_welcomeText.toString());
        return getTextFromElement(_welcomeText);
    }
}
