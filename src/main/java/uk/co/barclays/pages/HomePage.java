package uk.co.barclays.pages;

import com.sun.xml.internal.ws.wsdl.writer.W3CAddressingMetadataWSDLGeneratorExtension;
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
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(xpath ="//a[@class='login btn btn-primary btn-sm']" )
    WebElement _loginBtn;

    @FindBy(xpath = "//a[@class='btn-none']")
    WebElement _registerLink;

    public void clickOnLoginButton() {
        Reporter.log("clicking on login button : "+ _loginBtn.toString()+"<br>");
        clickOnElement(_loginBtn);
        log.info ("clicking on login button : "+_loginBtn.toString());
    }

    public void clickOnRegisterLink() {
        Reporter.log("clicking on register link : "+ _registerLink.toString()+"<br>");
        clickOnElement(_registerLink);
        log.info("clicking on register link : "+ _registerLink.toString());
    }


}
