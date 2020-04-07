package uk.co.barclays.testbase;

import org.testng.annotations.AfterMethod;
import uk.co.barclays.basepage.BasePage;
import org.openqa.selenium.Point;
import org.testng.annotations.BeforeMethod;
import uk.co.barclays.browserselector.BrowserSelector;

import java.util.concurrent.TimeUnit;

/*
Created By Bhavesh
*/public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://www.barclays.co.uk/";

    @BeforeMethod
    public void openBrowser(){

        browserSelector.selectBrowser("chrome");
        driver.manage().window().setPosition(new Point(-2000, 0));//display into second screen
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}