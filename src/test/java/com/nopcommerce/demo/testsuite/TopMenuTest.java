package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenuPage topMenu = new TopMenuPage();

    @Test
    public void verifyPageNavigation() {
        topMenu.clickOnComputerMenu();
        String actualResult = topMenu.getComputerText();
        String expectedText = "Computers";
        Assert.assertEquals(actualResult, expectedText);
    }
}
