package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

/*
Created By Bhavesh
*/
public class HomePage extends Utility {

    By loginBtn = By.xpath("//a[@class='login btn btn-primary btn-sm']");
    By registerLink = By.xpath("//a[@class='btn-none']");

    public void clickOnLoginButton() {

        clickOnElement(loginBtn);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);

    }


}
