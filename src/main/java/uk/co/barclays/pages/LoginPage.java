package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

/*
Created By Bhavesh
*/public class LoginPage extends Utility {


    By welcomeText = By.xpath("//strong[contains(text(),'Quick, safe and convenient')]");


    public String getWelcomeText(){

        return getTextFromElement(welcomeText);
    }
}
